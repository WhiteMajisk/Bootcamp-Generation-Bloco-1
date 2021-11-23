package collections;

	public abstract class Estoque{
		
		private String Peças, Validade;
		private int Quantidade;
		
		public Estoque(String  aPeças, String Validade, int Quantidade) {
			
			super();
			Peças = aPeças;
			this.Validade = Validade;
			this.Quantidade = Quantidade;
		}

		public String getProdutos() {
			return Peças;
		}

		public void setProdutos(String Peças) {
			this.Peças = Peças;
		}

		public String getValidade() {
			return Validade;
		}

		public void setValidade(String Validade) {
			this.Validade = Validade;
		}

		public int getQuantidade() {
			return Quantidade;
		}

		public void setQuantidade(int Quantidade) {
			this.Quantidade = Quantidade;
		}

		@Override
		public String toString() {
			return "Estoque de Peças = " + Peças + ", Validade =" + Validade + ", Quantidade=" + Quantidade + "";
		}
		

	}
