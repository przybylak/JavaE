import java.util.Scanner;

/**
 * Created by Artur on 26.06.2017.
 */
public class source_Z6 {

    static int a, b, c, x1, x2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();

        double x1_value = obliczCalke(x1);
        double x2_value = obliczCalke(x2);

        System.out.println(x2_value - x1_value);

    }

    private static double obliczCalke(int x){

        double value = 0;

        value += obliczWartosc(x, a, 2);
        value += obliczWartosc(x, b, 1);
        value += obliczWartosc(x, c, 0);

        return value;

    }

    private static double obliczWartosc(int x, int iloczyn, int potega){

        return iloczyn * (1.0 / (1 + potega)) * (Math.pow(x, potega + 1));

    }

}
