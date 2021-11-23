package collections;

public class OficinadoRodrig�o extends Estoque implements InterfaceEstoque {
	
	private String Turbina;

	public OficinadoRodrig�o(String Pe�as, String Validade, int Quantidade, String Turbina) {
		
		super(Pe�as, Validade, Quantidade);
		this.Turbina = Turbina;
	}
	
	public String getPneus() {
		return Turbina;
	}

	public void setPneus(String Turbina) {
		this.Turbina = Turbina;
	}

	@Override
	public void contagem() {
		
		System.out.println(getQuantidade());
		
	}

	@Override
	public void venda() {
		
		System.out.println("Parab�ns mais uma prepara��o concluida");
		
	}

	@Override
	public String toString() {
		return "Oficina de prepara��o do Rodrig�o = " + Turbina;
	}
		
}
