// used two pointers fast and slow. Fast pointer traverse in double speed compared to slow. So when fast is at the end of the linkedlist, slow will be at the middle.

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow.data;
    }
}
