package com.ndirangujoe;

//An Implementation of a Dynamic Array that automatically Shrinks and Expands
/*
NB: FOR LEARNING PURPOSES ONLY : FOR PRODUCTION USE - use ArrayList<E> || Vector<E>
 */

public class Array {
    int[] coreArray;
    int index;

    public Array(int length) {
        this.coreArray = new int[length];
    }

    public void insert(int value) {
        if (index == coreArray.length) {
            int[] newArray = new int[coreArray.length * 2];
            for (int i = 0; i < coreArray.length; i++) {
                newArray[i] = coreArray[i];
            }
            coreArray = newArray;

        }
        coreArray[index++] = value;
    }


    public void removeAt(int index) {
        if (index < 0 || index >= this.coreArray.length) {
            throw new IllegalArgumentException("Invalid Index: Out of range");
        } else {
            for (int i = index; i < this.index; i++) {
                coreArray[i] = coreArray[i + 1];
            }
            this.index--;
        }
    }

    public int indexOf(int value) {
        for (int i = 0; i < index; i++) {
            if (coreArray[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public void print() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(coreArray[i]);
        }
    }

}
