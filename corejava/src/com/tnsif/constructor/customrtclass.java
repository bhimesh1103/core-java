package com.tnsif.constructor;

public class customrtclass {
	private String cname;
	private String cid;
	private String caddress;
	public customrtclass() {
	

}
	public customrtclass(String cname, String caddress) {
		super();
		this.cname = cname;
		this.cid=cid;
		this.caddress = caddress;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
}