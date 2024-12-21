// Escreva uma função que leia 100 números em um vetor e, em seguida, exiba os números que são menores ou iguais a 10,
// juntamente com seu índice no vetor.

import java.util.Scanner;

public class SelecaoVetor {

public static void selecaoVetor(){
    Scanner sc = new Scanner(System.in);

    double vetorA [] = new double[100];
   for(int i= 0;i<vetorA.length;i++){
    vetorA[i] = sc.nextDouble();
   }
   sc.close();
    for(int i = 0; i<vetorA.length;i++){
        if(vetorA[i]<=10){
            System.out.println("A["+i+"] = "+vetorA[i]);
        }
    }
}

}