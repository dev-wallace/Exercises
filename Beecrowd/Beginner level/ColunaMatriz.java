// Escreva uma função para calcular a soma ou a média dos elementos de uma coluna específica em uma matriz 12x12.

import java.util.Scanner;

public class ColunaMatriz {
    public static void colunaMatriz() {
        Scanner sc = new Scanner(System.in);

        double matrizM[][] = new double[12][12];

        int L = sc.nextInt();
        sc.nextLine();
        String escolha = sc.nextLine();

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;

        for (int j = 0; j < matrizM.length; j++) {
            soma += matrizM[j][L];
        }

        if (escolha.equals("S")) {
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", soma);
        } else if (escolha.equals("M")) {
            double media = soma / matrizM.length;
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}