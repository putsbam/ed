package heap;

public class MinHeap {

    private int size;
    private int maxSize;
    private int H[];

    public MinHeap(int maxsize) {

        this.maxSize = maxSize;
        this.size = 0;

        H = new int[this.maxSize + 1];
        H[0] = Integer.MIN_VALUE;
    }

    private void Swap(int fpos, int spos) {
        int tmp;
        tmp = H[fpos];

        H[fpos] = H[spos];
        H[spos] = tmp;
    }

    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private int parent(int pos) { return pos / 2; }

    private int leftChild(int pos) { return (2 * pos); }

    private int rightChild(int pos) { return (2 * pos) + 1; }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (H[pos] > H[leftChild(pos)] || H[pos] > H[rightChild(pos)]) {
                if (H[leftChild(pos)] < H[rightChild(pos)]) {
                    Swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }
                else {
                    Swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void Insert(int p) throws Exception {

        if (size >= maxSize) {
            throw new Exception("Heap cheia");
        }
        H[++size] = p;
        int current = size;

        while (H[current] < H[parent(current)]) {
            Swap(current, parent(current));
            current = parent(current);
        }
    }

    public int ExtractMin() {
        int FRONT = 1;
        int result = H[0];
        H[0] = H[size-1];
        size = size - 1;
        minHeapify(FRONT);
        return result;
    }

    public void Remove(int i) {
        int FRONT = 1;
        H[FRONT] = H[size--];
        minHeapify(FRONT);
    }

    public void ChangeValue(int i, int p) {
        H[i] = p;
        minHeapify(i);
    }

    public int getMin() {
        if (size > 0) {
            return H[0];
        } else {
            return -1;
        }
    }

    public void Imprime() {
        System.out.print("[");
        for (int i=0; i < size; i++) {
            System.out.print(this.H[i]+" ");
        }
        System.out.println("]");
    }

}