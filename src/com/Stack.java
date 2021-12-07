package com;

public class Stack {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double value) {
        stackArray[++top] = value;
    }

    public double pop() {
        return stackArray[top--];
    }

    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull() {
        return (top==maxSize-1);
    }
}
