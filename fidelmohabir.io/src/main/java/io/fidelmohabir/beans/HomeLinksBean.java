package io.fidelmohabir.beans;

import java.io.Serializable;

public class HomeLinksBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String linkName;
	private String linkAddr;
	
	public HomeLinksBean() {

	}
	
	public String getName() {
		return this.linkName;
	}
	
	public void setName(String name) {
		this.linkName = name;
	}
	
	public String getAddr() {
		return this.linkAddr;
	}
	
	public void setAddr(String addr) {
		this.linkAddr = addr;
	}
	
}
