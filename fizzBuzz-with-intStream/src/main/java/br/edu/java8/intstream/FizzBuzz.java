package br.edu.java8.intstream;

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
		
		return word;
	}
	
	public static void fizzBuzzBeforeJava8(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i + ": " + FizzBuzz.getWord(i));
		}
	}
	
	public static void fizzBuzzInJava8(int num) {
		
	}

	public static void main(String[] args) {
		System.out.println("FizzBuzz game!");
		FizzBuzz.fizzBuzzBeforeJava8(100);
	}
}
