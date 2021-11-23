package Exercicios;

import java.util.*;

public class AviãoTeste{

    public static void main(String[] args)
    {
        var aviao = new Avião(300, 100, "747", "airbus");

        Scanner input = new Scanner(System.in);
        int assentos, nivelCombust;
        
        System.out.println("Piloto, quantos assentos estão ocupados?");
        assentos = input.nextInt();
        aviao.setBancos(assentos);

        System.out.println("Qual o nivel de combustivel ?");
        nivelCombust = input.nextInt();
        aviao.setCombustivel(nivelCombust);


        System.out.println("Aviao numero 1 informacoes: ");
        System.out.println("numero de bancos ocupados: " + aviao.getBancos() + ", Nivel de combustivel: " + aviao.getcombustivel() + "%"
                            + ", modelo "+ aviao.getModelo() + ", fabricante " + aviao.getFabri());

        aviao.autorirDecolagem();
        aviao.decolar();  
        aviao.pousar();
    }
}