//Implementação de PILHA

public interface Pilha {
    void adcionar (int valor);
    int remover();
    boolean isCheia();
    boolean isVazia();

    void limpar();
}

// pilha que não modifica seu volume
public class PilhaEstatica implements Pilha {
    private int[] dados;
    private int topo = -1;

    public PilhaEstatica (int tamanho) {
        dados = new int [tamanho];
    }
    public boolean isVazia() {
        return topo == -1;
    }
}

public boolean isCheia(){
    return topo == dados.length-1;
}

//metodo adcionar
public void adcionar(int dados){
    if(isCheia()){
        throw new;
    }
    topo = topo + 1;
    dados[topo] = dados;
}

//metodo remover
public int remover(){
    if(isVazia()){
        throw new IllegalStateException("Pilha vazia!");
    }

    int valor = dados[topo];
    dados[topo] = 0;
    topo = topo -1;
    return valor;
}

//limpeza da pilha
public void limpar(){
    topo = -1;
    for (int i =0; i <= topo; i++){
        dados[i] = 0;
    }
}

}