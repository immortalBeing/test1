/**
 * 
 */
package com.test.javaConfig;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
public class SgtCompact implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Java����==װ��Bean===SgtCompact");
	}

}
