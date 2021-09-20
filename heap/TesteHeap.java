package heap;

public class TesteHeap {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);
        try {
            h.Insert(10);
            h.Insert(20);
            h.Insert(40);
            h.Insert(15);
            h.Insert(25);
            h.Insert(50);
            h.Imprime();
            System.out.println(h.ExtractMax());
            System.out.println(h.ExtractMax());
            h.Imprime();

        } catch (Exception e) {
            System.out.println(e);
        }

        // Begin Tests Lista 06

        System.out.println("\t=========\n");

        MinHeap minHeap = new MinHeap(10);
        try {
            minHeap.Insert(10);
            minHeap.Insert(20);
            minHeap.Insert(40);
            minHeap.Insert(15);
            minHeap.Insert(25);
            minHeap.Imprime();
            System.out.println(minHeap.ExtractMin());

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

