//receber tres notas, e calcular a media aritmetica delas


import java.util.Scanner; 

public class exercise2 {
        public static void main(String[]args) {
            Scanner s = new Scanner(System.in);
            int nota1, nota2, nota3, media;

            System.out.println("Digite a primeira nota do aluno: ");
            nota1 = s.nextInt();

            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = s.nextInt();

            System.out.println("Digite a terceira nota do aluno:  ");
            nota3 = s.nextInt();

            media = (nota1 + nota2 + nota3 )/3;

            System.out.println("A média do aluno é:  " + media);

            s.close();

        };


}
