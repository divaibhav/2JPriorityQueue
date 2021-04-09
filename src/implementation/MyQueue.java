package implementation;

import myinterface.QueueADT;

public class MyQueue<E extends Comparable<E>> implements QueueADT<E> {
    private E[] arr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(E[] arr) {
        this.arr = arr;
        front = -1;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        if(rear == arr.length - 1){
            System.out.println("queue overflow");
        }
        else{
            //insert or enqueue
            arr[++rear] = element;
            size++;
            //rearrange: this method will rearrange the newly inserted element at
            //its proper place
            rearrange(arr);
        }
    }

    private void rearrange(E[] arr) {
        for (int i = rear; i > front + 1 ; i--) {
            if(arr[i].compareTo(arr[i-1]) < 0){
                //swap
                E temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            else{
                break;
            }
        }
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public void traverse(){
        System.out.println("elements of queue");
        for (int i = front + 1; i <= rear ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

    }
}
