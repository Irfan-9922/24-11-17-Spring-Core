/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.test;

import org.javateam.Vichel;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * NAME:shaikh irfan
 *
 * TIME:10:27:50 am
 *DATE:22-Nov-2017
 *TAGS:
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/org/javateam/cfg/configuration.xml");
		Vichel s=(Vichel) ctx.getBean("vichel");
		s.move();
		System.out.println(s);
		
		
	}
	

}
