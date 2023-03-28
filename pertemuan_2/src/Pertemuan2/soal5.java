package Pertemuan2;

import java.math.BigInteger;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class soal5 {
    public static void main(String[] args) throws InterruptedException {
		Scanner userInput = new Scanner(System.in);

        String platnomor;
        
        BigInteger a,b,c;
        a = new BigInteger("999999");
        b = new BigInteger("5");
        c = new BigInteger("1");
        platnomor = userInput.nextLine();
        platnomor = platnomor.replaceAll(" ","");
        BigInteger jumlah = new BigInteger(platnomor);
        jumlah = jumlah.subtract(a);
        jumlah = jumlah.mod(b);
        int compare = jumlah.compareTo(c);
        if (compare == 0){
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        
    }

}