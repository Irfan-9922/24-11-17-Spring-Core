/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:56:33 pm
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Student {
	private int studentId;
	private String studentName;
	private int classs;

	
	
	@Autowired
	private Adress adress;
	@Autowired
	private Adress adress1;
	public void setAdress1(Adress adress1) {
		this.adress1 = adress1;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getClasss() {
		return classs;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setClasss(int classs) {
		this.classs = classs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", classs=" + classs + ", adress="
				+ adress + ", adress1=" + adress1 + "]";
	}
public void printme(){
	System.out.println("student adress"+getAdress());
	System.out.println("student adress"+getAdress().getContact());
	
}
	
	
}
