package com.lyf.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author lyf
 * @Date 2021-03-18 15:05
 * @Description:
 */

public class InstanceB {

	private InstanceA a;

	public InstanceA getA() {
		return a;
	}

	public void setA(InstanceA a) {
		this.a = a;
	}
}
