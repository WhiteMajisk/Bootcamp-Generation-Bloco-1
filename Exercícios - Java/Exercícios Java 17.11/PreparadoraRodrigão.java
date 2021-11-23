package collections;

public class PreparadoraRodrigão extends Estoque implements InterfaceEstoque {
		
		private String Carro;

		public PreparadoraRodrigão(String Peças, String Validade, int Quantidade, String Carro) {
			
			super(Peças, Validade, Quantidade);
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
			return "PreparadoraRodrigão Carro = " + Carro;
			
		}
}
