package java.aula3103;

public class cliente {
    private int id;
    private String nome;
    private double saldo;
    private double valor;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public double getValor(){
        return valor;
    }
    
    public cliente(){
    }

    public cliente(int id, String nome, double saldo){
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){ 
        this.saldo += valor;
        System.out.println("saldo atual " + this.getSaldo());
    }

    public String getNomeFormatado(){
        return this.getId() + " - " + this.getNome();
    }

    public String getNomeFormatadoPerigoso(){
        return this.getId() + " - " + this.getNome() + " - " + this.getSaldo();
        
    }
}

