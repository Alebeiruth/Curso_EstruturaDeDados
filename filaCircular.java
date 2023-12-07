public interface Fila<T> {
  void adicionar(T valor);
  T remover();
  boolean isCheia();
  boolean isVazia();
  void limpar();
}

public class filaCircular<T> implements Fila<T> {
  private int base = 0;
  private int topo = -1;

  private T[] dados;

  public filaCircular(int tamanho) {
    this.dados = (T[]) new Object [tamanho];
  }

  private int mover(int posicao) {
    return posicao + 1 == dados.length ? 0 : posicao + 1;
  }

  public boolean isVazia() {
    return topo == -1;
  }

  public boolean isCheia() {
    return !isVazia() && mover(topo) == base;
  }

  public void adcionar(T valor) {
    if (isCheia()) {
      throw new IllegalStateException("Fila cheia!");
    }

    topo = mover(topo);
    dados[topo] = valor;
  }

  public T remover() {
    if(isVazia)) {
      throw new IllegalStateException("Fila vazia!");
    }

    T dado = dados[base];
    if (base == topo) {
      limpar();
    } else {
      dados [base] = null;
      base = mover(base);
    }
    return dado;
  }

  public void limpar() {
    base = 0;
    topo = -1;
    for (int i = 0; i < daods.length; i++) {
      dados[i] = null;
    }
  }
