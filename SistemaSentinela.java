import java.util.Scanner;
public class SistemaSentinela {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n --- Sistema Sentinela --- ");

        String nomeProfissional;
        String cargo;
        int nivelAcesso;
        int nivelSigilo;

        System.out.println("Informe o nome do profissional: ");
        nomeProfissional = sc.nextLine();

        System.out.println("Informe o cargo ocupado (Cientista, Engenheiro, Zelador, Administrativo): ");
        cargo = sc.nextLine();

        System.out.println("Digite o nível de acesso (1 - 10): ");
        nivelAcesso = sc.nextInt();

        System.out.println("Digite o nível de sigilo da área (1 - 10): ");
        nivelSigilo = sc.nextInt();

        System.out.println(nomeProfissional + "(" + cargo + ")");

        if(nivelAcesso < 1 || nivelAcesso > 10){
            System.out.println("Erro: Nível de acesso inválido.");

        } else if (nivelAcesso >= nivelSigilo) {

            int nivelAutoridade = nivelAcesso - nivelSigilo;
            System.out.println("ACESSO PERMITIDO.");
            System.out.println("Saldo de autoridade: " + nivelAutoridade);
            
        } else if (nivelAcesso < 3 && nivelSigilo > 7){

            System.out.println("ACESSO NEGADO.");
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");

        } else {
            System.out.println("ACESSO NEGADO.");
        }

        sc.close();
        
    }
}