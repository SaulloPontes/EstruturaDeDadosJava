public class FilaEstatica {

    private int[] vetorElementos;
    private int numeroElementos;

    public FilaEstatica(int capacidade){
        this.numeroElementos = 0;
        this.vetorElementos = new int[capacidade];
    }


    public boolean filaVazia(){
        if (this.numeroElementos==0){
            return true;
        }else{
            return  false;
        }
    }

    public boolean filaCheia(){
        if (this.numeroElementos>=this.vetorElementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void entrarNaFila(int elem){
        if(filaCheia()){
            System.out.println("Fila cheia");
        }else{
            int indice = this.numeroElementos;
            this.vetorElementos[indice] =elem;
            this.numeroElementos = numeroElementos + 1;
        }
    }



    public  int sairDaFila() throws Exception {
        if(filaVazia()){
            throw new Exception("Fila vazia");
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

