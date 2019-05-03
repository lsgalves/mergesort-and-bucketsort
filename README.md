# Trabalho em Grupo - Sort Algorithms

Ambos os algoritmos estudados primeiro separam os elementos para em seguida ordenar. Bem... como dizia Jack Estripador, vamos por partes.

### Merge

![alt text][merge-image]

De [Wikipedia][merge-wiki]: O merge sort, ou ordenação por mistura, é um exemplo de algoritmo de ordenação por comparação do tipo "dividir para conquistar".
Sua ideia básica consiste em Dividir (o problema em vários subproblemas e resolver esses subproblemas através da recursividade) e Conquistar (após todos os subproblemas terem sido resolvidos ocorre a conquista que é a união das resoluções dos subproblemas). Como o algoritmo Merge Sort usa a recursividade, há um alto consumo de memória e tempo de execução, tornando esta técnica não muito eficiente em alguns problemas.

#### Como Funciona

> divir, conquistar e combinar
1. Dividir: Calcula o meio do vetor.
2. Conquistar: Recursivamente realiza duas operações uma em cada metade dos arranjos.
3. Combinar: Unir os sub-arranjos em um único conjunto ordenado.

### Bucket

![alt text][bucket-image]

De [Wikipedia][bucket-wiki]: O bucket sort, ou bin sort, é um algoritmo de ordenação que funciona dividindo um vetor em um número finito de recipientes. Cada recipiente é então ordenado individualmente, seja usando um algoritmo de ordenação diferente, ou usando o algoritmo bucket sort recursivamente.

#### Como Funciona

1. Inicialize um vetor de "baldes", inicialmente vazios.
2. Vá para o vetor original, incluindo cada elemento em um balde.
3. Ordene todos os baldes não vazios.
4. Coloque os elementos dos baldes que não estão vazios no vetor original.

------

## Grupo

* Anne Tozatto
* Gabriel Viana
* Leonardo Galves
* Moises
* Murilo Jubertoni

[merge-wiki]: https://pt.wikipedia.org/wiki/Merge_sort
[merge-image]: https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif "Merge Sort"
[bucket-wiki]: https://pt.wikipedia.org/wiki/Bucket_sort
[bucket-image]: https://upload.wikimedia.org/wikipedia/commons/8/8f/Bucket_sort_concept.svg "Bucket Sort"
