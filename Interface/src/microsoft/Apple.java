package microsoft;

import aparelho.celular.Celular;
import aparelho.chrome.Chrome;
import aparelhoMultifuncional.Iphone;
import aparelho.ipad.Ipad;

public class Apple {
	public static void main(String[] args) {
		Iphone em = new Iphone();
		
		Celular celular = em;
		Ipad ipad = em;
		Chrome chrome = em;
		
		celular.atender();
		ipad.tocar();
		chrome.atualizarPagina();
	}
}
