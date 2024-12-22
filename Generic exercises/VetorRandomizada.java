// Este programa preenche um vetor fornecido como parâmetro com valores aleatórios entre 0 e 99.
// Ele utiliza a classe Random para gerar os números e retorna o vetor preenchido.
import java.util.Random;
public class  VetorRandomizada {


    public static int []  vetorRandomizado (int[] vetorRandomizado) {

    Random random = new Random();
   

      
        
        for(int i = 0; i<vetorRandomizado.length; i ++){
            

           vetorRandomizado [i]  = random.nextInt(0,100);
            }
        
        return vetorRandomizado;

    }
    
}