package com.main.o2oCrud.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
  private int sid;
  private String name; 
  @OneToOne(cascade = CascadeType.ALL)
  private Address addr;
  private String uname;
  private String pword;
  
  
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPword() {
	return pword;
}
public void setPword(String pword) {
	this.pword = pword;
}
    
}
