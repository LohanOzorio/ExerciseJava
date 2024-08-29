//pedir 3 notas, definir 3 pesos, e calcular a media ponderada 

import java.util.Scanner;

public class exercise3 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,n3,media;
        int p1 = 2;
        int p2 = 4;
        int p3 = 8;

        System.out.println("primeira nota: ");
        n1 = s.nextInt();
        System.out.println("segunda nota: ");
        n2 = s.nextInt();
        System.out.println("terceira nota: ");
        n3 = s.nextInt();
       
        media = ( n1 * p1 + n2 * p2 + n3 * p3)/(n1 + n2 + n3);

        System.out.println("Media ponderada final: " + media);

        s.close();
    }

};
