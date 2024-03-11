import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class RegistroAgenda {
    String nome;
    String telefone;

    RegistroAgenda(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}

public class AgendaTelefonica {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        RegistroAgenda[] agenda = new RegistroAgenda[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i + 1) + "° nome: ");
            String nome = leitor.nextLine();

            System.out.println("Insira o telefone da " + (i + 1) + "° pessoa: ");
            String telefone = leitor.nextLine();

            agenda[i] = new RegistroAgenda(nome, telefone);
        }

        System.out.println("Deseja remover algum contato? 'S' ou 's' para sim");
        char caractere = (char) reader.read();

        if (caractere == 's' || caractere == 'S') {
            System.out.print("\nDigite o nome do contato que deseja remover: ");
            String nomeRemover = scanner.nextLine();

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i] != null && agenda[i].nome.equalsIgnoreCase(nomeRemover)) {
                    agenda[i] = null;
                    System.out.println("Contato removido com sucesso!");
                    organizarAgenda(agenda);
                    break;
                }
            }
        } else {
            System.out.println("Nenhum contato foi removido.");
        }

        System.out.println("Digite o nome do contato que deseja procurar: ");
        String nomeProcurar = leitor.nextLine();
        int posicao = getPosicao(agenda, nomeProcurar);

        if (posicao != -1) {
            System.out.println("O contato '" + nomeProcurar + "' está na posição " + (posicao + 1) + " da lista.");
        } else {
            System.out.println("Contato não encontrado na lista.");
        }

        leitor.close();
        reader.close();
        scanner.close();
    }

    public static void organizarAgenda(RegistroAgenda[] agenda) {
        int n = agenda.length;
        for (int i = 0; i < n - 1; i++) {
            if (agenda[i] == null) {
                for (int j = i + 1; j < n; j++) {
                    if (agenda[j] != null) {
                        agenda[i] = agenda[j];
                        agenda[j] = null;
                        break;
                    }
                }
            }
        }
        exibirAgenda(agenda);
    }

    public static int getPosicao(RegistroAgenda[] agenda, String nomeProcurar) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null && agenda[i].nome.equalsIgnoreCase(nomeProcurar)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    public static void exibirAgenda(RegistroAgenda[] agenda) {
        System.out.println("\nAgenda Telefônica:");
        for (int i = 0; i < 10; i++) {
            if (agenda[i] != null) {
                System.out.println("Contato " + (i + 1) + ": Nome: " + agenda[i].nome + ", Telefone: " + agenda[i].telefone);
            }
        }
    }
}
