public class ProcessoSeletivo1 {
    public static void main(String[] args) throws Exception {
    
    analisarCandidatos(2000.0 , 1900.00);
    analisarCandidatos(2000.0 , 2000.0);
    analisarCandidatos(2000.0 , 2100.0);
    }

    static void analisarCandidatos(double salarioBase , double salarioPretendido) {
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}
