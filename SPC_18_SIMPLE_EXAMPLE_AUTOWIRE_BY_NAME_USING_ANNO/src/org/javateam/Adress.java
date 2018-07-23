/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:56:47 pm
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Adress {
	private String countery;
	private String city;
	@Autowired
	private Contact contact;
	@Autowired
	private Contact contact1;
	public Contact getContact1() {
		return contact1;
	}
	public void setContact1(Contact contact1) {
		this.contact1 = contact1;
	}
	public String getCountery() {
		return countery;
	}
	public String getCity() {
		return city;
	}
	public Contact getContact() {
		return contact;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [countery=" + countery + ", city=" + city + ", contact=" + contact + ", contact1=" + contact1
				+ "]";
	}
	

}
