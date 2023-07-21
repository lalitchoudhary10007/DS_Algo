package Collections.LinkedList;

public class MyLinkedList {

    Node head;

    public MyLinkedList(){

    }

    public void add(int data){
        addFirst(data);
        Node lastNode = head;
        while (lastNode.next != null){
             lastNode = head.next;
        }
        Node toAdd = new Node(data);
        lastNode.next = toAdd;
    }

    public void traverse(){
          Node current = head;
          while (current != null){
              System.out.println(current.data);
              current = current.next;
          }
    }

    public void addFirst(int data){
        if (head == null){
            head = new Node(data);
        }
    }

}
