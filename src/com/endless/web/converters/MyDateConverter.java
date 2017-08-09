package com.endless.web.converters;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {
	private String format;

	@Override
	public Date convert(String date) {
		System.out.println("text:"+date);
		SimpleDateFormat sf = new SimpleDateFormat(format);
		try {
			return sf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
