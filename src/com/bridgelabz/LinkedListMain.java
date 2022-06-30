package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.append(56);
        obj.append(70);
        System.out.println("The current LinkedList is: ");
        obj.showLinkedList();
        obj.insert(56, 30, 70);
        System.out.println("Linked List after inserting 30 between 56 and 70: ");
        obj.showLinkedList();
        obj.pop();
        System.out.println("Linked List after popping the first element: ");
        obj.showLinkedList();
    }
}
