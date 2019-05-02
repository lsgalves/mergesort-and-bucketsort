package sort;

import java.util.Arrays;

/**
 *
 * @author Leo
 */
public class MergeSort {

    public static void sort(int[] vetorNaoOrdenado) {
        int[] aux = new int[vetorNaoOrdenado.length];
        mergeSort(vetorNaoOrdenado, aux, 0, vetorNaoOrdenado.length - 1);
    }
    
    public static void mergeSort(int[] vetorNaoOrdenado, int[] aux, int inicio, int fim) {
        if (inicio < fim) {
            int meio = inicio + (fim - inicio) /2;
            mergeSort(vetorNaoOrdenado, aux, inicio, meio);
            mergeSort(vetorNaoOrdenado, aux, meio + 1, fim);
            merge(vetorNaoOrdenado, aux, inicio, meio, fim);
        }
    }
    
    public static void merge(int[] vetorNaoOrdenado, int[] aux, int inicio, int meio ,int fim) {
        for (int i = inicio; i <= fim; i++)
            aux[i] = vetorNaoOrdenado[i];

        int left = inicio;
        int mid = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (left > meio) vetorNaoOrdenado[i] = aux[mid++];
            else if (mid > fim) vetorNaoOrdenado[i] = aux[left++];
            else if (aux[left] < aux[mid]) vetorNaoOrdenado[i] = aux[left++];
            else vetorNaoOrdenado[i] = aux[mid++];
        }
    }

    public static void main(String[] args) {
        int[] vetor = {4, 6, 7, 3, 5, 1, 2, 8};        
        
        MergeSort.sort(vetor);        

        System.out.println(Arrays.toString(vetor));        
    }
}
