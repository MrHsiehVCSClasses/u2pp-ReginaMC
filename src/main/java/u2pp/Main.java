package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * Scanner takes in input from the user for the fuel efficiency, make, model, and distance to drive
 * The values are used as parameters for a Car object
 * C.add and C.drive are methods used to calculate the remaining gas 
 * The make, model, and remaining gas is printed  
 */

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a fuel efficiency");
		Double valueMPG = Double.parseDouble(sc.nextLine());

		System.out.println("Enter a make");
		String make = sc.nextLine();

		System.out.println("Enter a model");
		String model = sc.nextLine();

		Car C = new Car(valueMPG, make, model);
		System.out.println("Enter amount of gas to add");
		Double valueGas = Double.parseDouble(sc.nextLine());
		C.addGas(valueGas);

		System.out.println("Enter distance to drive");
		Double valueDis = Double.parseDouble(sc.nextLine());
		C.drive(valueDis);     	

		System.out.println("Your " + C.getMakeAndModel() + " currently has " + C.getGasInTank() + " of gas left in the tank");

		sc.close();
		
		//sample run for wordChanger
		String str1 = "Brian";
		String str2 = "Wade";
		String str3 = wordChanger(str1, 2, 3, str2, 0, 2);
		System.out.println(str3);
		
	}


	/**
	 * wordChanger takes 6 parameters and combines a piece of two words to make a new word
	 * @param word1 The first string to take a piece out of
	 * @param start1 The starting index of the substring of word1
	 * @param end1 The ending index of the substring of word1 (inclusive)
	 * @param word2 The second string to take a piece out of
	 * @param start2 The starting index of the substring of word2
	 * @param end2 The ending index of the substring of word2 (inclusive)
	 * @return the newWord: a piece of word 1 plus and piece of word2
	 */
	public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
		//
		int e = end1 + 1;
		int e2 = end2 + 1;
		String wC1 = word1.substring(start1, e);
		String wC2 = word2.substring(start2, e2);
		String newWord = wC1 + wC2;
		return newWord;
	}
}