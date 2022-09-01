public class ListaEncadeada {

    private Nó inicio_lista;

    public  ListaEncadeada(){
        inicio_lista = null;
    }

    public boolean Lista_vazia(){
        if(this.inicio_lista==null){
            return  true;
        }else {
            return false;
        }
    }

    public  void  Adicionar_inicio(int e){
        Nó novo = new Nó(e);
        if(!Lista_vazia()){
            novo.proximo_no = inicio_lista;
        }
        inicio_lista = novo;
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

    public  Nó Remover_final(){
        Nó removido = null;
        Nó auxiliar;
        if(Lista_vazia()){
            System.out.println("estrutura vazia");
        }else{
            removido = auxiliar = inicio_lista;
            while (removido.proximo_no!=null){
                auxiliar = removido;
                removido = removido.proximo_no;
            }
            auxiliar.proximo_no = null;
        }
        return removido;
    }

}
