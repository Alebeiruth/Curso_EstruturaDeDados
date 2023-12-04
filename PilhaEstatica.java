// Classe PilhaEstatica que implementa a interface Pilha
// Tamanho é quantidade de elementos inseridos em seu interior (topo+1) > inicial zero, se inserir 2 elementos, seu tamanho será 2
// capacidade é quantidade máxima de elementos que podem ser inseridos (tamanho do vetor de dados), no exemplo a capacidade max é 5 elementos, indice 4

public class PilhaEstatica implements Pilha {
    private int[] dados; //array q armazena os elementos da pilha
    private int topo = -1; // indice q controla o topo da pilha

    //construtor
    public PilhaEstatica(int capacidade) {
        dados = new int[capacidade]; //inicia o array c/ capacidade especifica
    }

    //verificia se a pilha é vazia
    public boolean isVazia() { 
        return topo == -1; //se topo for -1 então vazia, is True
    }
    //verificia se a pilha é cheia
    public boolean isCheia() { 
        return topo == dados.length - 1; // se topo for == tamanho max do array, dados.length -1 representa o indice
    }
    //adciona elemento na pilha
    public void adicionar(int valor) {
        if (isCheia()) { // ele teste se topo é igual ao ultimo indice, nesse caso topo == 4
            throw new IllegalStateException("Pilha cheia!"); //throw/lança exceção se pilha está cheia
        }
        topo++; //adc o topo um, uma posição no indice
        dados[topo] = valor; //armazena valor no topo da pilha no indice/posição do topo
    }
    //remove da pilha
    public int remover() {
        if (isVazia()) {
            throw new IllegalStateException("Pilha vazia!"); //throw/lança exceção se pilha está vazia
        }
        int valor = dados[topo]; //acha o vakir no topo da pilha
        dados[topo] = 0; //define o valor no topo como 0 (opcional) e não indice
        topo--; //decrementa o topo e aponta para elemento imediato abaixo da pilha, e se torna o novo topo da pilha
        return valor; //retorna o valor removido
    }
    //limpa a pilha, deletando todos os elementos
    public void limpar() {
        for (int i = 0; i <= topo; i++) { //percorrer toda a lista limpando o vetor de dados
            dados[i] = 0; //define o topo da pilha como 0
        }
        topo = -1; //define o topo como -1 pra indicar que pilha está vazia
    }
