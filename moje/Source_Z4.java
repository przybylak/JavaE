package source_z4;

import java.util.Scanner;

public class Source_Z4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tab[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            tab[i] = s.nextInt();
        }   
        
        boolean b = sprawdz(new Kwadrat(tab[2],tab[3],tab[4]), 
                new Punkt(tab[0], tab[1]));
        System.out.println(b ? "1" : "0");
    }
        public static boolean sprawdz(Kwadrat k, Punkt p){
        return (p.x >= k.x && p.x <= k.x + k.obszar 
                && p.y >= k.y 
                && p.y <=k.y + k.obszar);
    }
}
    class Punkt{
        int x, y;
        
        public Punkt(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    class Kwadrat{
        public int x, y, obszar;
        
        public Kwadrat(int x, int y, int obszar){
            this.x = x;
            this.y = y;
            this.obszar = obszar;
        }
        
    }
    

