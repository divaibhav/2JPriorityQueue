package main;

import implementation.MyQueue;
import implementation.Student;

public class MyMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        MyQueue<Integer> queue = new MyQueue<>(arr);
        queue.enqueue(50);
        queue.enqueue(25);
        queue.enqueue(65);
        queue.traverse();

        Student s = new Student(12,"aman");
        Student s1 = new Student(35,"ramesh");
        Student s2 = new Student(3,"aankit ");
        Student[] brr = new Student[10];
        MyQueue<Student> studentMyQueue = new MyQueue<>(brr);
        studentMyQueue.enqueue(s1);
        studentMyQueue.enqueue(s);
        studentMyQueue.traverse();
        studentMyQueue.enqueue(s2);
        studentMyQueue.traverse();
    }
}
