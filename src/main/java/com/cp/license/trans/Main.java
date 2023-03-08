package com.cp.license.trans;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import com.cp.license.trans.bo.License_Transmit;
import com.cp.license.trans.config.LicenseConfig;
import com.cp.license.trans.thread.TransMessage;

public class Main {

	public static void main(String[] args) throws ParseException {
		List<License_Transmit> list = LicenseConfig.getlicense();
		Iterator<License_Transmit> it = list.iterator();
		while(it.hasNext()) {
			License_Transmit lt = it.next();
			new Thread(new TransMessage(lt)).start();
		}

	}

}
