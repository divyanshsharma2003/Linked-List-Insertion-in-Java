import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class MyLinkedList {
  // Displaying The Linked List.
  void display(Node head) {
    Node current = head;
    int i = 0;
    while (current != null) {
      System.out.println("Element " + (i + 1) + " : " + current.data);
      current = current.next;
      i++;
    }
  }

  // Inserting At The Beginning In The Linked List.
  Node insertatBeginning(Node head, int data) {
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
    return head;
  }

  // Inserting At The End In The Linked List.
  Node insertatEnd(Node head, int data) {
    Node newnode = new Node(data);
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newnode;
    newnode.next = null;
    return head;
  }

  // Inserting In The Middle In Linked List.
  Node insertinMiddle(Node head, int data, int index) {
    Node newnode = new Node(data);
    int i = 1;
    Node current = head;
    while (i != index - 1) {
      current = current.next;
      i++;
    }
    newnode.next = current.next;
    current.next = newnode;
    return head;
  }
}

// Driver Code [Main Function].
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    head.next = second;
    second.next = third;

    System.out.println("\nCurrent Linked List Is : ");
    MyLinkedList ll = new MyLinkedList();
    ll.display(head);

    System.out.print("\nEnter The Element You Want To Insert At Beginning : ");
    int data1 = sc.nextInt();
    head = ll.insertatBeginning(head, data1);
    System.out.println("\nYour Updated Linked List Is : ");
    ll.display(head);

    System.out.print("\nEnter The Element You Want To Insert At End : ");
    int data2 = sc.nextInt();
    head = ll.insertatEnd(head, data2);
    System.out.println("\nYour Updated Linked List Is : ");
    ll.display(head);

    System.out.println("\nEnter The Index Of The New Element To Be Inserted : ");
    int index = sc.nextInt();
    System.out.print("\nEnter The Element You Want To Insert In The Middle : ");
    int data3 = sc.nextInt();
    head = ll.insertinMiddle(head, data3, index);
    System.out.println("\nYour Updated Linked List Is : ");
    ll.display(head);
  }
}