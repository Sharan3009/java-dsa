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

    public static void printList(LinkedList list){
        Node currNode = list.head;
        while(currNode!=null){
            System.out.print(currNode.data + "");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        insert(ll,1);
        printList(ll);
    }
}
