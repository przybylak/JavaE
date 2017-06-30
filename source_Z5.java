import java.util.Scanner;

/**
 * Created by Artur on 21.06.2017.
 */
public class source_Z5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        zaszyfruj(s);

    }

    private static void zaszyfruj(String s){

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++){

            char c = chars[i];

            c = (char)swap((int)c, 1,0);
            c = (char)swap((int)c, 3,2);

            chars[i] = c;

        }

        System.out.print(String.valueOf(chars));

    }

    public static int swap(int i, int pos1, int pos2) {

        int bit1 = (i >> pos1) & 1;
        int bit2 = (i >> pos2) & 1;

        if (bit1 == bit2)
            return i;

        int mask = (1 << pos1) | (1 << pos2);

        return i ^ mask;
    }

}
