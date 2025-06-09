import java.util.Scanner;

public class Atividade {
    public static Scanner ler = new Scanner(System.in);


    public static void exibirMenuFeedback() {

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


        System.out.println("Digite sua turma: ");
        String turmaEscolhida = ler.next();

        exibirMenuFeedback();





































    }
}