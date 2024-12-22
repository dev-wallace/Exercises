
// Este programa conta o número de ocorrências da letra 'a' (ignorando maiúsculas e minúsculas) em uma string fornecida.
// Ele percorre cada caractere da string e incrementa um contador sempre que encontra a letra 'a'.

public class ExistenciaLetraA {
    public static int contarLetraA(String texto) {
        
        int contador = 0;
        // Convertemos o texto para minúsculas para simplificar a contagem
        texto = texto.toLowerCase();

        // Percorremos cada caractere do texto
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
    

}