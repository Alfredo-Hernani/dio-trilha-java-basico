package aparelho.celular;

public class AparelhoTelefonico implements Celular {
	public void ligar () {
		System.out.println("Ligando");
	}
	public void atender () {
		System.out.println("Atendendo");
	}
	public void iniciarCorreioVoz () {
		System.out.println("Iniciando correio de voz");
	}
}
