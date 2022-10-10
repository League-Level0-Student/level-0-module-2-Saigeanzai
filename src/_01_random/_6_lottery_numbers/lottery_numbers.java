package _01_random._6_lottery_numbers;

import java.util.Random;

public class lottery_numbers {


public static void main(String[] args) {
	
	Random ran = new Random();
	int randomnumber=ran.nextInt(7);
	
	if (randomnumber ==0) {
		System.out.println("11 55 23 67 87 90");
	} else if (randomnumber ==1) {
		System.out.println("34 12 89 76 46 24");
	} else if (randomnumber ==2) {
		System.out.println("78 56 45 87 54 33");
	} else if (randomnumber ==3) {
		System.out.println("18 99 70 59 23 31");
	} else if (randomnumber ==4) {
		System.out.println("09 87 65 43 21 39");
	} else if (randomnumber ==5) {
		System.out.println("87 56 34 56 90 65");
	} else if (randomnumber ==6) {
		System.out.println("21 55 49 13 93 25");
	}
	
	
	
	
	
	
}
















}
	
