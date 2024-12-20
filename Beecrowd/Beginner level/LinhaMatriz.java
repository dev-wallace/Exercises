// Escreva uma função para calcular a soma ou a média dos elementos de uma linha específica em uma matriz 12x12.

import java.util.Scanner;

public class LinhaMatriz {
    public static void linhaMatriz(){
        Scanner sc = new Scanner(System.in);

        double matrizM [][] = new double[12][12];

        int L = sc.nextInt();
        sc.nextLine();
        String escolha = sc.nextLine();

        for(int i = 0; i<matrizM.length;i++){
            for(int j =0;j<matrizM.length;j++){
                matrizM[i][j] = sc.nextDouble();
            }
        }
         
           
            double soma =0;
           
                for(int j = 0;j<matrizM.length;j++){
                   
                   soma+= matrizM[L][j];
                }
     
             
            

                if(escolha.equals("S")){
                    System.out.println(soma);
                 }
         else if (escolha.equals("M")) {
            double media =0;
            
            for(int j = 0;j<matrizM.length;j++){
                  media = soma /matrizM[L].length;
                
             }
             System.out.println(media);


        }
        sc.close();

    }

}