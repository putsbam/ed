package pilha;

public class Pilha {
    
    private int[] Dados;
    public int Topo;

    public void Imprime() {
        for (int i=0; i < this.Dados.length; i++) {
            System.out.println(this.Dados[i]);
        }
    }

    // EDITADO A PARTIR DAQUI

    /*

        public Pilha(int tam) {
            this.Dados = new int[tam+1];
            this.Topo = 0;
        }
        public void Push(int dado) {
            this.Topo += 1;
            this.Dados[this.Topo] = dado;
        }

        public int Pop() throws Exception {
            if (this.StackEmpty()) {
                throw new Exception("Pilha vazia");
            } else {
                this.Topo -= 1;
                return this.Dados[this.Topo+1];
            }
        }
        public boolean StackEmpty() {
            if (this.Topo == 0) {
                return true;
            } else {
                return false;
            }
        }
     */

    // Os métodos Pop(), Push() e a classe Pilha foram alterados e/ou criados para melhor funcionamento

    public Pilha(int tam) {
        this.Dados = new int[tam];
        this.Topo = 0;
    }

    public int Pop() throws Exception {
        if (this.StackEmpty()) {
            this.Topo = 0;
            throw new Exception("Pilha vazia");
        } else {
            int a  = this.Dados[this.Topo-1];
            for (int i=0;i<this.Topo;i++){
                this.Dados[this.Topo-(1+i)] = 0;
                this.Topo -= 1;
            }
            return a;
        }
    }

    public boolean StackEmpty() {
        if (this.Topo == 0) {
            return true;
        } else {
            return false;
        }
    }

    // LISTA 04

    // Q.2

    public boolean StackFull() {
        if (this.Topo == this.Dados.length) {
            return true;
        } else {
            return false;
        }
    }

    // Q.3

    public int Push(int dado) throws Exception {
        if (this.StackFull()){
            throw new Exception("Pilha cheia");
        } else {
            this.Dados[this.Topo] = dado;
            this.Topo += 1;
            return this.Dados[this.Topo-1];
        }
    }
}
