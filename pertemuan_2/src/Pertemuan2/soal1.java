package Pertemuan2;

import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		String sentence;
		String comparator = "' ?!,._@"; //pemisah
		sentence = userInput.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i++) {
			if ((sentence.charAt(i) == comparator.charAt(0)) || (sentence.charAt(i) == comparator.charAt(1)) || (sentence.charAt(i) == comparator.charAt(2))
			|| (sentence.charAt(i) == comparator.charAt(3)) || (sentence.charAt(i) == comparator.charAt(4)) || (sentence.charAt(i) == comparator.charAt(5))
			|| (sentence.charAt(i) == comparator.charAt(6))|| (sentence.charAt(i) == comparator.charAt(7))) {
				System.out.print("\n"); //Pemisah antar string
			} else {
				System.out.print(sentence.charAt(i)); //print kata per kata
			}
		}

	}

}
