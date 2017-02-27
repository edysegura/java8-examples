package br.edu.java8.intstream;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void should_return_empty_string_if_there_is_no_divisor() {
		assertEquals("", FizzBuzz.getWord(1));
		assertEquals("", FizzBuzz.getWord(6));
	}
	
	@Test
	public void should_return_Fizz_if_divided_by_5() {
		assertEquals("Fizz", FizzBuzz.getWord(5));
	}
	
	@Test
	public void should_return_Buzz_if_divided_by_7() {
		assertEquals("Buzz", FizzBuzz.getWord(7));
	}
	
	@Test
	public void should_return_FizzBuzz_if_divided_by_5_and_by_7() {
		assertEquals("FizzBuzz", FizzBuzz.getWord(35));
		assertEquals("FizzBuzz", FizzBuzz.getWord(70));
	}

}
