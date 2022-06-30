/*
Lets create a simple Linked List
of 56, 30 and 70
 */
package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * method to create Linked List
     * push method is used to add data 1st in last out
     *
     * @param data integer to be added in linked list
     */
    public Node push(int data) {   //This is Node class
        Node newNode = new Node(data);  //Create a new node
        if (head == null) {  //Checks if the list is empty
            this.head = newNode;  //If list is empty, both head and tail will point to new node
            this.tail = newNode;
        } else {
            Node temp = head;  //Node current will point to head
            this.head = newNode;
            newNode.next = temp;
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

}