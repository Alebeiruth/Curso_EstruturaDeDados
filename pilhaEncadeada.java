private static class No<T>{
    public No anterior;
    public T dado;
}

public class pilhaEncadeada implements Pilha{
    private static class No {
        public No anterior;
        public T dado;
    }

    private No topo = null;

    public boolean isCheia(){
        return false;
    }

    public boolean isVazia(){
        return topo == null;
    }

    public void adcionar (T valor){
        var novo = new No<T>(); // Cria o no
        new dado = valor; // e associa o dado
        New anterior = new topo; // associa o anterior ao topo
        topo = novo;
    }

    public void remove(){
        is (isVazia()) {
            throw new IllegalStateException("Fila vazia!");
        }

        T dado = base.dado;
        base = base.proximo;
        if (base == null) {
            topo = null;
        }
        return dado;
    }

    public void limpar(){
        topo = null;
    }
//TESTAR ANTES DE COMEÇAR FILA
}

