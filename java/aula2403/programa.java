package aula2403;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class programa {
    public static void main(String[] args) {
        List<String> penis = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        cliente[] listaClientes = new cliente[10];

        for (int i = 0; i < 10; i++){
            cliente c = new cliente();

            System.out.println("escreva seu ID");
            c.id = sc.nextInt();
            System.out.println("escreva seu nome");
            c.nome = sc.next();
            System.out.println("escreva sua idade");
            c.idade = sc.nextInt();
            System.out.println("escreva seu email");
            c.email = sc.next();

            listaClientes[i] = c;
        }

        System.out.println("Lista de Clientes maior de idade: ");

        for(int i = 0; i < 5; i++){
            if (listaClientes[i].idade > 18){
                System.out.println("nome: " + listaClientes[i].nome + "- Idade: " + listaClientes[i].idade + "- id" + listaClientes[i].id + "email: " + listaClientes[i].email);
            }
        }
    }
}
