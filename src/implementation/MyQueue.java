package implementation;

import myinterface.QueueADT;

public class MyQueue<E extends Comparable<E>>
        implements QueueADT<E> {
    E[] arr;
    int front;
    int rear;
    int size;
    @Override
    public void enqueue(E element) {
        //call rearrange
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
        return false;
    }
    int[] brr;
    private void rearrange(){
        for (int i = rear; i > 0 ; i--) {
            if(brr[i] > brr[i-1]){
                //swap
                int temp = brr[i];
                brr[i] = brr[i-1];
                brr[i-1] = temp;
            }
            else {
                break;
            }
        }
    }
    //Employee[] arr;

    //rearrange with generics
    private void rearrangeGeneric(){
        for (int i = rear; i > 0  ; i--) {
            if(arr[i].compareTo(arr[i-1])>= 1){
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
}
