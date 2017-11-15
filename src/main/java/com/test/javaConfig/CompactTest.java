/**
 * 
 */
package com.test.javaConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactConfig.class)
public class CompactTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	BjYbOptionsHelp help;
	
	@Test
	public void test() {
		cd.play();
		help.getKeyValue("010106");
	}
}
