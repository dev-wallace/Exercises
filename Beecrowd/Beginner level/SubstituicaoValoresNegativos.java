// Escreva uma função que substitua valores negativos ou zero em um vetor por 1, preservando valores positivos.
// O programa lê 10 números, realiza a substituição quando necessário e exibe os valores resultantes com seus índices.

import java.util.Scanner;

public class SubstituicaoValoresNegativos {

    public static void substituicaoValoresNegativos(){

        Scanner sc= new Scanner(System.in);
        int vetorX [] = new int[10];

        for(int i = 0; i<vetorX.length; i++){

            vetorX [i] = sc.nextInt();
            
            if(vetorX[i] <= 0 ){
                vetorX[i] = 1;

            }

        }
        sc.close();

        for (int i = 0; i < vetorX.length; i++) {
            System.out.println("X[" + i + "] = " + vetorX[i]);
        }

        

    }

}