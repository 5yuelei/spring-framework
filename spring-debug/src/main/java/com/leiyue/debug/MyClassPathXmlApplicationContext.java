package com.leiyue.debug;

import com.leiyue.example.beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
	}
}
