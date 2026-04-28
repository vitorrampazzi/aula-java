package aula0704;
import java.util.Scanner;
public class projeto {
        public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        cliente p1 = new cliente();
        System.out.println("escreva o que voce quer");
        numero = sc.nextInt();
        while(numero != 5){            
            switch (numero) {
                case 1:
                    System.out.println(p1.emitirSaldo(null));
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
            
                case 5:
                    break;
            }
        }

        
    }
}
