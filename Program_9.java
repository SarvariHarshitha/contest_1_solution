// Traverse through the linkedlist, whenever the data of the node is equal to the key, incremented the count. Atlast, returned the count.

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution
{
    public static int count(Node head, int key)
    {
        int c = 0;
        while(head != null){
            if(head.data == key) c++;
            head = head.next;
        }
        return c;
    }
}
