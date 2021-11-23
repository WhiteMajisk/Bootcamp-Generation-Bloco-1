package collections;

public class OficinadoRodrigão extends Estoque implements InterfaceEstoque {
	
	private String Turbina;

	public OficinadoRodrigão(String Peças, String Validade, int Quantidade, String Turbina) {
		
		super(Peças, Validade, Quantidade);
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
		
		System.out.println("Parabéns mais uma preparação concluida");
		
	}

	@Override
	public String toString() {
		return "Oficina de preparação do Rodrigão = " + Turbina;
	}
		
}
