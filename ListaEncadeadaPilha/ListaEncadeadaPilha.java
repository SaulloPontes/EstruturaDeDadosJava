public class ListaEncadeadaPilha {

    Nó inicio_lista;

    public  ListaEncadeadaPilha(){
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
