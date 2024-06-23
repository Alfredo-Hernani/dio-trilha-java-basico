package aparelhoMultifuncional;

import aparelho.celular.Celular;
import aparelho.chrome.Chrome;
import aparelho.ipad.Ipad;

public class Iphone implements Celular, Chrome, Ipad {

	@Override
	public void ligar() {
		System.out.println("Ligando via Iphone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via Iphone");		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página via Iphone");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando página via Iphone");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página via Iphone");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música via Iphone");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música via Iphone");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música via Iphone");		
	}

}
