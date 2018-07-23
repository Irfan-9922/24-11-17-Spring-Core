/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.test;

import java.applet.AppletContext;

import org.javateam.Student;
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
		/*FileSystemResource res=new FileSystemResource("src/org/javateam/cfg/configuration.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Student s=(Student) factory.getBean("sample");*/
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/org/javateam/cfg/configuration.xml");
		Student s=(Student) ctx.getBean("sample");
		System.out.println(s);
		
		Student s2=(Student) ctx.getBean("sample");
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
	

}
