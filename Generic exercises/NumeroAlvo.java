// Este programa busca um número-alvo (target) em um vetor de inteiros.
// Ele retorna o índice do primeiro elemento encontrado que corresponde ao número-alvo ou -1 se o número não estiver presente no vetor.

public class NumeroAlvo {
    public static int  numeroAlvo (int target, int[] vetorRandomizado){
       

        for(int i = 0; i<vetorRandomizado.length;i++){
            
             if(vetorRandomizado[i] == target){
                return i;

             }
             

        }
        return -1;
    }

}