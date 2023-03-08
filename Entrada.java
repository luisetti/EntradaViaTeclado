import java.util.Scanner;
public class Entrada{
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua idade");
        idade=entrada.nextInt();

        String nome;
        System.out.println("digite seu nome");
        nome=entrada.next();

        System.out.println("sua idade é de: " +idade);
        System.out.println("seu nome é: " +nome);

        entrada.close();

    }
}