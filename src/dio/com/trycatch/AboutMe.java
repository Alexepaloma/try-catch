package dio.com.trycatch;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá me Chamo" + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura è " + altura + "cm");
       scanner.close();



    }
    catch (InputMismatchException e;);{
        System.err.println("O s campos idade e altura deverão ser numéricos");
    }
}


