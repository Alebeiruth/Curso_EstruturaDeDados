public interface lista<T> {
  //informações > metodos
  boolean isVazia();
  boolean isCheia();
  int getTamanho();
  
  //inclusão de itens > metodos
  void adicionar(T valor);
  void adicionar(int pos, T valor);
  
  //exclusão de itens > metodos
  void limpar();
  T remover(int pos);
  
  //acesso direto a valores da lista > metodos
  T get(int pos);
  void set (int pos, T valor);
  
  //metodo para buscar itens > metodos
  int indice(T valor);
  int ultimoIndice(T valor);
}

// DIFERENÇA tamanho > quantidade de elementos dentro da lista
// capacidade > é a quantidade maxima de elementos que podem ser adcionados a lista, ou seja, ao tamanho do vetor de dados
// indice tera os valores no intervalo de 0 até o tamanho da lista menos um

public class ListaEstatica<T> implements Lista<T> {
  // atributos
  private T[] dados;
  private int tamanho;//diferença pilha e fila > tamanho indica a qnt de elementos inseridos, e nao indice do ultimo elemento como na pilha
  // construtor
  public ListaEstatica (int capacidade) {
    this.dados = (T[]) new Object[capacidade];
  }
  //metodo tamanho
  public int getTamanho() {
    return tamanho;
  }
  //metodo capacidade
  public int getCapacidade() {
    return dados.length;
  }
  //metodo se a lista está vazia
  public boolean isVazia() {
    return getTamanho() == 0; //se tamanho for 0, lista vazia
  }
  //metodo se a lista está cheia > GET retorna um elemento em um determinado indice
  public boolean isCheia() {
    return getTamanho() == getCapacidade(); //se tamanho for capacidade Max da lista, lista cheia
  }

  //metodo adcionar
  public void adicionar(int pos, T valor) {
    if(isCheia()) {
      throw new IllegalStateException("Lista cheia!");
    }
    Objects.checkIndez(pos, tamanho + 1); //verifica se o indice é VALIDO

    //Move os dados para a direita
    for (int i = tamanho - 1; i >= pos; i--) {
      dados[i + 1] = dados [i];
    }
    dados[pos] = valor; //insere o dado
    tamanho = tamanho + 1; //aumenta o tamanho
  }
  
  
  
  


