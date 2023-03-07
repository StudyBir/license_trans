package com.cp.license.trans.model;

import java.io.Serializable;

public class License implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int Id;
	private String LicenseName;
	private String LicenseIP;
	private String LicensePort;
	private int LicenseAccNum;
	
	public License() {
		super();
	}

	public License(int id, String licenseName, String licenseIP, String licensePort, int licenseAccNum) {
		super();
		Id = id;
		LicenseName = licenseName;
		LicenseIP = licenseIP;
		LicensePort = licensePort;
		LicenseAccNum = licenseAccNum;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLicenseName() {
		return LicenseName;
	}

	public void setLicenseName(String licenseName) {
		LicenseName = licenseName;
	}

	public String getLicenseIP() {
		return LicenseIP;
	}

	public void setLicenseIP(String licenseIP) {
		LicenseIP = licenseIP;
	}

	public String getLicensePort() {
		return LicensePort;
	}

	public void setLicensePort(String licensePort) {
		LicensePort = licensePort;
	}

	public int getLicenseAccNum() {
		return LicenseAccNum;
	}

	public void setLicenseAccNum(int licenseAccNum) {
		LicenseAccNum = licenseAccNum;
	}

	@Override
	public String toString() {
		return "License [Id=" + Id + ", LicenseName=" + LicenseName + ", LicenseIP=" + LicenseIP + ", LicensePort="
				+ LicensePort + ", LicenseAccNum=" + LicenseAccNum + "]";
	}

}
