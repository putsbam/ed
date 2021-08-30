package arranjo;

public class Arranjo<T> {

    private T[] Data;
    
    @SuppressWarnings("unchecked")
    public Arranjo(int tam) {
        this.Data = (T[]) new Object[tam];
    }

    public T Get(int i) {
        return this.Data[i];
    }

    public void Set(int i, T obj) {
        this.Data[i] = obj;
    }

    public void Imprime() {
        System.out.print("[");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+" ");
        }
        System.out.println("]");
    }


    // Editado a partir daqui

    // Lista 03

    // Q.3 - a) Método para inserir na ultima posicao nao ocupada do arranjo

    public void q3a(T data){

        int n = 0; // num da posicao

        for (int i = 0; i < this.Data.length; i++){ // loop pelo array inteiro, incrementando +1

            n=i; // n recebe i, que foi incrementado ate chegar na ultima posicao do array

        }
        if(this.Data[n]==null){ // caso a data do array na posicao "n" seja null (ultima posicao)

            this.Data[n] = data; // recebe o valor data

        }

    }

    // Q.3 - b) Método para inserir na primeira posicao do arranjo

    public void q3b (T dado) {
        //checar se o array está cheio criando um contador de espaços preenchidos
        int cont = 0;
        for (int i=0; i < this.Data.length; i++) {
            if (this.Data[i] == null) {
                break;
            } else {
                cont++;
            }
        }
        if (cont <= (this.Data.length)) { //se não estiver cheio, mover os valores e setar o valor no index 0
            for (int j = this.Data.length-1; j > 0; j--){
                this.Data[j] = this.Data[j-1];
            }
            Set(0, dado);
        } else { //se estiver cheio, disparar exceção
            System.out.println("O arranjo já está preenchido! Não é possível inserir novos dados.");
        }
    }

    // Q.3 - c) Método para inserir um dado em uma dada posição do arranjo

    public void q3c(int p, T obj) {
        T a;
        T b;
        for (int i=0; i < this.Data.length; i++) {
            if (p == i) {
                a = this.Data[i];
                this.Data[i] = obj;
                for (int j=1+p; j < this.Data.length; j++){
                    b = this.Data[j];
                    this.Data[j] = a;
                    a = b;
                }
            }
        }
    }

    // Q.3 - d) Método para remover e retornar o dado da última posição ocupada do arranjo

    public T q3d(){
        int dataLength = this.Data.length;
        T data = this.Data[dataLength-1];
        this.Data[dataLength-1] = null;
        return data;
    }


    // Q.3 - e) Método para remover e retornar o dado da primeira posição do arranjo

    public T q3e () {
        T dado = this.Data[0];

        for (int j=1; j < this.Data.length; j++){
            this.Data[j-1] = this.Data[j];
        }
        Set((this.Data.length-1), null);
        return dado;
    }

    // Q.3 - f) Método para remover o dado da posição determinada do arranjo

    public void q3f(int p) {
        for (int i=0; i < this.Data.length; i++) {
            if (p == i) {
                for (int j=1+p; j < this.Data.length; j++){
                    this.Data[j-1] = this.Data[j];
                }
            }
        }
    }

}

