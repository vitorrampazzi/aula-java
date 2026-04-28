package java.exercicios;
import java.util.Scanner
public class conta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product produto = new Product[10];

        int opcao = 0, id = 0, idProduto, quantidade;

        while(true){
            System.out.println("=== Menu - Sistema de Controle de Estoque de Loja ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Entrada de Estoque");
            System.out.println("3 - Saída de Estoque");
            System.out.println("4 - Relatório de Produto");
            System.out.println("5 - Sair");
            
            System.out.println("Digite a opção desejada");
            opcao = sc.nextInt()
            
            if(opcao == 1){

                System.out.println("digite o nome do produto");
                String nome = sc.nextLine();
                System.out.println("digite o preço");
                String preco = sc.nextDouble();

                Product p = new Product(id, nome, preco);
                produto[id] = p;
                id++;

                System.out.println("Produto cadastrado com sucesso!");
            }

            else if(opcao == 2){
                System.out.println("lista de produtos:");
                for(int i=0;i<id;i++){
                    produto[i].getAllProducts();
                }

                System.out.println("digite o id do produto");
                idProduto = sc.nextInt();
                
                System.out.println("digite quantos produtos quer inserir no estoque ");
                quantidade = nextInt();

                produto[idProduto].entrada(quantidade);
            }

            else if(opcao == 3){
                System.out.println("lista de produtos:");
                for(int i=0;i<id;i++){
                    produto[i].getAllProducts();
                }

                System.out.println("digite o id do produto");
                idProduto = sc.nextInt();
                
                System.out.println("digite quantos produtos quer retirar no estoque ");
                quantidade = nextInt();

                produto[idProduto].saida(quantidade);
            }

            else if(opcao == 4){
                System.out.println("lista de produtos:");
                for(int i=0;i<id;i++){
                    produto[i].getAllProducts();
                }
            }
            else if(opcao == 5){
                break
            }
        }
    }
}
