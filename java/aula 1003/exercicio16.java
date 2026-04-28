import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        while(true){
            System.out.println("o segundo numero deve ser maior que o primeiro");
    
            System.out.println("digite o primeiro numero");
            a = sc.nextInt();
    
            System.out.println("digite o segundo numero");
            b = sc.nextInt();
    
            while(b < a){
                System.out.println("digite o segundo valor novamente");
                b = sc.nextInt();
            }

            if (b == a) {
                System.out.println("os numeros sao iguais");
                break;
            }
            else{
                System.out.println("o segundo valor é maior que o primeiro graças a Deus");
                break;
            }
        }
    }
}


// 19. Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.