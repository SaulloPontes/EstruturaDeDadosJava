public class ListaEncadeadaFila {

    Nó inicio_lista;

    public  ListaEncadeadaFila(){
        inicio_lista = null;
    }

    public boolean Lista_vazia(){
        if(this.inicio_lista==null){
            return  true;
        }else {
            return false;
        }
    }


    public  void  Adicionar_final(int e){
        Nó novo = new Nó(e);
        if(Lista_vazia()){
            inicio_lista = novo;
        }else{
            Nó auxiliar = inicio_lista;
            while (auxiliar.proximo_no!=null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
        }
    }

    public Nó Remover_Inicio(){
        Nó removido = null;
        if(Lista_vazia()){
            System.out.println("Estrutura vazia");
        }else{
            removido = inicio_lista;
            inicio_lista = inicio_lista.proximo_no;
        }
        return removido;
    }










}
