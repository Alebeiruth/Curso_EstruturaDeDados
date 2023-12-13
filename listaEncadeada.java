public class listaEncadea<T> implements Lista <T> {
  private static class No<T> {
    //atributos
    No<T> anterior;
    T dado;
    No<T> proximo;

  //constructor
  public No(T valor) {
    dado = valor;
    }
  }

  private No<T> base = null;
  private No<t> TOPO = null;
  private int tamanho = 0;

//metodo vazio
public boolean isVazia() {
  return tamanho == 0;
}

//metodo cheia
public boolena isCheia() {
  return false;
}

//metodo tamanho
public int getTamanho() {
  return tamanho;
}

  //metodoa adcionar
public void adicionar(T valor) {
  var no = new No<T>(valor);

  if(isVazia()) {
    base = no;
  } else {
    no.anterior = topo; //1
    topo.proximo = no; //2
  }
  topo = no; //3
  tamanho = tamanho + 1; //3
}
  

















