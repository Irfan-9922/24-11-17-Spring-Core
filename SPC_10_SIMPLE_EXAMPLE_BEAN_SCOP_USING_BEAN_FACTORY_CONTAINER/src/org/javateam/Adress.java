/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import java.util.List;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:16:14 am DATE:22-Nov-2017 TAGS:
 */
public class Adress {

	private int zipcode;
	private String countery;
	private List city;
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public void setCity(List city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [zipcode=" + zipcode + ", countery=" + countery + ", city=" + city + "]";
	}

	

}
