
// Este programa calcula e retorna a média dos números pares em um vetor de inteiros.

public class MediaPares {
    public static double calcularMediaPares(int[] vetorRandomizado) {

      
        double aux;
        double soma =0;
        
        for(int i = 0; i < vetorRandomizado.length;i++){
            if(vetorRandomizado[i]%2 == 0){
                aux = vetorRandomizado[i];

                soma += aux;
                
                
               

            }
            soma = soma / (i + 1);
          
           
        }
        return soma;

    }

}