package collections;

	public abstract class Estoque{
		
		private String Pe�as, Validade;
		private int Quantidade;
		
		public Estoque(String  aPe�as, String Validade, int Quantidade) {
			
			super();
			Pe�as = aPe�as;
			this.Validade = Validade;
			this.Quantidade = Quantidade;
		}

		public String getProdutos() {
			return Pe�as;
		}

		public void setProdutos(String Pe�as) {
			this.Pe�as = Pe�as;
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
			return "Estoque de Pe�as = " + Pe�as + ", Validade =" + Validade + ", Quantidade=" + Quantidade + "";
		}
		

	}
