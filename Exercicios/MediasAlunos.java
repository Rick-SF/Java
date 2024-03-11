import java.util.Scanner;

public class MediasAlunos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] notas = new int[15];
        float[] medias = new float[5];
        int calculo = 0;
        int i = 0, a = 1, b = 1, c = 0, p = 0, o = 0;
        
        for(; i < 5;){
            for(int j = 0; j < 5; j++){
                System.out.printf("Insira o Nome do "+ a +"° Aluno(a): ");
                nomes[j] = leitor.nextLine();
                b = 1;
                for(int k = 0; k < 3; k++){
                    System.out.printf("Insira a "+ b +"° nota do "+ a +"° Aluno(a): ");
                    notas[c] = leitor.nextInt();
                    leitor.nextLine();
                    b++;
                    c++;
                }
                System.out.println();
                a++;
                i++;
            }
        }
        
        do {
            int nota1 = notas[o];
            int notas2 = notas[o + 1];
            int nota3 = notas[o + 1];
                
            medias[p] = (nota1 + notas2 + nota3) / 3;
            calculo++;
            p++;
            o += 3;
        } while (calculo < 5);

        System.out.println("Médias de Cada Aluno(a):");
        for(int l = 0; l < 5; l++){
            System.out.printf(nomes[l]+": ");
            System.out.print(medias[l]);
            System.out.println();
        }
    }
}
