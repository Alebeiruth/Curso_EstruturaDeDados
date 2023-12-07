publc classe filaEncadeada<T> implements Fila <T> {
  private static class No<T> {
  T daod;
  No proximo;
}

private No<T> base =null;
private No<T> topo = null;

public void adicionar(T valor) {
  var no = new No<T>();
  no.dado = valor;

if (isVazia()) {
  topo = no;
  base = no;
} else {
  topo.proximo = no;
  topo = no;
}
}

public T remover() {
  if (isVazia()) {
    throw new IllegalStateException("Fila vazia!");
  }
  T dado = base.dado;
  base = base.proximo;
  if (base == null) {
    topo = null;
  }
  return dado;
}

public boolean isCheia() {
  return false;
}

public boolean isVazia() {
  return base == null;
}

public void limpar() {
  base = null;
  topo = null;
}
}





  
