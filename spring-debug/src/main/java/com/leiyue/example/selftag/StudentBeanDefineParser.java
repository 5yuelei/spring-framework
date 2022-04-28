package com.leiyue.example.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class StudentBeanDefineParser extends AbstractSingleBeanDefinitionParser {

	protected Class<?> getBeanClass(Element element) {
		return Student.class;
	}

	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String name = element.getAttribute("name");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(name)){
			builder.addPropertyValue("name",name);
		}
		if (StringUtils.hasText(email)){
			builder.addPropertyValue("email",email);
		}
	}
}
