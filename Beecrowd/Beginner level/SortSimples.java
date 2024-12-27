import java.util.Scanner;

public class SortSimples {

    public static void sortSimples() {
        Scanner sc = new Scanner(System.in);

        int vetorA[] = new int[3];
        int vetorB[] = new int[vetorA.length];

        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }

        // Ordena o vetorA usando Bubble Sort 
        for (int i = 0; i < vetorA.length - 1; i++) {
            for (int j = 0; j < vetorA.length - 1 - i; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    int temp = vetorA[j];
                    vetorA[j] = vetorA[j + 1];
                    vetorA[j + 1] = temp;
                }
            }
        }

       
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("");

        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

        sc.close();
    }
}
