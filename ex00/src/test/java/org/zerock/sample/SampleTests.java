package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Setter(onMethod_ = { @Autowired })
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		//given
		
		//when
		
		//then
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------------------");
		log.info(restaurant.getChef());
	}
	
	@Test
	public void testJava() {
		Chef aaa = new Chef();
		log.info(aaa);
	}
}
