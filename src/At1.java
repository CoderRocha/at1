import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();

        if (a + b < c) {
            System.out.println("A soma de A e B é menor que C.");
        } else {
            System.out.println("A soma de A e B é maior ou igual a C.");
        }

        input.close();
    }
}