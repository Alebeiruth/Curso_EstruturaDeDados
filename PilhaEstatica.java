// Classe PilhaEstatica que implementa a interface Pilha
public class PilhaEstatica implements Pilha {
    private int[] dados; //array q armazena os elementos da pilha
    private int topo = -1; // indice q controla o topo da pilha

    //construtor
    private PilhaEstatica(int tamanho) {
        dados = new int[tamanho]; //inicia o array c/ taqmanho especifico
    }

    //verificia se a pilha é vazia
    public boolean isVazia() {
        return topo == -1; //se topo for -1 então vazia
    }
    //verificia se a pilha é cheia
    public boolean isCheia() {
        return topo == dados.length - 1; // se topo for == tamanho max do array
    }
    //adciona elemento na pilha
    public void adicionar(int valor) {
        if (isCheia()) {
            throw new IllegalStateException("Pilha cheia!"); //throw/lança exceção se pilha está cheia
        }
        topo++; //adc o topo
        dados[topo] = valor; //armazena valor no topo da pilha
    }
    //remove da pilha
    public int remover() {
        if (isVazia()) {
            throw new IllegalStateException("Pilha vazia!"); //throw/lança exceção se pilha está vazia
        }
        int valor = dados[topo]; //acha o vakir no topo da pilha
        dados[topo] = 0; //define o valor no topo como 0 (opcional)
        topo--; //decrementa o topo
        return valor; //retorna o valor removido
    }
    //limpa a pilha, deletando todos os elementos
    public void limpar() {
        for (int i = 0; i <= topo; i++) {
            dados[i] = 0; //define o topo da pilha como 0
        }
        topo = -1; //define o topo como -1 pra indicar que pilha está vazia
    }
}