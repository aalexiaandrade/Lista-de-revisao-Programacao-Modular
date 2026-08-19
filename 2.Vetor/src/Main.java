import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[3];

        System.out.println("Digite 3 numeros: ");
        vetor[0] = scanner.nextInt();
        vetor[1] = scanner.nextInt();
        vetor[2] = scanner.nextInt();

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

        if (((vetor[0] > vetor[1]) && (vetor[0] < vetor[2]) || (vetor[0] > vetor[1]) && (vetor[0] < vetor[2]))) {
            System.out.println("O numero " + vetor[0] + " está dentro do intervalo de " + vetor[1] + vetor[2]);
        } else {
            System.out.println("O numero " + vetor[0] + " está fora do intervalo de " + vetor[1] + " e " + vetor[2]);
        }

        if ((vetor[0] % vetor[1] == 0) && (vetor[0] % vetor[2] == 0)) {
            System.out.println(vetor[0] + " 1é divisivel por " + vetor[1] + " e " + vetor[2]);
        } else {
            System.out.println(vetor[0] + " não é divisivel por nenhum outro vetor");
        }

    }
}