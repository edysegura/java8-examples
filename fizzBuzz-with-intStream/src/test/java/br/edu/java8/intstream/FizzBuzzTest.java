package br.edu.java8.intstream;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void should_return_empty_string_if_there_is_no_divisor() {
		assertEquals("", FizzBuzz.getWord(1));
	}
	
	@Test
	public void should_return_fizz_if_divided_by_5() {
		assertEquals("fizz", FizzBuzz.getWord(5));
	}
	
	@Test
	public void should_return_buzz_if_divided_by_7() {
		assertEquals("buzz", FizzBuzz.getWord(7));
	}
	
	@Test
	public void should_return_fizzBuzz_if_divided_by_5_and_by_7() {
		fail("To be implemented!");
	}

}
