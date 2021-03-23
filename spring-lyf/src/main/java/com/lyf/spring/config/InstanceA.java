package com.lyf.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author lyf
 * @Date 2021-03-18 15:05
 * @Description:
 */

public class InstanceA {
	private InstanceB b;

	public InstanceB getB() {
		return b;
	}

	public void setB(InstanceB b) {
		this.b = b;
	}
}
