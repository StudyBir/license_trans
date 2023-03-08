package com.cp.license.trans.config;

import java.util.ArrayList;
import java.util.List;

import com.cp.license.trans.bo.License_Transmit;

public class LicenseConfig {
	
	private static final List<License_Transmit> license = new ArrayList<>();
	
	static {
		license.add(new License_Transmit("license1",8717));
		license.add(new License_Transmit("license2",8717));
	}
	
	public static List<License_Transmit> getlicense() {
		return license;
	}

}
