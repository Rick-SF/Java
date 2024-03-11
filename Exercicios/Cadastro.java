import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in) ;
        
        System.out.println("\n-----Página de Cadastro-----\n");

        System.out.printf("Insira seu Login de Usuário: ");
        String login = leitor.nextLine();

        System.err.printf("Insira sua Senha: ");
        String senha = leitor.nextLine();

        String senhaconf;

        do{
            System.out.printf("Confirme sua Senha: ");
            senhaconf = leitor.nextLine();
            if (!senhaconf.equals(senha)){
                System.out.println("\nDiferente da Senha original.\nTente Novamente.");
            }
        } while(!senhaconf.equals(senha));

        System.out.printf("\nUsuário Cadastrado com sucesso!\n");

        leitor.close();
    }
    
}
