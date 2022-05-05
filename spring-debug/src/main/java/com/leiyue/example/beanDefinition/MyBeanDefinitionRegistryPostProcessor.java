package com.leiyue.example.beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("-----------MyBeanDefinitionRegistryPostProcessor------------");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(MyBeanDefinition.class);
		beanDefinitionBuilder.addPropertyValue("name","leiyue");
		registry.registerBeanDefinition("user",beanDefinitionBuilder.getBeanDefinition());
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
