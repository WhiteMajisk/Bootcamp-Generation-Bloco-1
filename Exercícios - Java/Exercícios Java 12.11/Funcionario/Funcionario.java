package Exercicios;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    private String cargo;

    Funcionario(String nome, int idade, double salario, String cargo)
    {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

}