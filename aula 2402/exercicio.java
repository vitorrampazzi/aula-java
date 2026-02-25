import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("digite a nota 1");
        num1 = sc.nextInt();
        System.out.println("digite a nota 2");
        num2 = sc.nextInt();
        int media = (num1 + num2) / 2;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}