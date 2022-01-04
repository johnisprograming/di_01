package com.di.spring_di_xml_setter_ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context4.xml");
		
		// 빈 가져오기
		TV tv = context.getBean("tv", TV.class);
		tv.volumeUp();
		tv.volumeDown();
		context.close();
	}

}