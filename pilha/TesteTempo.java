package pilha;
public class TesteTempo {

    public static void main(String[] args) throws Exception{

        long startTime = System.currentTimeMillis();

        Pilha pilha1 = new Pilha(5);

        try {

            pilha1.Push(1);
            pilha1.Push(2);
            pilha1.Push(3);
            pilha1.Push(4);
            pilha1.Push(5);

            long finalTime = System.currentTimeMillis();

            pilha1.Imprime();

            // Tempo Queue
            System.out.printf("Queue Time: %.3f ms%n", (finalTime - startTime) / 1000d);

        Pilha pilha2 = new Pilha(5);

            pilha2.Push(pilha1.Pop());
            pilha2.Push(pilha1.Pop());
            pilha2.Push(pilha1.Pop());
            pilha2.Push(pilha1.Pop());
            pilha2.Push(pilha1.Pop());

        long finalTime2 = System.currentTimeMillis();

        pilha2.Imprime();

        // Tempo Dequeue
        System.out.printf("Dequeue Time: %.3f ms%n", (finalTime2 - startTime) / 1000d);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}