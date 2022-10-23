public class ListaEncadeadaPilha {

    Nó inicio_pilha;

    public  ListaEncadeadaPilha(){
        inicio_pilha = null;
    }

    public boolean Lista_vazia(){
        if(this.inicio_pilha ==null){
            return  true;
            
        }else {
            return false;
        }
    }

    public  void  empilhar(int e){
        Nó novo = new Nó(e);
        if(Lista_vazia()){
            inicio_pilha = novo;
        }else{
            Nó auxiliar = inicio_pilha;
            while (auxiliar.proximo_no!=null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
        }
    }


    public  Nó desempilhar(){
        Nó removido = null;
        Nó auxiliar;
        if(Lista_vazia()){
            System.out.println("pilha vazia");
        }else{
            removido = auxiliar = inicio_pilha;
            while (removido.proximo_no!=null){
                auxiliar = removido;
                removido = removido.proximo_no;
            }
            auxiliar.proximo_no = null;
        }
        return removido;
    }

    
}
