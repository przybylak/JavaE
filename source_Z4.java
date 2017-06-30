import java.util.Scanner;

/**
 * Created by Artur on 21.06.2017.
 */
public class source_Z4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] tab = new int[5];
        for (int i = 0; i < 5; i++){
            tab[i] = s.nextInt();
        }

        boolean b = sedzia(new Kwadrat(tab[2],tab[3],tab[4]), new Punkt(tab[0], tab[1]));
        System.out.println(b ? "1" : "0");

    }

    public static boolean sedzia(Kwadrat k, Punkt p){

        return (p.x >= k.x
                && p.x <= k.x + k.size
                && p.y >= k.y
                && p.y <= k.y + k.size);

    }

}

class Punkt {

    int x, y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

}

class Kwadrat {

    public int x, y, size;

    public Kwadrat(int x, int y, int size){

        this.x = x;
        this.y = y;
        this.size = size;

    }

}