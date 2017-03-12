package Zadania.sdajava.com;
import java.util.Scanner;
import static java.lang.System.exit;
public class Main {
    public static void main(String[] args) {

        int[] tab = {1, 2, 4, 6, 7};

        int l = 1;
        int p = tab.length;
        int s, x;

        //pierwszy test
        System.out.println("Podaj szukaną wartość");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        //pierwsze nadanie wartości s
        s = (l + p) / 2;
        System.out.println("Pierwsze S= " + s + "\n");

        //pierwsza pętla
        while (tab[s] != x) {
            s = (l + p) / 2;
            //sprawdzam kolejne iteracja
            System.out.println("Nowe S= " + s + "\n");
            if (l > p) {
                System.out.println("Brak elementów w tablicy!!!");
                exit(0);
            }
            if (x == tab[s]) {
                System.out.println("Znaleziono: " + x + " o indeksie: " + s);
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
