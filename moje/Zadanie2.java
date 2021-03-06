package zadanie2;

import java.util.Scanner;
public class Zadanie2 {

    public static void main(String[] args) {
        int number; 
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        printBinaryform(number);
    }

    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return; 
        }
        remainder = number %2; 
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}
