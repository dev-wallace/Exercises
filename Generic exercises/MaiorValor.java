// Este programa encontra o maior valor em um vetor de inteiros.
// Ele percorre o vetor, comparando os elementos para determinar o maior número, que é retornado no final.

public class MaiorValor {
    public static int maiorValor (int[] vetorRandomizado) {
         


        int maior;
    
        maior = vetorRandomizado [0];

        for(int i = 0; i<vetorRandomizado.length;i++){
           
                if (vetorRandomizado[i] >maior){
                    maior= vetorRandomizado [i];
                  
                }

            }
        
        return maior;
        
    }
  
    
}