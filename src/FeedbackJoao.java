import java.util.Scanner;

public class FeedbackJoao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAvalie o professor do seu programa e ajude-o a melhor da melhor maneira possível!\n");
        System.out.println("\nEm que pontos você acha que seu professor é muito bom?\n");
        String pontosFortes = scanner.nextLine();
        System.out.println("\nEm que pontos você acha que seu professor pode melhorar?\n");
        String pontosFracos = scanner.nextLine();
        System.out.println("\nOtimo! Obrigado por nos ajudar a melhorar!");
        System.out.println("\nPor favor deixe uma nota de 0 a 10 para o professor:\n");
        int nota = scanner.nextInt();

        do {
            System.out.println("Por favor, insira uma nota de 0 a 10:");
            nota = scanner.nextInt();
            if (nota <= 0 && nota >= 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
            }
        } while (nota <= 0 && nota >= 10);

        System.out.println("Pontos fortes: " + pontosFortes);
        System.out.println("Pontos a melhorar: " + pontosFracos);
        System.out.println("Nota dada: " + nota);



        scanner.close();
    }
}