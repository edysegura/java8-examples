package br.edu.java8.intstream;

import java.util.stream.IntStream;

public class FizzBuzz {
	
	public static String getWord(int number) {
		String word = "";
		
		if(number % 5 == 0 && number % 7 == 0) {
			word = "FizzBuzz";
		}
		else if(number % 5 == 0) {
			word = "Fizz";
		}
		else if(number % 7 == 0) {
			word = "Buzz";
		}
		else {
			word = String.valueOf(number);
		}
		
		return word;
	}
	
	public static void fizzBuzzBeforeJava8(int maxNumber) {
		for (int i = 1; i <= maxNumber; i++) {
			System.out.println(i + ": " + FizzBuzz.getWord(i));
		}
	}
	
	public static void fizzBuzzInJava8(int maxNumber) {
		IntStream.rangeClosed(1, maxNumber)
			.mapToObj(number -> FizzBuzz.getWord(number))
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		System.out.println("FizzBuzz game!");
		//FizzBuzz.fizzBuzzBeforeJava8(100);
		FizzBuzz.fizzBuzzInJava8(100);
	}
}
