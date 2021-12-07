package com;

public class HighArray {
    private double[] array;
    private int nElems;

    public HighArray(int size) {
        array = new double[size];
        nElems = 0;
    }
    //Search******
    public boolean find(double value) {
        int i;
        for (i=0; i<nElems; i++) {
            if (array[i]==value) {
                break;
            }
        }
        if (i==nElems) {
            return false;
        } else {
            return true;
        }
    }

    //Insert******
    public void insert(double value) {
        array[nElems]= value;
        nElems++;
    }

    //Delete******
    public boolean delete(double value) {
        int i;
        for (i=0; i<nElems; i++) {
            if (array[i]==value) {
                break;
            }
        }
        if(i==nElems) {
            return false;
        } else {
            for (int j=i; j<nElems; j++) {
                array[j] = array[j+1];
            }
            nElems--;
            return true;
        }
    }

    //Display******
    public void display() {
        for (int i=0; i<nElems; i++) {
            System.out.println(array[i]);
        }
    }
}
