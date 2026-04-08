package day13;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtstart(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtPosition(int position){
        if(head==null){
            return;
        }
        if(position==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Linked {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtStart(0);
        list.insertAtPosition(4, 2);
        list.deleteAtstart();
        list.deleteAtEnd();
        list.deleteAtPosition(1);
        list.display();
    }
}
