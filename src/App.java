import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n,r,t1=1,t2=1,t3=1;

        Scanner inp = new Scanner (System.in);
        System.out.print("n sayısını giriniz :");
        n = inp.nextInt();

        System.out.print("r sayısını giriniz : ");
        r = inp.nextInt();

        for (int x=1; x <= n; x++){
            t1 *=x;
        }
        for (int y=1; y <= r; y++){
            t2 *=y;
        }
        for(int z=1; z <= (n-r);z++){
            t3 *=z;
        }

        System.out.println("Verdiğiniz Sayıların Kombinasyonu : C(" +n + "," + r + ") =" + n + "! /(" + r +"! * (" + n + "-" + r +")!)" );
        System.out.println("=" + t1 / (t2 * t3));
    }
}
