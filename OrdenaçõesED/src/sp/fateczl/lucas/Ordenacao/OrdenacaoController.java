package sp.fateczl.lucas.Ordenacao;

public class OrdenacaoController {

	public OrdenacaoController() {	}
	
	// Implementacao do BubbleSort
	public void bubbleSort(int vetor[]) {
		int aux;
		
		for (int i = 0; i < vetor.length; i++) {
			if (i == (vetor.length - 1)) continue;
			
			if (vetor[i] > vetor[i+1]) {
				aux = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = aux;
			}
		}
	}
	// Fim implementacao
	
	// Implementacao do MergeSort
	public int[] mergeSort(int vetor[], int inicio, int fim) {
		if (inicio > fim) {
			int aux = inicio;
			inicio = fim;
			fim = aux;
		}
		
		int meio = (inicio + fim) / 2;
		mergeSort(vetor, inicio, meio);
		mergeSort(vetor, meio+1, fim);
		intercalarVetores(vetor, inicio, meio, fim);
		
		return vetor;
	}

	private void intercalarVetores(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[vetor.length];
		
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		
		int esquerda = inicio;
		int direita = meio + 1;
		
		for (int i = inicio; i <= fim; i++) {
			if (esquerda > meio) {
				vetor[i] = novoVetor[direita];
				direita++;
			} else if (direita > fim) {
				vetor[i] = novoVetor[esquerda];
				esquerda++;
			} else if (novoVetor[esquerda] < novoVetor[direita]) {
				vetor[i] = novoVetor[esquerda];
				esquerda++;
			} else {
				vetor[i] = novoVetor[direita];
				direita++;
			}
		}
		
	}
	
}
	
	// Fim implementacao
