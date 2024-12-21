// Escreva uma função que receba uma lista de nomes e, dado um índice K, exiba o K-ésimo nome da lista ordenada alfabeticamente.

import java.util.Arrays;

import java.util.Scanner;

public class ListaChamada {
 public static void listaChamada() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
         
        int K = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente
        

        String[] resultado = new String[N]; 
     

        for (int i = 0; i < N; i++) {
            resultado[i] = sc.nextLine();

          
        }

        Arrays.sort(resultado);

        if (K > 0 && K <= N) {
           System.out.println(resultado[K-1]);
        }
   

        sc.close();
    }
}