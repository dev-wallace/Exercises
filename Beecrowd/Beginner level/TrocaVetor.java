// Este programa lê um vetor de 20 inteiros, inverte a ordem dos elementos e os exibe com seus respectivos índices.
// Ele utiliza a técnica de troca de posições para realizar a inversão com eficiência.

import java.util.Scanner;

public class TrocaVetor {
    public static void trocarVetor() {
        Scanner sc = new Scanner(System.in);
        int vetorN[] = new int[20];

       
        for (int i = 0; i < vetorN.length; i++) {
            vetorN[i] = sc.nextInt();
        }
        sc.close();
      
        int primeiro = 0;
        int ultimo = vetorN.length - 1;

       
        while (primeiro < ultimo) {
            int aux = vetorN[primeiro];
            vetorN[primeiro] = vetorN[ultimo];
            vetorN[ultimo] = aux;
            primeiro++;
            ultimo--;
        }

       
        for (int i = 0; i < vetorN.length; i++) {
            System.out.println("N[" + i + "] = " + vetorN[i]);
        }
    }

}