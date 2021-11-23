package Exercicios;

public class ContaBancaria{
    
    String nome;
    double limite;
    String tipoCartao;
    double saldo;

    ContaBancaria(String nome, double limite, String tipoCartao, double saldo)
    {
        this.tipoCartao = tipoCartao;
        this.nome = nome;
        this.limite = limite;
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTipoCartao() {
        return tipoCartao;
    }

}
