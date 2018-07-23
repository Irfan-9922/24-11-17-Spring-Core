/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * NAME:shaikh irfan
 *
 * TIME:4:43:51 pm
 *DATE:26-Nov-2017
 *TAGS:
 */
public class PostProcessor implements BeanPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization after initilization"+arg0.getClass().toString());
		// TODO Auto-generated method stub
		String a=arg1;
		System.out.println("name of the bean"+a);
		
		
		return arg0;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization befor initilization"+arg0.getClass().toString());
		String a=arg1;
		System.out.println("name of the bean"+a);
		
		return arg0;
	}

}
