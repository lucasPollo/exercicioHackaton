import java.util.Scanner;

public class atividade {
    public static Scanner ler = new Scanner(System.in);
    
    public static String[] turmas = {
        "ADS", "Sistemas", "Agronomia", "Administração"};

    static int escolhaAvaliar = 0;
    

    public static String[] professoresCursoAds = {"Sandro", "Anderson", "João", "Josimar"};
    public static String[] professoresCursoSistemas = {"Felipe", "Anderson", "Sandro", "Douglas", "Joao"};

    public static int decideTurma() {

        System.out.println("\n========== Escolha sua Turma ==========");
        for (int i = 0; i < turmas.length; i++) {
            System.out.printf(" %2d) %-15s\n", (i + 1), turmas[i]);
        }
        System.out.println("========================================");
        System.out.print("Digite o número correspondente à sua turma: ");

        int decisao = ler.nextInt();
        return decisao;
    }

    public static void exibirMenuFeedback() {
        int nota = 0;

        System.out.println("\nAvalie o professor do seu programa e ajude-o a melhor da melhor maneira possível!");
        System.out.println("\nQuais você que são os pontos fortes do seu professor?");
        ler.nextLine();
        String pontosFortes = ler.nextLine();
        System.out.println("\nEm que pontos você acha que seu professor pode melhorar?");
        String pontosFracos = ler.nextLine();
        System.out.println("\nOtimo! Obrigado por nos ajudar a melhorar!");

        boolean notaInvalida = true;
        do {
            System.out.println("Por favor, insira uma nota de 0 a 10:");
            nota = ler.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
            }else{
                notaInvalida = false;
            }
        } while (notaInvalida);

        System.out.println("Obrigado pela sua avaliação!");
        System.out.println("========================================");
        System.out.println("Professor avaliado: " + professoresCursoAds[escolhaAvaliar + 1]);
        System.out.println("Pontos fortes: " + pontosFortes);
        System.out.println("Pontos a melhorar: " + pontosFracos);
        System.out.println("Nota dada: " + nota);
        System.out.println("========================================");

    }

    public static void mostrarProfessores() {


for(int i =0; i < professoresCursoAds.length; i++) {
    System.out.println(professoresCursoAds[i]);
}


        
    }
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de avaliacoes de alunos!");
        System.out.print("Digite seu nome: ");
        String nome = ler.next();


        System.out.print("Digite seu ra: ");
        int ra = ler.nextInt();

        int turmaEscolhida = decideTurma();
  
        String turmaSelecionada = turmas[turmaEscolhida - 1];

        turmaz.limparTerminal();
        System.out.println("\n");
        System.out.println("Bem-vindo! "+ nome);
        System.out.println("Sua turma escolhida foi: " + turmaSelecionada+"\n");

        switch(turmaSelecionada){
            case "ADS":
            String[] professores = professoresCursoAds;
            System.out.println("\nSeus professores são:");
            for (int i = 0; i < professoresCursoAds.length; i++) {
            System.out.printf(" %2d) %-15s\n", (i + 1), professores[i]);
            }
            Scanner av = new Scanner(System.in);
            System.out.println("Que professor você gostaria de avaliar? (1-"+professores.length+")");
            int escolhaAvaliar = av.nextInt();
            
        }

        exibirMenuFeedback();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nDeseja avaliar outro corpo docente? (S/N)");
            String resposta = ler.next();
            if (resposta.equalsIgnoreCase("S")) {
            int novaTurmaEscolhida = decideTurma();
            String novaTurmaSelecionada = turmas[novaTurmaEscolhida - 1];

            turmaz.limparTerminal();
            System.out.println("\n");
            System.out.println("Bem-vindo! " + nome);
            System.out.println("Sua turma escolhida foi: " + novaTurmaSelecionada + "\n");

            switch (novaTurmaSelecionada) {
                case "ADS":
                String[] professores = professoresCursoAds;
                System.out.println("\nSeus professores são:");
                for (int i = 0; i < professoresCursoAds.length; i++) {
                    System.out.printf(" %2d) %-15s\n", (i + 1), professores[i]);
                }
                Scanner av = new Scanner(System.in);
                System.out.println("Que professor você gostaria de avaliar? (1-" + professores.length + ")");
                escolhaAvaliar = av.nextInt();
                break;
            }

            exibirMenuFeedback();
            } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("\n");
            System.out.println("Obrigado por usar o sistema de avaliações, " + nome + "!");
            System.out.println("Esperamos que tenha sido uma experiência positiva.");
            System.out.println("Até a próxima!");
            continuar = false;
            }
        }
































    }
}