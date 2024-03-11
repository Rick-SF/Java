import java.util.Locale;
import java.util.Scanner;

public class CalculandoIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu Peso: ");
        double peso = leitor.nextDouble();
        
        System.out.println("Insira sua Altura: ");
        double altura = leitor.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.printf("%.2f", IMC);
    
        leitor.close();
    }
}
