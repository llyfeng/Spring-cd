package com.lyf.spring.doSomething;

import com.lyf.spring.config.InstanceA;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lyf
 * @Date 2021-03-11 16:05
 * @Description:
 */
public class SpringTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LyfConfig.class);

		ApplicationContext xc = new ClassPathXmlApplicationContext("aa.xml");


		InstanceA instanceA = xc.getBean(InstanceA.class);
		System.out.println(instanceA.getB().getA());

	}


}
