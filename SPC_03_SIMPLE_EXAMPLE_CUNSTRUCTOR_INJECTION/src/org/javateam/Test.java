/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		FileSystemResource res=new FileSystemResource("src/configuration.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Student s=(Student) factory.getBean("sample");
		System.out.println(s);
		
		
	}
	

}
