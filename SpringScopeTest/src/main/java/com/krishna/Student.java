package com.krishna;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("")
public class Student {
	
	public Student() {
		System.out.println("Constructor Called");
	}
	
	private String sId;
	private String sName;
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	

}
