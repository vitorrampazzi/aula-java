import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("digite a base");
        num1 = sc.nextInt();
        System.out.println("digite a altura");
        num2 = sc.nextInt();
        int area = num1 * num2;

        if(area > 100){
            System.out.println("o terreno é grande");
        }
    }
}
