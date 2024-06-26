import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        selecionarCandidatos();
    }
    static void selecionarCandidatos() {
    double salarioBase = 2000.0;
    String [] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FÁBRICIO", "MIRELA", "DANIELA", "JORGE"};
    int totalSelecionados = 0;
    int proximoCandidato = 0;
    while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
        String candidato = candidatos[proximoCandidato++];
        double valorPretendido = valorPretendido();
        System.out.println("O candidato " + candidato + "está pedindo " + valorPretendido);
        if(valorPretendido > salarioBase) {
            System.out.println("QUE PENA!! O candidato " + candidato + " não foi seleciodado");
        }
        else {
            System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado");
            totalSelecionados++;
        }
    }
    System.out.println("Total de selecionados: " + totalSelecionados);
    System.out.println("Total de consultados: " + proximoCandidato);
    }
    // pra mim dá um valor pretendido aleátorio 
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
