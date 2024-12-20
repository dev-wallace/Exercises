import java.util.Scanner;

public class AcimaDiagonalPrincipal {
    public static void acimaDiagonalPrincipal() {
        Scanner sc = new Scanner(System.in);

        double matrizM[][] = new double[12][12];

        
   
        String escolha = sc.nextLine();

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = i+1; j < matrizM.length; j++) {
                soma += matrizM[i][j];
            }
        }
            
        

        if (escolha.equals("S")) {
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", soma);

        } else if (escolha.equals("M")) {
            double media = soma / 66.0;
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}