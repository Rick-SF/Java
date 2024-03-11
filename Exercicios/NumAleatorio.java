import java.util.Random;

public class NumAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int quantidadeSorteios = 6;

        System.out.println("Números sorteados:");

        for (int i = 0, j = 1; i < quantidadeSorteios && j < 7; i++, j++) {
            int numeroSorteado = aleatorio.nextInt(60) + 1;
            System.out.println(j + ": " + numeroSorteado);
        }
    }
}
