// Escreva uma função que leia N frases, ordene as palavras dentro de cada frase pelo tamanho de forma decrescente e exiba as frases resultantes.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenacaooTamanho {
    public static void ordenacaooTamanho() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] resultado = new String[N]; 
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String frase = sc.nextLine(); 
            String[] palavras = frase.split(" "); 

           
            Arrays.sort(palavras, Comparator.comparingInt(String::length).reversed());

            
            resultado[i] = String.join(" ", palavras);
        }

   
       
        for (String fraseOrdenada : resultado) {
            System.out.println(fraseOrdenada);
        }

        sc.close();
    }
}