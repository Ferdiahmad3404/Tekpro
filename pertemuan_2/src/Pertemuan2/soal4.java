package Pertemuan2;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) throws InterruptedException {
    
    Scanner sc = new Scanner(System.in);

    int item;
    int gaji = 500000;

    item = sc.nextInt();

    if (item > 80) {
        System.out.println(gaji += 0.35 * item *50000 );
    } else if (item >= 40 && item <= 80) {
        System.out.println(gaji += 0.25*item*50000);
    } else if(item < 15){
        System.out.println(gaji -= (15-item)*0.15*50000);
    } else {
        System.out.println(gaji += 0.10 * item *50000);
    }
    }
}
