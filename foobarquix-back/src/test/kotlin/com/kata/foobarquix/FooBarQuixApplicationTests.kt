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
	@Test
	fun testFooBarQuixShouldReturnFooFoo() {
		assertEquals("FooFoo",fooBarQuixService.convertNumber(3))
	}
	@Test
	fun testFooBarQuixShouldReturnBarBar() {
		assertEquals("BarBar",fooBarQuixService.convertNumber(5))
	}
	@Test
	fun testFooBarQuixShouldReturnQuix() {
		assertEquals("Quix",fooBarQuixService.convertNumber(7))
	}
	@Test
	fun testFooBarQuixShouldReturnFoo() {
		assertEquals("Foo",fooBarQuixService.convertNumber(9))
	}
	@Test
	fun testFooBarQuixShouldReturnFooBar() {
		assertEquals("FooBar",fooBarQuixService.convertNumber(51))
	}

}
