import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o numero 1");
        num1 = sc.nextInt();

        System.out.println("Digite o numero 2");
        num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println("o numero um é maior que o numero dois");
        }
        else if(num1 == num2){
            System.out.println("os numeros são iguais");
        }
        else{
            System.out.println("o numero dois é maior que o numero um");
        }
    }
}
