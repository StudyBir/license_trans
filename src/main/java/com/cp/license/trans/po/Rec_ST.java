package com.cp.license.trans.po;

import java.util.Date;

public class Rec_ST {

	private int Id;
	private Byte Stra1Acc;
	private int LimitTime;
	private Byte Stra2Acc;
	private Date RecoverTime;

	public Rec_ST() {
		super();
	}

	public Rec_ST(int id, Byte stra1Acc, int limitTime, Byte stra2Acc, Date recoverTime) {
		super();
		Id = id;
		Stra1Acc = stra1Acc;
		LimitTime = limitTime;
		Stra2Acc = stra2Acc;
		RecoverTime = recoverTime;
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

	public int getLimitTime() {
		return LimitTime;
	}

	public void setLimitTime(int limitTime) {
		LimitTime = limitTime;
	}

	public Byte getStra2Acc() {
		return Stra2Acc;
	}

	public void setStra2Acc(Byte stra2Acc) {
		Stra2Acc = stra2Acc;
	}

	public Date getRecoverTime() {
		return RecoverTime;
	}

	public void setRecoverTime(Date recoverTime) {
		RecoverTime = recoverTime;
	}

	@Override
	public String toString() {
		return "Rec_ST [Id=" + Id + ", Stra1Acc=" + Stra1Acc + ", LimitTime=" + LimitTime + ", Stra2Acc=" + Stra2Acc
				+ ", RecoverTime=" + RecoverTime + "]";
	}

}
