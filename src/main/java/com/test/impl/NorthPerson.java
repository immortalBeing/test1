/**
 * 
 */
package com.test.impl;

import com.test.inter.Person;

/**
 * @author Administrator
 *
 */
public class NorthPerson implements Person {

	@Override
	public void eat() {
		System.out.println("北方人====吃====南方");
	}

	/* (non-Javadoc)
	 * @see com.test.inter.Person#drink()
	 */
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("北方人====喝===北方");
	}

}
