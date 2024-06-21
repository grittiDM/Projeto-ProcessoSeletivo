package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();
        
        String [] candidatos = {"Jose", "Murilo", "Ana", "Clara", "Leonardo"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    //metodo atender (Auxiliar)
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativaRealizadas++;
            }else {
                System.out.println("Contato Realizado com Sucesso!");
            }

        }while(continuarTentando && tentativaRealizadas<3);
        
        if(atendeu){
            System.out.println("Conseguimos contato com o(a) " + candidato + " após " + tentativaRealizadas + " tentativas.");
        }else {
            System.out.println("Não conseguimos contato com o(a) " + candidato + " (Número máximo de tentativas 3).");
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Jose", "Murilo", "Ana", "Clara", "Leonardo"};
        System.out.println("Os candidatos selecionados são:");

        for(String candidato: candidatos) {
            System.out.println("O candidato é " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Jose", "Murilo", "Ana", "Clara", "Leonardo", "Pedro", "Walter", "Liz", "Felipe", "Leandro"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioPretendido >= salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
