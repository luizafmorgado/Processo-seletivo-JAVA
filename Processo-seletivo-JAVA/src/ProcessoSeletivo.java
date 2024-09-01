import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "JULIA", "CAMILA", "DANIEL", "GABRIEL"};
        for(Strings candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando);
                tentativasRealizadas ++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            
        } while (continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "JULIA", "CAMILA", "DANIEL", "GABRIEL"};
        
        System.out.println("Imprimeindo a lsita de candidatos informando o indice do elemnto");

        for(int indice = 0; indice < candidatos.length; indice ++) {
            System.out.println("O candidato de num " + indice + " é " + candidatos[indice]);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "JULIA", "CAMILA", "DANIEL", "GABRIEL", "ANA", "PIETRA", "MAURICIO", "CARLA", "OTAVIO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecinado para a vaga");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDAND RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
