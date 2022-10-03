//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		String answer = JOptionPane.showInputDialog("pick a number");
		int numberOfCompliments=Integer.parseInt(answer);
	for (randomNumber =0; randomNumber <numberOfCompliments; randomNumber ++) {	
if (randomNumber ==0) {
	System.out.println("I like your hair");
} else if (randomNumber ==1) {
	System.out.println("I like your shirt");
} else if (randomNumber ==2) {
	System.out.println("your shoes look really cool");
} else if (randomNumber ==3) {
	System.out.println("you're very good at art");
} else if (randomNumber ==4) {
	System.out.println("you're really smart"); 
} else { 
	System.out.println("you're super good at programming");
}
	}
 
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
