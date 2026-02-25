import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso, altura;

        System.out.println("digite o peso");
        peso = sc.nextInt();
        System.out.println("digite a altura");
        altura = sc.nextInt();

        double imc = peso / (altura * altura);
        if(imc < 20){
            System.out.println("Abaixo do peso");
        }
        else if(imc > 20 && imc < 25){
            System.out.println("Peso normal");
        }
        else{
            System.out.println("Acima do peso");
        }
    }
}
