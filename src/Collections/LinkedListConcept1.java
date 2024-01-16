package Collections;

// Q. Create your own linked list

public class LinkedListConcept1 {

    Node head;
    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    //to print the linked list we created
      public void printMyLinkedList(){

          Node n=head;
          while(n!=null){
              System.out.println(n.data);
              n=n.next;
          }
      }



    public static void main(String[] args) {

        LinkedListConcept1 l1=new LinkedListConcept1();

        Node first=l1.new Node(100);
        l1.head=first;

        Node second=l1.new Node(200);
        first.next=second;

        Node third=l1.new Node(300);
        second.next=third;

        l1.printMyLinkedList();

    }
}
