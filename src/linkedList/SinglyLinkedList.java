/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 31-03-2021
 *   Time: 18:50
 *   File: SinglyLinkedList.java
 */

package linkedList;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(int data) {
        if (isEmpty()) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data) {
        if (isEmpty()) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("Error...LinkedList is Empty.");
            return;
        }
        head = head.next;
    }

    public void deleteAtTail() {
        if (isEmpty()) {
            System.out.println("Error...LinkedList is Empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}