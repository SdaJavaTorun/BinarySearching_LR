package Zadania.sdajava.com;
import java.util.Scanner;
import static java.lang.System.exit;
public class Main {
    public static void main(String[] args) {

        int[] tab = {-999999, -100, -99, -90, -57, -34, -23, -12, -7,-4, 0, 1, 2,
                4, 6, 7,9, 90,91, 92, 93, 95, 102, 104, 108, 123, 185, 190, 198, 200, 9999999};

        int l = 0;
        int p = tab.length;
        int s, x;

        //pierwszy test
        System.out.println("Podaj szukaną wartość");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        //pierwsze nadanie wartości s
        s = (l + p) / 2;

        //pierwsza pętla
        while (tab[s] != x) {
            s = (l + p) / 2;
            //sprawdzam kolejne iteracja
            System.out.println("Nowe S= " + s );
            if (l > p) {
                System.out.println("\nBrak elementów w tablicy!!!");
                exit(0);
            }
            if (x == tab[s]) {
                System.out.println("\nZnaleziono: " + x + " o indeksie: " + s);
                exit(0);
            }
            if(tab[s] < x){
                l = s + 1;
            }
            if(tab[s] > x){
                p = s - 1;
            }
        }
    }
}
