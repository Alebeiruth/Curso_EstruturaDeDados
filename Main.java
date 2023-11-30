public class Main {
    public static void main(String[] args) {
        Pilha ps = new PilhaEstatica(10);
        // adc os numeros de 0 a 9
        for (int i =0; i < 10; i++) {
            ps.adicionar(i);
        }
        //remover
        while(!ps.isVazia()){
            System.out.println(ps.remover() + " ");
        }
    }
}
