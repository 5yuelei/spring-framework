package com.leiyue.example.beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanDefinition implements BeanDefinitionRegistryPostProcessor, Ordered {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("---------mybeandefiniton--postProcessBeanFactory----------");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("---------mybeandefiniton--postProcessBeanDefinitionRegistry----------");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
