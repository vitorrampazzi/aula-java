import java.util.Scanner;

public class Exericio {
   public static void main(String[] args) {
       System.out.println("Hello Turma");
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a base: ");
       int num = sc.nextInt();
       System.out.println("Digite a altura: ");
       int num2 = sc.nextInt();

       int area2 = num + num;
       int area = num * num2;
       System.out.println("A area do retangulo é: " + area2);
       System.out.println("A area do quadrado é: " + area);
       System.out.println("A area do triangulo é: " + (area / 2));
   }
}

