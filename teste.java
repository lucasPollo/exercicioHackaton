import java.util.Scanner;

public class teste {

    public static Scanner ler = new Scanner(System.in);

    public static String[] turmas = {"ADS", "Sistemas", "Agronomia", "Administração"};

    public static String[] professoresCursoAds = {"Sandro", "Anderson", "João", "Josimar", "Luiz"};
    public static String[] professoresCursoSistemas = {"Felipe", "Anderson", "Sandro", "Douglas", "Joao"};
    public static String[] professoresCursoAgronomia = {"Adriano", "Drieli", "Fabiano", "Francisco"};
    public static String[] professoresCursoAdm = {"Alex", "Anery", "Elias", "Eloi", "Evandro"};

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

    public static void exibirMenuFeedback(String turmaSelecionada) {
        String[] professores;

        switch (turmaSelecionada) {
            case "ADS":
                professores = professoresCursoAds;
                break;
            case "Sistemas":
                professores = professoresCursoSistemas;
                break;
            case "Agronomia":
                professores = professoresCursoAgronomia;
                break;
            case "Administração":
                professores = professoresCursoAdm;
                break;
            default:
                System.out.println("Turma sem professores cadastrados.");
                return;
        }

        String[] pontosFortes = new String[professores.length];
        String[] pontosFracos = new String[professores.length];
        int[] notas = new int[professores.length];

        ler.nextLine(); 

        System.out.println("\nAvalie cada professor da sua turma!\n");

        for (int i = 0; i < professores.length; i++) {
            String professor = professores[i];

            System.out.println("Professor: " + professor);

            System.out.print("Pontos fortes: ");
            pontosFortes[i] = ler.nextLine();

            System.out.print("Pontos a melhorar: ");
            pontosFracos[i] = ler.nextLine();

            int nota;
            do {
                System.out.print("Nota (0 a 10): ");
                nota = ler.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida!");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
            ler.nextLine(); 

            System.out.println("Avaliação registrada!\n");
        }

        System.out.println("\n========== RESUMO DOS FEEDBACKS ==========");
        for (int i = 0; i < professores.length; i++) {
            System.out.println("\nProfessor: " + professores[i]);
            System.out.println("Pontos fortes: " + pontosFortes[i]);
            System.out.println("Pontos a melhorar: " + pontosFracos[i]);
            System.out.println("Nota: " + notas[i]);
        }
        System.out.println("===========================================");
        System.out.println("Obrigado por ajudar a melhorar nossos professores!");
    }

    public static void mostrarProfessores(String turmaSelecionada) {
        System.out.println("\nProfessores da turma " + turmaSelecionada + ":");

        switch (turmaSelecionada) {
            case "ADS":
                for (String prof : professoresCursoAds) {
                    System.out.println("- " + prof);
                }
                break;
            case "Sistemas":
                for (String prof : professoresCursoSistemas) {
                    System.out.println("- " + prof);
                }
                break;
            case "Agronomia":
                for (String prof : professoresCursoAgronomia) {
                    System.out.println("- " + prof);
                }
                break;
            case "Administração":
                for (String prof : professoresCursoAdm) {
                    System.out.println("- " + prof);
                }
                break;
            default:
                System.out.println("Professores ainda não cadastrados para essa turma.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de avaliações de professores!");
        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.print("Digite seu RA: ");
        int ra = ler.nextInt();

        int turmaEscolhida = decideTurma();
        String turmaSelecionada = turmas[turmaEscolhida - 1];

        System.out.println("Bem-vindo " + nome + "!");
        System.out.println("Sua turma escolhida foi: " + turmaSelecionada);

        mostrarProfessores(turmaSelecionada);
        exibirMenuFeedback(turmaSelecionada);
    }
}
