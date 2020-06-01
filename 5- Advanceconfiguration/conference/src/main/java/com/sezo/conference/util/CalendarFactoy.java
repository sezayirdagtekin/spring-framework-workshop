package com.sezo.conference.util;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoy implements FactoryBean<Calendar> {
	private Calendar instance = Calendar.getInstance();

	@Override
	public Calendar getObject() throws Exception {

		return instance;
	}

	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}

	public void addDays(int nums) {
		instance.add(Calendar.DAY_OF_YEAR, nums);
	}
}
