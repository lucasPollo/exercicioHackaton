import java.util.Scanner;

public class Atividade {
    public static Scanner ler = new Scanner(System.in);

    // Método para decidir a turma (exemplo simples)
    public static int decideTurma() {
        String[] turmas = {"ADS","Sistemas","Agronomia","Administração","Arquitetura","Biomedicina","Farmacia","Contabeis","Direito","Eng.Civil","Veterinaria","Psicologia","Psicopedagogia"};
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Escolha a turma:");
        for (int i = 0; i < turmas.length; i++) {
            System.out.println((i + 1) + " - " + turmas[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        int decisao = sc.nextInt();
        return decisao;
    }

    public static void exibirMenuFeedback() {

        int turmaescolhida = decideTurma();

         System.out.println("\nAvalie o professor do seu programa e ajude-o a melhor da melhor maneira possível!\n");
        System.out.println("\nEm que pontos você acha que seu professor é muito bom?\n");
        String pontosFortes = ler.nextLine();
        System.out.println("\nEm que pontos você acha que seu professor pode melhorar?\n");
        String pontosFracos = ler.nextLine();
        System.out.println("\nOtimo! Obrigado por nos ajudar a melhorar!");
        System.out.println("\nPor favor deixe uma nota de 0 a 10 para o professor:\n");
        int nota = ler.nextInt();

        do {
            System.out.println("Por favor, insira uma nota de 0 a 10:");
            nota = ler.nextInt();
            if (nota <= 0 && nota >= 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
            }
        } while (nota <= 0 && nota >= 10);

        System.out.println("Pontos fortes: " + pontosFortes);
        System.out.println("Pontos a melhorar: " + pontosFracos);
        System.out.println("Nota dada: " + nota);

    }
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de avaliacoes de alunos!");
        System.out.println("Digite seu nome: ");
        String nome = ler.next();


        System.out.println("Digite seu ra: ");
        int ra = ler.nextInt();

        decideTurma();
        exibirMenuFeedback();





































    }
}