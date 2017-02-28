/**
 * 
 */
package com.test.impl;

import com.test.inter.Person;

/**
 * @author Administrator
 *
 */
public class SouthPerson implements Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("南方人====吃====南方");
	}

	/* (non-Javadoc)
	 * @see com.test.inter.Person#drink()
	 */
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("南方人====吃====南方");
	}

}
