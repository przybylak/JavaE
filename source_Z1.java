import java.util.Scanner;

/**
 * Created by Artur on 26.06.2017.
 */
public class source_Z1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println(a);

    }

}
