package com.cp.license.trans.bo;

public class License_Transmit {

	private String name;
	private String port;

	public License_Transmit() {
		super();
	}

	public License_Transmit(String name, String port) {
		super();
		this.name = name;
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "License_Transmit [name=" + name + ", port=" + port + "]";
	}

}
