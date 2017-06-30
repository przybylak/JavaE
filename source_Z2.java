

import java.util.Scanner;

/**
 * Created by Artur on 21.06.2017.
 */
public class source_Z2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long x = s.nextLong();
        wypiszBinarnie(x, 0, "");

    }

    private static void wypiszBinarnie(long x, int offset, String s){

        if (offset >= 64)
        {
            int lastOne = s.lastIndexOf('1');
            for (int i = lastOne; i >= 0; i--){
                System.out.print(s.charAt(i));
            }
            System.out.println();
            return;
        }

        long bit = ((x >> offset) & 1);
        s += bit;

        wypiszBinarnie(x, ++offset, s);

    }

}
