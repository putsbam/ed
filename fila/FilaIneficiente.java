package fila;

public class FilaIneficiente {
    private int[] Data;
    public int Head;
    public int Tail;

    public FilaIneficiente(int tam) {
        this.Data = new int[tam];
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
        if (this.Tail == this.Data.length-1) {
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
            this.Tail++; //Caso normal
        }
        this.Data[this.Tail] = dado;
    }

    public int Dequeue() throws Exception {
        if (this.QueueEmpty()) {
            throw new Exception("Fila vazia");
        }
        int dado = this.Data[this.Head];
        if (this.Tail == this.Head) { //Caso de um elemento único
            this.Tail = this.Head = -1;
        } else {
            for (int i = this.Head; i <= this.Tail-1; i++) {
                this.Data[i] = this.Data[i+1];
            }
            this.Tail--;
        }
        return dado;
    }

    public void Imprime() {
        System.out.print("Head: "+this.Head);
        System.out.println("; Tail: "+this.Tail);
        System.out.print("Data:");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+",");
        }
        System.out.println("");
    }
}
