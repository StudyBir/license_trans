package com.cp.license.trans.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cp.license.trans.model.License;
import com.cp.license.trans.model.License_Apply;
import com.cp.license.trans.utils.License_ApplyUtils;

public class TransMessageServer implements Runnable {

	private License license;
	private Socket socket;
	private Socket license_server;

	public TransMessageServer(License license, Socket socket) {
		super();
		this.license = license;
		this.socket = socket;
	}

	@SuppressWarnings("unused")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 存储License服务申请信息
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		License_Apply la = new License_Apply(0, license.getLicenseName(), socket.getInetAddress().toString(),
				sdf.format(new Date()), null);
		try {
			// 连接License服务器并获取其输入输出流
			license_server = new Socket(license.getLicenseIP(), license.getLicensePort());
			InputStream server_is = license_server.getInputStream();
			BufferedReader server_in = new BufferedReader(new InputStreamReader(server_is));
			OutputStream server_os = license_server.getOutputStream();
			PrintWriter server_out = new PrintWriter(server_os);
			// 获取客户端的输入输出流
			InputStream client_is = socket.getInputStream();
			BufferedReader client_in = new BufferedReader(new InputStreamReader(server_is));
			OutputStream client_os = socket.getOutputStream();
			PrintWriter client_out = new PrintWriter(server_os);
			License_ApplyUtils.insert(la);
			new Thread() {
				public void run() {
					try {
						String server_str;
						while ((server_str = server_in.readLine()) != null) {
							client_out.println(server_str);
							client_out.flush();
						}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}.start();
			String client_str;
			while ((client_str = client_in.readLine()) != null) {
				server_out.println(client_str);
				server_out.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.shutdownOutput();
				socket.shutdownOutput();
				license_server.shutdownInput();
				license_server.shutdownOutput();
				socket.close();
				license_server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				License_ApplyUtils.update(la.getId(), sdf.format(new Date()));
			}
		}
	}

}
