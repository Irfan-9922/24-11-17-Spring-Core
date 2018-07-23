/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:57:04 pm
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Contact {
	private int phno;
	private String mailId;
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [phno=" + phno + ", mailId=" + mailId + "]";
	}
	

}
