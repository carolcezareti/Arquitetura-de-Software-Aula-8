package arqsw_exercicio6_2;

public class Teste {
	
	public static void main(String[] args) {
		
		int[] vetor4 = {1234, 2345, 345678, 2,3,-1, 3214};
		int[] vetor3 = {1234, 2345, 345678, 2,3,-1, 3214};
		int[] vetor2 = {1234, 2345, 345678, 2,3,-1, 3214};
		int[] vetor1 = {1234, 2345, 345678, 2,3,-1, 3214};
		
		Ordenacao insert = new InsertSort();
		Ordenacao bubble = new Bolha();
		Ordenacao quick = new QuickSort();
		Ordenacao selection = new SelectionSort();
		
		bubble.ordena(vetor1);
		
		for (int i=0; i < vetor1.length; i++) {
			System.out.println(vetor1[i]);
		}
		
	}

}
