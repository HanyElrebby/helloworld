package com;

public class Queue {

    private int maxSize;
    private double[] queArray;
    private int rear;
    private int front;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new double[maxSize];
        rear = -1;
        front = 0;
        nItems = 0;
    }

    public void enqueue(double value) {
        if (rear == maxSize-1) {
            rear = -1;
        }
        queArray[++rear] = value;
        nItems++;
    }

    public double dequeue() {
        double temp = queArray[front++];
        if (front==maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public double peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }
}
