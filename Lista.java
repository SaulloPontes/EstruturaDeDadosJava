public class Lista {

     private int[] vetorElementos;
    private int numeroElementos;

    public Lista(int capacidade){
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

    public void adicionarInicio(int elem){
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            for(int indice = this.numeroElementos;indice>0;indice--){
                this.vetorElementos[indice] = this.vetorElementos[indice-1];
            }
            this.vetorElementos[0] = elem;
            this.numeroElementos ++;
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

    public void  adicionarPosicao(int elem, int i)  {
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            if(i<=0){
                this.adicionarInicio(elem);
            }else if(i>=numeroElementos){
                this.adicionarFinal(elem);
            }else{
                for(int indice=this.numeroElementos;indice>i;indice--){
                    this.vetorElementos[indice] = this.vetorElementos[indice-1];
                }
                this.vetorElementos[i] = elem;
                this.numeroElementos ++;
            }
        }
    }

    public  int removerPosicao(int i) throws  Exception{
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            if(i<=0){
                return this.removerInicio();
            }else if(i>=this.numeroElementos){
                return this.removerFinal();
            }else{
                int elementoRemovido = this.vetorElementos[i];
                for(int indice =i;indice<this.numeroElementos-1;indice++){
                    this.vetorElementos[indice] = this.vetorElementos[indice+1];
                }
                this.numeroElementos --;
                return  elementoRemovido;

            }
        }
    }
