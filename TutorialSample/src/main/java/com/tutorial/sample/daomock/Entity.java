package com.tutorial.sample.daomock;

public class Entity {
private String fName;
private String lName;

Entity(){
	
}
Entity(String fName,String lName){
	this.fName=fName;
	this.lName=lName;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
}
