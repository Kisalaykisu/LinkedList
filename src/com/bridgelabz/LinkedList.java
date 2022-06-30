/*
Lets create a simple Linked List
of 56, 30 and 70
 */
package com.bridgelabz;

public class LinkedList {
    Node head; // Taking node as head
    Node tail; // Taking node as tail

    /**
     * method to create Linked List
     * push method is used to add data 1st in last out
     *
     * @param data integer to be added in linked list
     */
    public Node push(int data) { //This is Node class
        Node newNode = new Node(data); //Create a new node
        if (head == null) { //Checks if the list is empty
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
    public Node append(int data) {
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
                temp.next.next = afterInsert; // node = current node
                                              // node.next = next node to current
                                              //node.next.next = 2nd node from current node
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Method to pop the 1st element of LinkedList
     */
    public void pop() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            head = head.next;
        }
    }

    /**
     * Method to pop the Last element of LinkedList
     */
    public void popLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    /**
     * Method to find node with key value
     *
     * @param key to pass in the value of key
     */
    public void search(int key) {
        Node temp = head;
        int nodeCount = 1;
        while (temp != null) {
            if (temp.data == key) {
                break;
            }
            nodeCount++;
            temp = temp.next;
        }
        System.out.println("The Node with key value " + key + " is " + nodeCount);
    }

    /**
     * Method to insert value after specific Node
     *
     * @param previous takes in the value of Node after which insertion should be done
     * @param current  takes in the insertion value
     */
    public void insertAfterElement(int previous, int current) {
        Node insertNode = new Node(current);
        Node temp = head;
        while (temp != null) {
            if (temp.data == previous) {
                Node afterInsert = temp.next;
                temp.next = insertNode;
                temp.next.next = afterInsert;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Method to delete an element
     *
     * @param key takes in the key which should be deleted from LinkedList
     */
    public void delete(int key) {
        Node temp = head;               //56,30,40,70
        if (head.data == key) {
            pop();
        } else if (tail.data == key) {
            popLast();
        } else {
            while (temp != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * Method to find the size of LinkedList
     */
    public void size() {
        Node temp = head;
        int nodeCount = 0;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }
        System.out.println("The size of LinkedList is: " + nodeCount);
    }
}