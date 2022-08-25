public class Lista {

     int[] vetorElementos;
     int numeroElementos;

    public Lista(int capacidade){
        this.numeroElementos = 0;
        this.vetorElementos = new int[capacidade];
    }


    public boolean listaVazia(){
        if (numeroElementos==0){
            return true;
        }else{
            return  false;
        }
    }

    public boolean listaCheia(){
        if (numeroElementos>=vetorElementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void adicionarFinal(int elem){
            if(listaCheia()){
                System.out.println("estrutura cheia");
            }else{
                int indice = numeroElementos;
                vetorElementos[indice] =elem;
                numeroElementos = numeroElementos + 1;
            }
    }



    public  int  removerFinal() throws Exception {

        if (listaVazia()) {
            throw new Exception("estrutura vazia");
        } else {
            int indice = numeroElementos - 1;
            int elementoRemovido = vetorElementos[indice];
            numeroElementos =  indice;
            return  elementoRemovido;
        }

    }

    public void adicionarInicio(int elem){
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            for(int indice = numeroElementos;indice>0;indice--){
                vetorElementos[indice] = vetorElementos[indice-1];
            }
            vetorElementos[0] = elem;
            numeroElementos = numeroElementos +1;
        }
    }

    public  int removerInicio() throws Exception {
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            int elementoRemovido = vetorElementos[0];
            for(int indice =1;indice<numeroElementos-1;indice++){
                vetorElementos[indice-1] = vetorElementos[indice];
            }
            numeroElementos = numeroElementos - 1;
            return  elementoRemovido;
        }
    }

    public void  adicionarPosicao(int elem, int i)  {
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            if(i<=0){
                adicionarInicio(elem);
            }else if(i>=numeroElementos){
                adicionarFinal(elem);
            }else{
                for(int indice=numeroElementos;indice>i;indice--){
                    vetorElementos[indice] = vetorElementos[indice-1];
                }
                vetorElementos[i] = elem;
                numeroElementos = numeroElementos + 1;
            }
        }
    }

    public  int removerPosicao(int i) throws  Exception{
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            if(i<=0){
                return removerInicio();
            }else if(i>=numeroElementos){
                return removerFinal();
            }else{
                int elementoRemovido = vetorElementos[i];
                for(int indice =i;indice<numeroElementos-1;indice++){
                    vetorElementos[indice] = vetorElementos[indice+1];
                }
                numeroElementos = numeroElementos-1;
                return  elementoRemovido;

            }
        }
    }

}


