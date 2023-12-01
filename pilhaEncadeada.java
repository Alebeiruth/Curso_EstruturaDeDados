public class PilhaEncadeada<T> implements Pilha<T> {

    private static class No<T> {
        public No<T> anterior;
        public T dado;
        
        public No(T dado) {
            this.dado = dado;
            this.anterior = null;
        }
    }

    private No<T> topo = null;

    @Override
    public boolean isCheia() {
        return false; // Uma pilha encadeada nunca fica cheia
    }

    @Override
    public boolean isVazia() {
        return topo == null;
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
            throw new IllegalStateException("Pilha vazia!");
        }

        T dado = topo.dado;
        topo = topo.anterior;
        return dado;
    }

    @Override
    public void limpar() {
        topo = null;
    }
}
