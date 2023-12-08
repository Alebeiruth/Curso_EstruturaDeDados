public interface lista<T> {
  //informações
  boolean isVazia();
  boolean isCheia();
  int getTamanho();
  //inclusão de itens
  void adicionar(T valor);
  void adicionar(int pos, T valor);
  //exclusão de itens
  void limpar();
  T remover(int pos);
  //acesso direto a valores da lista
  T get(int pos);
  void set (int pos, T valor);
  //metoso para buscar itens
  int indice(T valor);
  int ultimoIndice(T valor);
}
