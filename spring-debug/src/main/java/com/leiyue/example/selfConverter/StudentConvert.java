package com.leiyue.example.selfConverter;

import org.springframework.core.convert.converter.Converter;

public class StudentConvert implements Converter<String ,Student> {
	@Override
	public Student convert(String source) {
		System.out.println("start convert -----------");
		Student student = new Student();
		String[] split = source.split(",");
		student.setId(Integer.parseInt(split[0]));
		student.setName(split[1]);
		return student;
	}
}
