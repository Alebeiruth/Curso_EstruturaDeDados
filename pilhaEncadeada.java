// todo int vai ser substituido por T
public interface pilhas<T> {
    void adcionar (T valor);
    T remover();
    bollena isCheia();
    boolean isVazia();
    void limpar();
}


public class PilhaEncadeada<T> implements pilhas<T> {
    //classe interna de um nó em pilha
    private static class No<T> {
        public No anterior; //nó anterior referencia
        public T dado; //dado armazenado no Nó
        
    }
    private No<T> topo = null; //topo da pilha é nulo

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
        var novo = new No<T>(); // Cria o nó com o valor especificado e associa o dado
        novo.dado = valor // novo valor é inserido
        novo.anterior = topo; // Associa o anterior ao topo passado
        topo = novo; // Atualiza o topo com o novo nó
    }

    @Override
    public T remover() {
        if (isVazia()) {
            throw new IllegalStateException("Pilha vazia!"); // lança a exceção
        }

        var dado = topo.dado; //obtem dado do topo da pilha
        topo = topo.anterior; //atualiza o topo para o nó anterior
        return dado; // retorna o dado removido
    }

    @Override
    public void limpar() { //garabage colletor desaloca todos os nós da memoria automanticamente
        topo = null; //limpa toda pilha e define o topo como nulo
    }
}
