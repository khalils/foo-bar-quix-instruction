package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.FooBarQuixService

@SpringBootTest
class FooBarQuixApplicationTests {

	val fooBarQuixService = FooBarQuixService();
	
	@Test
	fun contextLoads() {
	}
	
	@Test
	fun testFooBarQuixShouldReturn1() {
		assertEquals("1",fooBarQuixService.convertNumber(1))
	}

}
