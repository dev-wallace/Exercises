import java.util.Scanner;

public class AreaDireita {
    public static void areaDireita(){
        Scanner sc = new Scanner(System.in);

        double matrizM[][] = new double[12][12];
        double soma = 0;
        String escolha = sc.nextLine();


        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = sc.nextDouble();
            }
        }

            
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                if(j > i && j > matrizM.length -i-1){
                    soma += matrizM[i][j];

                }
            }

            
        }

        if (escolha.equals("S")) {
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", soma);
        } else if (escolha.equals("M")) {
            double media = soma /=30;
            // Formata a saída para um decimal
            System.out.printf("%.1f\n", media);
        }


        sc.close();
    }

}