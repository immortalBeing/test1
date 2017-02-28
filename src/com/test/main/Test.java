/**
 * 
 */
package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dispather.xml");
		Main main = ac.getBean(Main.class);
		main.drink();
		main.eat();
//		Main main = FileSystemXmlApplicationContext
	}
}
