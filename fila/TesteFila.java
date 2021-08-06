package fila;

public class TesteFila {

    public static void main(String[] args) {

		Fila f = new Fila(3);
        try {
            f.Enqueue(10);
            f.Enqueue(15);
            f.Enqueue(20);
            f.Imprime();    
        } catch (Exception e) {
            System.out.println(e); 
        }
        try {
            System.out.println(f.Dequeue());
            System.out.println(f.Dequeue());
            f.Imprime();    
        } catch (Exception e) {
            System.out.println(e); 
        }
        try {
            f.Enqueue(25);
            f.Enqueue(30);
            f.Imprime();
        } catch (Exception e) {
            System.out.println(e); 
        }
        
	}
    
}