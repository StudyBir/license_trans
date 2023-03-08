package com.cp.license.trans.model;

public class License_Apply {

	private int Id;
	private String LicenseName;
	private String Ip;
	private String BeginTime;
	private String EndTime;

	public License_Apply() {
		super();
	}

	public License_Apply(int id, String licenseName, String ip, String beginTime, String endTime) {
		super();
		Id = id;
		LicenseName = licenseName;
		Ip = ip;
		BeginTime = beginTime;
		EndTime = endTime;
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

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getBeginTime() {
		return BeginTime;
	}

	public void setBeginTime(String beginTime) {
		BeginTime = beginTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	@Override
	public String toString() {
		return "License_Apply [Id=" + Id + ", LicenseName=" + LicenseName + ", Ip=" + Ip + ", BeginTime=" + BeginTime
				+ ", EndTime=" + EndTime + "]";
	}

}
