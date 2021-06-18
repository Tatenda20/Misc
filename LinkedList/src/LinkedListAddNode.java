public class LinkedListAddNode
{
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node
    {
        int nodeData;
        Node next;

        // Constructor
        Node(int data)
        {
            nodeData = data;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedListAddNode insert(LinkedListAddNode list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            // Else traverse till the last node
            // and insert the newNode there
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            // Insert the newNode at last node
            last.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedListAddNode list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null)
        {
            // Print the data at current node
            System.out.print(currNode.nodeData + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedListAddNode list = new LinkedListAddNode();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 78);

        // Print the LinkedList
        printList(list);
    }
}
