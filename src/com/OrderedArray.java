package com;

public class OrderedArray {

    //BINARY SEARCH
    public int find(double value, int first, int last, int[] array) {
        int mid = first+(last-first)/2;
        while (first<=last) {
            if (array[mid]==value) {
                break;
            } else if (array[mid]<mid) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return mid;
    }

    //INSERTION SORT
    public static double[] insert(double[] array) {
        for (int i=1; i<array.length; i++) {
            double key = array[i];
            int j = i-1;
            while ((j>-1) && (array[j]>key)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
    }

    //BUBBLE SORT
    public static double[] bubble(double[] arr) {
        int i;
        for (i=0; i< arr.length; i++) {
            for (int j=1; j<arr.length; j++) {
                if (arr[j] < arr[i]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //SELECTION SORT
    public static double[] select(double[] array) {
        int  min;
        for (int i=0; i<array.length; i++) {
            min = i;
            for (int j=i+1; j< array.length; j++) {
                if (array[j]<array[min]) {
                    min = j;
                }
            }
            double temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    //MERGE SORT
    public static double[] merge(double[] array, int first, int mid, int last) {
        int i, j, k;
        int n1 = mid-first+1;
        int n2 = last - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (i=0; i< n1; i++) {
            leftArray[i] = array[first+i];
        }
        for (j=0; j< n2; j++) {
            rightArray[j] = array[mid+1+j];
        }

        i=0;
        j=0;
        k=first;

        while (i< n1 && j< n2) {
            if (leftArray[i]<=rightArray[j]) {
                array[k] = array[i];
                i++;
            } else {
                array[k] = array[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j<n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return array;
    }

    static void mergeSort(double a[], int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(a, first, mid);
            for (double e: a)
                System.out.print(e);
            System.out.println("");
            mergeSort(a, mid + 1, last);
            for (double e: a)
                System.out.print(e);
            System.out.println("");
            merge(a, first, mid, first);
        }
    }
}

