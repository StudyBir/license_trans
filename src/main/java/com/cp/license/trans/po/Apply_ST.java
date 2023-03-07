package com.cp.license.trans.po;

import java.util.Date;

public class Apply_ST {
	private int Id;
	private Byte Stra1Acc;
	private String HeadIP;
	private String EndIP;
	private Byte Stra2Acc;
	private Date BeginTime;
	private Date EndTime;
	
	public Apply_ST() {
		super();
	}

	public Apply_ST(int id, Byte stra1Acc, String headIP, String endIP, Byte stra2Acc, Date beginTime, Date endTime) {
		super();
		Id = id;
		Stra1Acc = stra1Acc;
		HeadIP = headIP;
		EndIP = endIP;
		Stra2Acc = stra2Acc;
		BeginTime = beginTime;
		EndTime = endTime;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Byte getStra1Acc() {
		return Stra1Acc;
	}

	public void setStra1Acc(Byte stra1Acc) {
		Stra1Acc = stra1Acc;
	}

	public String getHeadIP() {
		return HeadIP;
	}

	public void setHeadIP(String headIP) {
		HeadIP = headIP;
	}

	public String getEndIP() {
		return EndIP;
	}

	public void setEndIP(String endIP) {
		EndIP = endIP;
	}

	public Byte getStra2Acc() {
		return Stra2Acc;
	}

	public void setStra2Acc(Byte stra2Acc) {
		Stra2Acc = stra2Acc;
	}

	public Date getBeginTime() {
		return BeginTime;
	}

	public void setBeginTime(Date beginTime) {
		BeginTime = beginTime;
	}

	public Date getEndTime() {
		return EndTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}

	@Override
	public String toString() {
		return "Apply_ST [Id=" + Id + ", Stra1Acc=" + Stra1Acc + ", HeadIP=" + HeadIP + ", EndIP=" + EndIP
				+ ", Stra2Acc=" + Stra2Acc + ", BeginTime=" + BeginTime + ", EndTime=" + EndTime + "]";
	}
	
}
