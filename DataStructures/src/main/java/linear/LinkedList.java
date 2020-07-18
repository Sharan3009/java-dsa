package linear;

public class LinkedList {

    Node head;

    public static void insert(LinkedList list,int data){

        Node node = new Node(data);
        node.next = null;

        if(list.head == null){
            list.head = node;
        } else {
            // assuming initially head is a last element in this
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }

            last.next = node;
        }
    }

    public static void deleteByKey(LinkedList list,int key){
        Node currNode = list.head;
        if(currNode!=null && currNode.data==key){
            Node next = currNode.next;
            list.head = next;
        } else {
            // My logic
            //while (currNode != null) {
            //    if (currNode.next != null && currNode.next.data == key) {
            //        currNode.next = currNode.next.next;
            //    }
            //    currNode = currNode.next;
            //}

            // Geeks for geeks logic
            Node prev = null;
            while(currNode!=null && currNode.data!=key){
                prev = currNode;
                currNode = currNode.next;
            }

            if(currNode!=null){
                prev.next = currNode.next;
            }
        }
    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        while(currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        insert(ll,1);
        insert(ll,4);
        insert(ll,5);
        insert(ll,7);
        insert(ll,10);
        deleteByKey(ll,1);
        deleteByKey(ll,4);
        deleteByKey(ll,99);
        printList(ll);
    }
}
