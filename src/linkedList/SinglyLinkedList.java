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
}