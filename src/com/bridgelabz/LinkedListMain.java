package com.bridgelabz;
import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        int[] array = {56, 30, 40, 70};
        Arrays.sort(array);
        for (int item : array) {
            obj.append(item);
        }
        obj.showLinkedList();
    }
}
