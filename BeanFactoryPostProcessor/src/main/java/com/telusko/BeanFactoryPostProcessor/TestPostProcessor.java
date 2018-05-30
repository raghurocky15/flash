package com.telusko.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class TestPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("dbconfigBean");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		
		propertyValues.addPropertyValue("welcomeNote", "This is modified by the welcomeNote value by using PostProcessor");
		
		
	}

}
