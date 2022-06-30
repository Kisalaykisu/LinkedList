package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.append(56);
        obj.append(30);
        obj.append(70);
        System.out.println("The current LinkedList using append method is: ");
        obj.showLinkedList();
    }
}
