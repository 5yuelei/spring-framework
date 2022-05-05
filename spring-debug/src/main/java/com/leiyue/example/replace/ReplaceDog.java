package com.leiyue.example.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceDog implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("A dog god");
		for (Object arg : args) {
			System.out.println("参数：" + arg);
		}
		return obj;
	}
}
