// Escreva uma função que leia 15 números inteiros e os armazene em dois vetores separados: um para números pares e outro para números ímpares.
// Quando o vetor de pares ou ímpares atingir o tamanho máximo (5), os números são exibidos, e o contador é resetado para armazenar novos números.

import java.util.Scanner;

public class PreenchimentoVetor {
    public static void preenchimentoVetor(){

        Scanner sc = new Scanner(System.in);
        int vetorPar []= new int[5];
        int vetorImpar [] = new int[5];
        int contPar = 0, contImpar = 0;
    

    for(int i = 0;i<15;i++){
        int numero = sc.nextInt();

        if(contPar>=5){
            for(int j=0;j<vetorPar.length;j++){
                System.out.println("par["+j+"] = "+vetorPar[j]);

            }
            contPar = 0; 
        
        }
        if(contImpar>=5){
            for(int j=0;j<vetorImpar.length;j++){
                System.out.println("impar["+j+"] = "+vetorImpar[j]);

            }
            contImpar = 0; 
            
        }
        if(numero %2 ==0){
            vetorPar [contPar] = numero;
            contPar++;

        }
        else{
            vetorImpar[contImpar] = numero;
            contImpar++;
        }

    }
        // Exibe quaisquer números restantes no vetor de ímpares
    
        for (int j = 0; j < contImpar; j++) {
            System.out.println("impar["+j+"] = "+vetorImpar[j]);
        }

        // Exibe quaisquer números restantes no vetor de pares
        
        for (int j = 0; j < contPar; j++) {
            System.out.println("par["+j+"] = "+vetorPar[j]);
        }

    
        
    sc.close();
}

}