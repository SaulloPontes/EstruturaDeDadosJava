public class PilhaEstatica {

    private int[] vetorElementos;
    private int numeroElementos;

    public PilhaEstatica(int capacidade){
        this.numeroElementos = 0;
        this.vetorElementos = new int[capacidade];
    }


    public boolean listaVazia(){
        if (this.numeroElementos==0){
            return true;
        }else{
            return  false;
        }
    }

    public boolean listaCheia(){
        if (this.numeroElementos>=this.vetorElementos.length){
            return true;
        }else{
            return false;
        }
    }

   public void adicionarFinal(int elem){
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            int indice = this.numeroElementos;
            this.vetorElementos[indice] =elem;
            this.numeroElementos = numeroElementos + 1;
        }
    }
    
    public  int  removerFinal() throws Exception {

        if (listaVazia()) {
            throw new Exception("estrutura vazia");
        } else {
            int indice = this.numeroElementos - 1;
            int elementoRemovido = this.vetorElementos[indice];
            this.numeroElementos =  indice;
            return  elementoRemovido;
        }

    }


}
