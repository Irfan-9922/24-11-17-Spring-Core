/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:26:33 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Vichel implements ApplicationContextAware {
	
	private int engg;
	 private ApplicationContext ctx;

	public void setEngg(int engg) {
		this.engg = engg;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vichel [engg=" + engg + "]";
	}

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx=ctx;
		
	}
	public void move(){
		/*FileSystemResource res=new FileSystemResource("src/org/javateam/cfg/configuration.xml");
		BeanFactory fac=new XmlBeanFactory(res);
		Engine e=(Engine) fac.getBean("adress");
		
		e.engstart();
		System.out.println("bike is running");*/
		
		
		Engine e=(Engine) ctx.getBean("engg");
		e.engstart();
	}
	
}
