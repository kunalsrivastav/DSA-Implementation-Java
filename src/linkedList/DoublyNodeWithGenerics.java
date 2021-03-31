/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 31-03-2021
 *   Time: 18:48
 *   File: DoublyNodeWithGenerics.java
 */

package linkedList;

public class DoublyNodeWithGenerics<T> {
    T data;
    DoublyNodeWithGenerics<T> next;
    DoublyNodeWithGenerics<T> previous;

    public DoublyNodeWithGenerics(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}