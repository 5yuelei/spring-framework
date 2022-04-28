package com.leiyue.debug;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}
//
//	@Override
//	protected void initPropertySources() {
//		ConfigurableEnvironment environment = getEnvironment();
//		environment.setRequiredProperties("OS");
//	}
//
//	@Override
//	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		super.setAllowBeanDefinitionOverriding(true);
//		super.setAllowCircularReferences(true);
//		super.customizeBeanFactory(beanFactory);
//	}
}
