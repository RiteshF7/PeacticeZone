package com.company.CoreConceptsCs.DataStructures;

import jdk.nashorn.internal.ir.WhileNode;

public class LinkedList {
     Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList = insert(linkedList,1);
        linkedList = insert(linkedList,2);
        linkedList = insert(linkedList,3);
        linkedList = insert(linkedList,4);
        linkedList = insert(linkedList,5);
        linkedList = insert(linkedList,6);
        linkedList = deleteElement(linkedList,6);
        linkedList = deleteElementbyIndex(linkedList,1);
        search(linkedList,10);
        printList(linkedList);


    }

    public static LinkedList insert(LinkedList list,int data){
        Node newNode = new Node(data);
        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node currentnode=list.head;
            while (currentnode.next!=null){
                currentnode=currentnode.next;
            }
            currentnode.next=newNode;
        }
        return list;
    }
    public static void printList(LinkedList list){
        System.out.println();
        Node currentnode = list.head;
        while (currentnode!=null){
            System.out.print(currentnode.data+",");
            currentnode=currentnode.next;
        }
}
    public static int search(LinkedList list,int d){
        Node currentNode =list.head;
        while (currentNode.next!=null){
            if(currentNode.data==d){
                System.out.println("\nThe Data is : "+currentNode.data);
                return currentNode.data;
            }
            currentNode=currentNode.next;
        }
        System.out.println("\nElement "+d+" Does Not Exist !");
        return 0;
    }
    public static LinkedList deleteElement(LinkedList list,int key){
        Node currentNode = list.head;Node prev = null;
        if(currentNode!=null&& currentNode.data==key){
            list.head=currentNode.next;
            System.out.println("item Deleted !");
            return list;
        }

        while (currentNode!=null&& currentNode.data!=key){
                prev=currentNode;
                currentNode = currentNode.next;
        }

        if(currentNode!=null){
            prev.next = currentNode.next;
            System.out.println("item Deleted !");
        }
        if(currentNode==null){
            System.out.println("Element Not Found !");
        }
        return list;
    }
    public static LinkedList deleteElementbyIndex(LinkedList list,int index){

        Node currentnode = list.head,prev= null;
        if(currentnode!=null&&index==0){
            currentnode.next=list.head;
            return list;
        }

        int counter=0;
        while (currentnode!=null){
            if(counter==index){
                prev.next=currentnode.next;
                System.out.print("Element Found And Deleted !");
                return list;
            }
            else{
                prev=currentnode;
                currentnode=currentnode.next;
                counter++;
            }
        }
        if(currentnode==null){
            System.out.print("No Element Found !");
        }

        return list;
    }
}
