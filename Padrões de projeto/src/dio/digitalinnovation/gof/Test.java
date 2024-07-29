package dio.digitalinnovation.gof;

import dio.digitalinnovation.gof.facade.Facade;
import dio.digitalinnovation.gof.singleton.SingletonEager;
import dio.digitalinnovation.gof.singleton.SingletonLazy;
import dio.digitalinnovation.gof.singleton.SingletonLazyHolder;
import dio.digitalinnovation.gof.strategy.Comportamento;
import dio.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import dio.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import dio.digitalinnovation.gof.strategy.ComportamentoNormal;
import dio.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// Testes relacionados ao Design Pattern Singleton
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamente(normal);
		robo.mover();
		robo.setComportamente(agressivo);
		robo.mover();
		robo.mover();
		robo.setComportamente(defensivo);
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Alfredo", "64048485");
	}
}
