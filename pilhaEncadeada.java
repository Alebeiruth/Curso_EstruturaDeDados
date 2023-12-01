public class PilhaEncadeada<T> implements Pilha<T> {
    //classe interna de um nó em pilha
    private static class No<T> {
        public No<T> anterior; //nó anterior referencia
        public T dado; //dado armazenado no Nó

        //contrutor do nó
        public No(T dado) {
            this.dado = dado;
            this.anterior = null; //inicializador nó anterior como nulo
        }
    }

    private No<T> topo = null; //topo da pilha

    @Override
    public boolean isCheia() {
        return false; // Uma pilha encadeada nunca fica cheia
    }

    @Override
    public boolean isVazia() {
        return topo == null; //verifica se topo é nulo
    }

    @Override
    public void adicionar(T valor) {
        No<T> novo = new No<>(valor); // Cria o nó com o valor especificado
        novo.anterior = topo; // Associa o anterior ao topo
        topo = novo; // Atualiza o topo
    }

    @Override
    public T remover() {
        if (isVazia()) {
            throw new IllegalStateException("Pilha vazia!"); // lança a exceção
        }

        T dado = topo.dado; //obtem dado do topo da pilha
        topo = topo.anterior; //atualiza o topo para o nó anterior
        return dado; // retorna o dado removido
    }

    @Override
    public void limpar() {
        topo = null; //limpa toda pilha e define o topo como nulo
    }
}
