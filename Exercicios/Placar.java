import java.util.Scanner;

public class Placar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.printf("Insira o Número de Gols do Nacional de Patos: ");
        int golsnp = leitor.nextInt();

        System.out.printf("Insira o Número de Gols pelo Treze: ");
        int golstrz = leitor.nextInt();

        System.out.println("\nPlacar:\nNacional de Patos: "+ golsnp + "\nTreze: " + golstrz);
        leitor.close();
    }
    
}
