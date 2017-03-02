package br.edu.java8.intstream;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void should_return_the_same_provided_number_as_a_string_if_it_is_not_multiple_of_5_or_7() {
		assertEquals("1", FizzBuzz.getWord(1));
		assertEquals("6", FizzBuzz.getWord(6));
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
