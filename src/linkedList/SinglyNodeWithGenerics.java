/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 31-03-2021
 *   Time: 18:46
 *   File: SinglyNodeWithGenerics.java
 */

package linkedList;

public class SinglyNodeWithGenerics<T> {
    T data;
    SinglyNodeWithGenerics<T> next;

    public SinglyNodeWithGenerics(T data) {
        this.data = data;
        this.next = null;
    }
}