package vetorematrizes;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
	
		int matriz [][] = new int[3][3];
		int linha , coluna = 0 ,somaDiogonal=0,somaDiagSec=0;
		Scanner leia = new Scanner (System.in);
		
		int somaDiagonal = 0;
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = leia.nextInt();
		
						
				if(linha == coluna) {
					somaDiagonal += matriz[linha][coluna];
				}
				
				if((linha+coluna) == 2) {
					somaDiagSec += matriz[linha][coluna];
				}
			}
		}
		
		System.out.println("\nSomatório da diagonal principal: "+somaDiagonal);
		System.out.println("\nSomatório da diagonal secundária: "+somaDiagSec);

	}

}

				
		

