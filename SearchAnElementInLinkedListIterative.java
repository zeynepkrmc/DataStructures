class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class LinkedList{
    Node head;

    // Inserts a new node at the front of the list
    public void push(int newData){

        // Allocate new node and putting data
        Node new_node = new Node(newData);

         // Make next of new node as head
         new_node.next = head;

         // Move the head to point to new Node
         head = new_node;
    }

    // Checks whether the value x is present in linked list
    public boolean search(Node head, int x){
        Node current = head; // Initialize current
        while(current != null){
            if(current.data == x)
                return true;// data found
            current = current.next;    
        }
        return false;  // data not found
    }

    public static void main(String args[])
    {
 
        // Start with the empty list
        LinkedList mylist = new LinkedList();
        int x = 21;
        /*Use push() to construct below list
        14->21->11->30->10  */
        mylist.push(10);
        mylist.push(30);
        mylist.push(11);
        mylist.push(21);
        mylist.push(14);
 
          // Function call
        if (mylist.search(mylist.head, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
