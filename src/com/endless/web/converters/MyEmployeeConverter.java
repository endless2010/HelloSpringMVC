package com.endless.web.converters;

import org.springframework.core.convert.converter.Converter;

public class MyEmployeeConverter implements Converter<String,Employee>{
	
	@Override
	public Employee convert(String employee) {
		System.out.println("emploee:"+employee);
		String[] values=employee.split(",");
		return new Employee(values[0],values[1]);
	}

}
