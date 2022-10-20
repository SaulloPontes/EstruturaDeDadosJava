public class FilaEstatica {

    private int[] vetorElementos;
    private int numeroElementos;

    public FilaEstatica(int capacidade){
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

    

    public  int removerInicio() throws Exception {
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            int elementoRemovido = this.vetorElementos[0];
            for(int indice =1;indice<this.numeroElementos;indice++){
                this.vetorElementos[indice-1] = this.vetorElementos[indice];
            }
            this.numeroElementos --;
            return  elementoRemovido;
        }
    }



}


