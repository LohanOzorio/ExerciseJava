// receber números inteiros,calcule e mostre a soma desses números


import java.util.Scanner;

public class exercise1 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int n1, n2, soma;

            System.out.println("Digite o primeiro número: ");
            n1 = s.nextInt();
            System.out.println("Digite o segundo número:  ");
            n2 = s.nextInt();
            soma = (n1 + n2);
            System.out.println("O resultado da soma é : " + soma );

        
            s.close();
            
        }
}
