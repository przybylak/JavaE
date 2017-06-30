import java.util.Scanner;

/**
 * Created by Artur on 21.06.2017.
 */
public class source_Z3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        rozloz(x);

    }

    private static void rozloz(int x){

        if (x <= 0)
            return;

        for (int i = 2; i < x; i++){

            if (x % i == 0 && jestPierwsza(i)){
                System.out.print(i + " ");
            }

        }

        System.out.println();

    }

    private static boolean jestPierwsza(int x){

        for (int i = 2; i < x; i++){

            if ((x % i) == 0){
                return false;
            }

        }

        return true;

    }

}
