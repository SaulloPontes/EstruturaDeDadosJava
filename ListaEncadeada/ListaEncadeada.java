public class ListaEncadeada {

     Nó inicio_lista;

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

    public void Adicionar_posicao(int e,int i){
        if(Lista_vazia() || i<=0){
            Adicionar_inicio(e);
        }else{
            Nó novo = new Nó(e);
            Nó auxiliar = inicio_lista;
            int indice = 0;
            while(indice<i && auxiliar!=null){
                auxiliar = auxiliar.proximo_no;
                indice = indice + 1;
            }
            if(auxiliar==null){
                Adicionar_final(e);
            }else{
                novo.proximo_no = auxiliar.proximo_no;
                auxiliar.proximo_no = novo;
            }
        }
    }


    public Nó removerPosicao(int i){
        Nó removido = null;
        Nó auxiliar;
        int indice =0;
        if(Lista_vazia() || i<=0){
            removido = Remover_Inicio();
        }else{
            removido = auxiliar = inicio_lista;

            while (indice<i && removido!=null){
                auxiliar = removido;
                removido = removido.proximo_no;
                indice++;
            }
            if(removido==null){
                removido = Remover_final();
            }else{
                auxiliar.proximo_no = removido.proximo_no;
            }
        }
        return removido;
    }



  
    public  Nó ultimo_elemento(){

        Nó ult =this.Remover_final();
        int x = ult.elemento_armazenado;
        this.Adicionar_final(x);

        return   ult;
    }

    public  Nó penultimo_elemento(){

        Nó ult =this.Remover_final();
        Nó penu =this.Remover_final();
        int valorUlt = ult.elemento_armazenado;
        int valorPenu = penu.elemento_armazenado;
        this.Adicionar_final(valorPenu);
        this.Adicionar_final(valorUlt);

        return penu;
    }

    public Nó retornar_posicao(int pos){

       Nó removido = this.removerPosicao(pos);
       int posicaoElemento = removido.elemento_armazenado;
       this.Adicionar_posicao(posicaoElemento,pos);
       return removido;
    }

    public  void  inverter_lista(){

        Nó noAtual;
        int cont = 0;
        int contInver = 0;
        noAtual = inicio_lista;

        while(noAtual != null){
            cont++;
            noAtual = noAtual.proximo_no;

        }

        for(int i = cont;i>0;i--){

            Nó ultimo = removerPosicao(i);
            int elem = ultimo.elemento_armazenado;
            this.Adicionar_posicao(elem,contInver);
            contInver++;
        }

    }
    
    /*
    public void verLista(){
        Nó noAtual;
        noAtual = inicio_lista;
        while(noAtual != null){
            System.out.println(noAtual.elemento_armazenado);
            noAtual = noAtual.proximo_no;
        }
    }
*/
}
