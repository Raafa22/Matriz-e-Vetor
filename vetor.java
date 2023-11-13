package vetorematrizes;

import java.util.Arrays;
import java.util.Scanner;

public class vetor{

    public static void main(String[] args) {
    	int numeroPesquisa;
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroPesquisa1 = leia.nextInt();

        int posicao = Arrays.binarySearch(vetor, 10);

        if (posicao >= 0) {
            System.out.println("O número " + numeroPesquisa1 + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + numeroPesquisa1 + " não foi encontrado!");
        }
        
       
    }
    
}