package Pertemuan2;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) throws InterruptedException {
    
    Scanner sc = new Scanner(System.in);

    int A,B;
    char operator;

    A = sc.nextInt();
    operator = sc.next().charAt(0);
    B = sc.nextInt();

    switch (operator) {
        case '+':
            System.out.println(A+B);
            break;
        case '-':
            System.out.println(A-B);
            break;
        case '*':
            System.out.println(A*B);
            break;
        case '/':
            System.out.println(A/B);
        case '%':
            System.out.println(A%B);
            break;
        default:
            break;
        }
    }
}
