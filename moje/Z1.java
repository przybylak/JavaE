package z1;

import java.util.Scanner;

public class Z1 {

    public static void main(String[] args) {
        
        Scanner odczyt = new Scanner(System.in);
        
        int a = odczyt.nextInt();
        int b = odczyt.nextInt();
        
        
        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println(a);
    }
    
}
