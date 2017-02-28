/**
 * 
 */
package com.test.main;

import com.test.inter.Person;

/**
 * @author Administrator
 *
 */
public class Main {
	private Person person;
	
	public void eat() {
		person.eat();
	}
	
	public void drink() {
		person.drink();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
