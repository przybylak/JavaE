package source_z3;

import java.util.Scanner;

public class Source_Z3 {
public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        for ( int i = 2; i <= x / i; i++) {
            while (x % i == 0) { 
               
               x /= i; 
              
            }
            System.out.print(i + " ");
        }
       
        if (x > 1) {
            System.out.print(x);
        }
    }
}

 

    

