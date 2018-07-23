/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:23:14 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Adress {
	private int zipcode;
	private String countery;
	private String city;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [zipcode=" + zipcode + ", countery=" + countery + ", city=" + city + "]";
	}

	public Adress(int zipcode, String countery, String city) {
		super();
		this.zipcode = zipcode;
		this.countery = countery;
		this.city = city;
	}
	

}
