
// Este programa busca dois índices em um vetor cuja soma dos elementos seja igual a um valor alvo (target), utilizando uma abordagem de força bruta com complexidade quadrática.

public class DuasSomas {
    public static int[] duasSomas(int[] vetorRandomizado, int target) {
        //solucao complexidade quadratica(forca bruta)
        for (int i = 0; i < vetorRandomizado.length; i++) {
            for (int j = i + 1; j < vetorRandomizado.length; j++) {
                if (vetorRandomizado[i] + vetorRandomizado[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

      
        return vetorRandomizado;
    }
    
}

