import java.util.Scanner;

public class exercise4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int salario, news;

        System.out.println("Digite seu salário:  ");
        salario = s.nextInt();

        news = (salario * 100/25);

        System.out.println("Parabens! seu novo salario é: " + news);

        s.close();
    }
}
