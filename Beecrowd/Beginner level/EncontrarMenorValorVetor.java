// Escreva uma função para encontrar o menor valor e sua posição em um vetor de inteiros.

import java.util.Scanner;
public class EncontrarMenorValorVetor {



public static void encontrarMenorValorVetor () {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    

  

    int  vetorX [] = new int[N];
    int menorValor = Integer.MAX_VALUE;
    int index = 0;

    for(int i = 0; i<vetorX.length;i++){
        
        vetorX[i] = sc.nextInt();
        
    
    }
    sc.close();
    
    for(int i = 0; i<vetorX.length;i++){


        if (vetorX[i]<menorValor){
            menorValor = vetorX[i];

            index = i;

        }
        



    }
  
    System.out.println("Menor valor: " +menorValor);
    System.out.println("Posicao:" +index);
    


   

}

}