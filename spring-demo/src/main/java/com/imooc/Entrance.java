/**
 * @(#)Entrance.java, 12月 11, 2020.
 * <p>
 * Copyright 2020 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.imooc;

import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author tianyu
 */
public class Entrance {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String xmlPath = "//Users/tianyu/StudyIdeaProjects/spring-framework-5.2.12.RELEASE/spring-demo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = applicationContext.getBean("welcomeService", WelcomeService.class);
		welcomeService.sayHello("tianyu");
	}
}