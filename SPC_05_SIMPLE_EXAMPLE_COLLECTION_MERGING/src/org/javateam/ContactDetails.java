/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import java.util.Set;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:46:43 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class ContactDetails {
	private Set moNo;
	private int landLineNo;
	
	public void setMoNo(Set moNo) {
		this.moNo = moNo;
	}

	public void setLandLineNo(int landLineNo) {
		this.landLineNo = landLineNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactDetails [moNo=" + moNo + ", landLineNo=" + landLineNo + ", emailId=" + emailId + "]";
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	private String emailId;
	

}
