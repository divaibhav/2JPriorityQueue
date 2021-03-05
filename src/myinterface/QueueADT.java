package myinterface;

public interface QueueADT<E extends Comparable<E>> {
    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
}
