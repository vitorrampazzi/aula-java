import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("digite o lado 1");
        num1 = sc.nextInt();
        System.out.println("digite o lado 2");
        num2 = sc.nextInt();
        System.out.println("digite o lado 3");
        num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("o triangulo é equilatero");
        }
        else if(num1 == num2 || num2 == num3 || num1 == num3){
            System.out.println("o triangulo é isosceles");
        }
        else{
            System.out.println("o triangulo é escaleno");
        }
    }
}
