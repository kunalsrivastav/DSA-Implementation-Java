/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 31-03-2021
 *   Time: 18:45
 *   File: DoublyNode.java
 */

package linkedList;

public class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode previous;

    public DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}