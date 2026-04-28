package java.exercicios;

public class contafiap {
    public int id
    public String nome
    public double preco
    public int quantidade

    public void setId(Sring id){
        this.id = id
    }
    public int getId(){
        return id
    }

    
    public void setNome(Sring nome){
        this.nome = nome
    }
    public String getNome(){
        return nome
    }

    public void setPreco(double preco){
        this.preco = preco
    }
    public double getPreco(){
        return preco
    }   

    public int getQuantidade(){
        return quantidade
    }

    public Product(){}

    public Product(int id, String nome, double preco){
       this.id = id;
       this.nome = nome;
       this.preco = preco;
       this.quantidade = 0;
    }

    public entrada(int valor){
        if(valor > 0){
            this.quantidade += valor
            System.out.print("entrada realizada com sucesso")
        }
        else{
            System.out.print("entrada invalida")
        }
    }

    public saida(int valor){
        if(this.quantidade >= valor && valor > 0)
            this.quantidade -= valor
        else{
            System.out.print("nao tem o suficiente para a saida de estoque")
        }
    }

    public getAllProducts(){
        System.out.print("Nome = " + this.nome + "id = " + this.id + "preço = " + this.preco + "quantidade no estoque = " + this.quantidade);
    }


    
}
