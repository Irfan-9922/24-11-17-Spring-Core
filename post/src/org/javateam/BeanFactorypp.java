/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;

/**
 * NAME:shaikh irfan
 *
 * TIME:5:07:41 pm
 *DATE:26-Nov-2017
 *TAGS:
 */
public class BeanFactorypp implements BeanFactoryPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory bean) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("post processor bean factory exicuted");
		BeanDefinition d=bean.getBeanDefinition("adress");
		System.out.println(d.SCOPE_SINGLETON);
	             MutablePropertyValues h = d.getPropertyValues();
	             h.add("zipcode", "19288888");
		
	}

}
