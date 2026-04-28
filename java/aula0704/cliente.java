package aula0704;

public class cliente {
    public String agencia;
    public String conta;
    public Double saldo;
    public String nome;

    public cliente(){

    }

    public cliente(String agencia, String conta, Double saldo, String nome){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void depositar(Double valor){
        this.saldo += valor;
        System.out.println("saldo atual " + this.saldo);
    }

    public void sacar(Double valor){
        this.saldo -= valor;
        System.out.println("saldo atual" + this.saldo);
    }

    public Double emitirSaldo(Double dinheiro){
        this.saldo = dinheiro;
        return dinheiro;
    }
}
