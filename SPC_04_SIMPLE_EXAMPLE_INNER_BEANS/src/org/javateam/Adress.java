/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:16:14 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Adress {

	private int zipcode;
	private String countery;
	private String city;
	private ContactDetails contactdetails;
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setContactdetails(ContactDetails contactdetails) {
		this.contactdetails = contactdetails;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [zipcode=" + zipcode + ", countery=" + countery + ", city=" + city + ", contactdetails="
				+ contactdetails + "]";
	}
	
}
