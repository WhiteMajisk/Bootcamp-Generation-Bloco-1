package Exercicios;

public class ContaBancariaTeste{
    
    public static void main(String[] args)
    {
        var userBank = new ContaBancaria("Monkey D. Luffy", 5000, "Gold Internacional", 200);
        var userBank2 = new ContaBancaria("Douglas", 1000, "Gold", 0);

        System.out.println("Banco cliente, Nome: " + userBank.getNome() + ", limite: " + userBank.getLimite()
                        + " tipo de cartao " + userBank.getTipoCartao() + " saldo: " + userBank.getSaldo());

        System.out.println("Banco cliente, Nome: " + userBank2.getNome() + ", limite: " + userBank2.getLimite()
                        + " tipo de cartao " + userBank2.getTipoCartao() + " saldo: " + userBank2.getSaldo());
    }

}