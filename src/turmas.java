import java.util.Scanner;

public class turmas {
    public static void main(String[] args) {

        String[] turmas = {"ADS","Sistemas","Agronomia","Administração","Arquitetura","Biomedicina","Farmacia","Contabeis","Direito","Eng.Civil","Veterinaria","Psicologia","Psicopedagogia"};
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Escolha a turma:");
        for (int i = 0; i < turmas.length; i++) {
            System.out.println((i + 1) + " - " + turmas[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        int decisao = sc.nextInt();
        
    }

}
    

