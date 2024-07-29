package dio.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamente(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
