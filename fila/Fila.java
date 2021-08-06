package fila;

public class Fila {
    private int[] Dados;
    public int Head;
    public int Tail;

    public Fila(int tam) {
        this.Dados = new int[tam];
        this.Head = this.Tail = -1;
    }

    public boolean QueueEmpty() {
        if (this.Head == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean QueueFull() {
        if ((this.Tail == this.Dados.length-1 && this.Head == 0) || 
            (this.Tail == (this.Head -1) % (this.Dados.length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int dado) throws Exception {
        if (this.QueueFull()) {
            throw new Exception("Fila cheia");
        }
        if (this.QueueEmpty()) {
            this.Tail = this.Head = 0;
        } else {
            if (this.Tail == this.Dados.length-1 && this.Head != 0) { //Contorno circular
                this.Tail = 0;
            } else {
                this.Tail++; //Caso normal
            }
        }
        this.Dados[this.Tail] = dado;
    }

    public int Dequeue() throws Exception {
        if (this.QueueEmpty()) {
            throw new Exception("Fila vazia");
        }
        int dado = this.Dados[this.Head];
        if (this.Tail == this.Head) { //Caso de um elemento único
            this.Tail = this.Head = -1;
        } else if (this.Head == this.Dados.length-1) { //Contorno circular
            this.Head = 0;
        } else {
            this.Head++;
        }
        return dado;
    }

    public void Imprime() {
        System.out.print("Head: "+this.Head);
        System.out.println("; Tail: "+this.Tail);
        System.out.print("Dados:");
        for (int i=0; i < this.Dados.length; i++) {
            System.out.print(this.Dados[i]+",");
        }
        System.out.println("");
    }
}
