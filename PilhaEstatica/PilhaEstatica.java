public class PilhaEstatica {

    private int[] vetorElementos;
    private int numeroElementos;

    public PilhaEstatica(int capacidade){
        this.numeroElementos = 0;
        this.vetorElementos = new int[capacidade];
    }


    public boolean pilhaVazia(){
        if (this.numeroElementos==0){
            return true;
        }else{
            return  false;
        }
    }

    public boolean pilhaCheia(){
        if (this.numeroElementos>=this.vetorElementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void empilhar(int elem){
        if(pilhaCheia()){
            System.out.println("estrutura cheia");
        }else{
            int indice = this.numeroElementos;
            this.vetorElementos[indice] =elem;
            this.numeroElementos = numeroElementos + 1;
        }
    }

    public  int desempilhar() throws Exception {

        if (pilhaVazia()) {
            throw new Exception("estrutura vazia");
        } else {
            int indice = this.numeroElementos - 1;
            int elementoRemovido = this.vetorElementos[indice];
            this.numeroElementos =  indice;
            return  elementoRemovido;
        }

    }


}
