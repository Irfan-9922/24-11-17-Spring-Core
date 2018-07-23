/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:26:33 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Student {
	
	private String name;
	private int id;
	private Adress adress;
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adress=" + adress + "]";
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
}
