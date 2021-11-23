package collections;

public class PreparadoraRodrig�o extends Estoque implements InterfaceEstoque {
		
		private String Carro;

		public PreparadoraRodrig�o(String Pe�as, String Validade, int Quantidade, String Carro) {
			
			super(Pe�as, Validade, Quantidade);
			this.Carro = Carro;
		}

		public String getCarro() {
			return Carro;
		}

		public void setCarro(String Carro) {
			this.Carro = Carro;
		}

		@Override
		public void contagem() {
			System.out.println("Ainda restam: "+getQuantidade()+" carros a serem preparados");
			
		}

		@Override
		public void venda() {
			System.out.println("Mais um monstro de rua entregue!!! ");
			
		}

		@Override
		public String toString() {
			return "PreparadoraRodrig�o Carro = " + Carro;
			
		}
}
