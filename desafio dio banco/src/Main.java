
public class Main {

	public static void main(String[] args) {
		Cliente fred = new Cliente();
		fred.setNome("Fred");
		
		Conta cc = new ContaCorrente(fred);
		Conta poupanca = new ContaPoupanca(fred);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtraro();
		poupanca.imprimirExtraro();
	}

}
