package com.cp.license.trans.thread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import com.cp.license.trans.bo.License_Transmit;
import com.cp.license.trans.model.Apply_ST;
import com.cp.license.trans.model.License;
import com.cp.license.trans.utils.ApplyUtils;
import com.cp.license.trans.utils.Apply_STUtils;
import com.cp.license.trans.utils.LicenseUtils;
import com.cp.license.trans.utils.License_ApplyUtils;

public class TransMessage implements Runnable {

	private License_Transmit license_Transmit;

	public TransMessage(License_Transmit license_Transmit) {
		super();
		this.license_Transmit = license_Transmit;
	}

	@Override
	public void run(){
		//为该license服务开启socket转发服务
		try {
			ServerSocket server = new ServerSocket(license_Transmit.getPort());
			while(true) {
				Socket socket = server.accept();
				License license = LicenseUtils.findByName(license_Transmit.getName());
				if(license == null) {
					continue;
				}
				Apply_ST ast = Apply_STUtils.findByName(license_Transmit.getName());
				if(ast == null) {
					continue;
				}
				if(ast.getStra1Acc() == 1) {
					String HeadIp = ast.getHeadIP();
					String EndIp = ast.getEndIP();
					if(!ApplyUtils.ipIsSpecifyRange(HeadIp, EndIp, socket.getInetAddress().toString())) {
						continue;
					}
				}
				if(ast.getStra2Acc() == 1) {
					Date BeginTime = ast.getBeginTime();
					Date EndTime = ast.getEndTime();
					if(!ApplyUtils.belongCalendar(BeginTime, EndTime)) {
						continue;
					}
				}
				int useCount = License_ApplyUtils.useCount(license_Transmit.getName());
				if(useCount >= license.getLicenseAccNum()) {
					continue;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
