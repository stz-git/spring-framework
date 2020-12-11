/**
 * @(#)WelcomeServiceImpl.java, 12月 11, 2020.
 * <p>
 * Copyright 2020 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.imooc.service.impl;

import com.imooc.service.WelcomeService;

/**
 * @author tianyu
 */
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("Welcome!" + name);
		return "success";
	}
}