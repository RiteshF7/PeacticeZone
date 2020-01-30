package com.company.CoreConceptsCs.DataStructures;

public class DoublyLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushAtLast(8);
        list.pushAtLast(3);
        list.pushAtLast(5);
        list.pushAtLast(6);
        list.pushAtLast(3);
        list.pushAtLast(2);
        list.insertAfter(list.head.next,28);

        list.printlist(list.head);

    }
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public void push(int data){
        //inserting at front of list
        Node newNode= new Node(data);

        newNode.prev=null;
        newNode.next=head;

        if(head!=null){
            head.prev=newNode;
        }

        head=newNode;
    }
    public void pushAtLast(int data){
        Node newnode = new Node(data);
        newnode.next=null;
        Node currentNode =head;
        if(head==null){
            newnode.prev=null;
            head=newnode;
            return;
        }

        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
        newnode.prev=currentNode;

    }
    public void printList(DoublyLinkedList list){
        Node currentNode = list.head;
        while(currentNode.next!=null){
            System.out.print(currentNode.data+",");
            currentNode=currentNode.next;
        }
    }
    public void insertAfter(Node prevNode,int data){
       if(prevNode==null){
           System.out.print("cannot be null !");
           return;
       }

       Node newNode = new Node(data);
       newNode.next=prevNode.next;
       newNode.prev=prevNode;
       prevNode.next=newNode;
       if(newNode.next!=null)
       prevNode.next.prev=newNode;

    }
    public void deleteElement(int data){
        //to Do !
    }
}
