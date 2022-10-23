public class ListaEncadeadaFila {

    Nó inicio_fila;

    public  ListaEncadeadaFila(){
        inicio_fila = null;
    }

    public boolean fila_vazia(){

        if(this.inicio_fila ==null){
            return  true;
        }else {
            return false;
        }
    }


    public  void entrarNaFila(int e){
        Nó novo = new Nó(e);
        if(fila_vazia()){
            inicio_fila = novo;
        }else{
            Nó auxiliar = inicio_fila;
            while (auxiliar.proximo_no!=null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
        }
    }

    public Nó sairDaFila(){
        Nó removido = null;
        if(fila_vazia()){
            System.out.println("Fila vazia");
        }else{
            removido = inicio_fila;
            inicio_fila = inicio_fila.proximo_no;
        }
        return removido;
    }










}
