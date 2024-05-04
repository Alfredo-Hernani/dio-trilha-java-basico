import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite o número da Agência");
            String agencia = scanner.next();

            System.out.println("Digite seu número");
            int numero = scanner.nextInt();

            System.out.println("Olá " + nome +"  " + sobrenome +  ", obrigado por cria uma conta em nosso banco, sua agência é "  + agencia + ", conta "  + numero +  " e seu saldo de 237.48 já está disponível para saque.");
            
        }
    }
}
