package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra resposta");

        } else {
            System.out.println("Aguardando resultado demais candidatos");

        }
    }
}
