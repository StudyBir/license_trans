package com.cp.license.trans.model;

import java.io.Serializable;

public class License implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Id;
	private String LicenseName;
	private String LicenseIP;
	private int LicensePort;
	private int LicenseAccNum;
	private int AstId;
	private int RstId;

	public License() {
		super();
	}

	public License(int id, String licenseName, String licenseIP, int licensePort, int licenseAccNum, int astId,
			int rstId) {
		super();
		Id = id;
		LicenseName = licenseName;
		LicenseIP = licenseIP;
		LicensePort = licensePort;
		LicenseAccNum = licenseAccNum;
		AstId = astId;
		RstId = rstId;
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

	public int getLicensePort() {
		return LicensePort;
	}

	public void setLicensePort(int licensePort) {
		LicensePort = licensePort;
	}

	public int getLicenseAccNum() {
		return LicenseAccNum;
	}

	public void setLicenseAccNum(int licenseAccNum) {
		LicenseAccNum = licenseAccNum;
	}

	public int getAstId() {
		return AstId;
	}

	public void setAstId(int astId) {
		AstId = astId;
	}

	public int getRstId() {
		return RstId;
	}

	public void setRstId(int rstId) {
		RstId = rstId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "License [Id=" + Id + ", LicenseName=" + LicenseName + ", LicenseIP=" + LicenseIP + ", LicensePort="
				+ LicensePort + ", LicenseAccNum=" + LicenseAccNum + ", AstId=" + AstId + ", RstId=" + RstId + "]";
	}

}
