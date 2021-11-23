package exerciciosJava10_11;

public class Exercicio01 {

	public static void main(String[] args) {
     
		for(int number=1000; number <=1999; number++ ){
            int resto = number % 11;

            if(resto == 5){
                System.out.println(number);
            }
        }

	}

}
