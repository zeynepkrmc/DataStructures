public class DLL {
     
    // Head of list
    Node head;
 
    // Doubly Linked list Node
    class Node {
        int data;
        Node prev;
        Node next;
 
        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) { data = d; }
    }

    public void push(int new_data)
    {
        // 1. allocate node 
        // 2. put in the data 
        Node new_node = new Node(new_data);

        // 3. Make next of new node as head 
        // and previous as NULL 
        new_Node.next = head;
        new_node.prev = null;

        //4. change prev of head node to new node 
        if(head != null)
          head.prev = new_Node;

          // 5. move the head to point to the new node 
          head = new_Node;

    }

public void printList(Node node)
{
    Node last = null;

    while(node != null)
    {
        System.out.print(node.data + " "); 
        last = node;
        node = node.next;
    }
    System.out.println(); 
}
// Function to delete a node in a Doubly Linked List. 
    // head_ref --> pointer to head node pointer. 
    // del --> data of node to be deleted. 
    void deleteNode(Node deleteElement)
    {
        // Base case 
        if(head == null || deleteElement == null){
            return;
        }

        // If node to be deleted is head node 
        if(head = deleteElement){
            head = deleteElement.next;
        }

        // Change next only if node to be deleted 
        // is NOT the last node 
        if(deleteElement.next != null){
            deleteElement.next.prev = deleteElement.prev; 
        }

        // Change prev only if node to be deleted 
        // is NOT the first node 
        if(deleteElement.prev != null){
            deleteElement.prev.next = deleteElement.next;
        }

            return;


    }
    public static void main(String[] args) 
    { 
        // Start with the empty list 
        DLL dll = new DLL(); 
  
        // Insert 2. So linked list becomes 2->NULL 
        dll.push(2); 
  
        // Insert 4. So linked list becomes 4->2->NULL 
        dll.push(4); 
  
        // Insert 8. So linked list becomes 8->4->2->NULL 
        dll.push(8); 
  
        // Insert 10. So linked list becomes 
        // 10->8->4->2->NULL 
        dll.push(10); 
  
        System.out.print("Original Linked list "); 
        dll.printlist(dll.head); 
  
  
        dll.deleteNode(dll.head); /*delete first node*/
        dll.deleteNode(dll.head.next); /*delete middle node*/
        dll.deleteNode(dll.head.next); /*delete last node*/
  
        System.out.print( 
            "\nModified Linked list "); 
        dll.printlist(dll.head); 
    } 
}



}