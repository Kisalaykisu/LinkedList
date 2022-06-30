/*
Lets create a simple Linked List
of 56, 30 and 70
 */
package com.bridgelabz;

public class LinkedList {
    Node head; // Taking node as head
    Node tail; // Taking node as head

    /**
     * method to create Linked List
     * push method is used to add data 1st in last out
     *
     * @param data integer to be added in linked list
     */
    public Node push(int data) { //This is Node class
        Node newNode = new Node(data); //Create a new node
        if (head == null) {  //Checks if the list is empty
            this.head = newNode; //If list is empty, both head and tail will point to new node
            this.tail = newNode;
        } else {
            Node temp = head; //Node current will point to head
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    /**
     * method to create a Linked List
     * append method is used to add data 1st in 1st out
     *
     * @param data integer to be added in linked list
     */
    public Node append(int data) { //append used
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = tail;
            this.tail = newNode;
            temp.next = newNode;
        }
        return newNode;
    }


    /**
     * Method to display the current LinkedList
     */
    public void showLinkedList() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    /**
     * Method to insert an item between two items
     *
     * @param previous takes in the previous item of the inserted element
     * @param current  takes in the current value to be inserted
     * @param next     takes in the next item that comes after inserted value
     */
    public void insert(int previous, int current, int next) {
        Node insertNode = new Node(current);
        Node temp = head;
        while (temp != null) {
            if (temp.data == previous && temp.next.data == next) {
                Node afterInsert = temp.next;
                temp.next = insertNode;
                temp.next.next = afterInsert;
                break;
            }
            temp = temp.next;
        }
    }
}



