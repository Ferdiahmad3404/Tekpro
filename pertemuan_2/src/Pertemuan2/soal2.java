package Pertemuan2;

import java.util.Scanner;

public class soal2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner userInput = new Scanner(System.in);
		String[] teks = new String[3];
		int[] angka = new int[3];
		byte i;
		
		for(i = 0; i < 3;i++) {
			teks[i] = userInput.nextLine();	//Input string
			angka[i] = userInput.nextInt();	//input String
			userInput.nextLine();
		}
		
		System.out.print("====================\n");
		for(i = 0; i < 3;i++) {
	
			String str = String.format("%-15s", teks[i]); //menambahkan spasi sampai 15 karakter
			String num = String.format("%03d", angka[i]); //menambahkan 0 sampai 3 angka 
			System.out.printf("%s", str);
			System.out.printf("%s\n", num);
		}
		
		System.out.print("====================");
		
	}
}
