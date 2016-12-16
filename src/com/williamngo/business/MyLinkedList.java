package com.williamngo.business;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Willy
 */
public class MyLinkedList {
    private MyNode last;
    private MyNode first;
    private int count;
    LinkedList list;
    
    public MyLinkedList(){
        first = null;
        last = null;
        count = 0;
    }
    
    /**
     * Adds node at the end of the list
     * @param data 
     */
    public void addNode(String data){
        MyNode newNode = new MyNode(data);
        if(!isEmpty()){ //If there is already something in the list
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        else{ //If it's the first element we're adding
            first = newNode;
        }
        last = newNode;
        count++;
    }
    
    /**
     * Add node in specific index
     * @param pos 
     */
    public void addNodeAt(int pos, String data){
        MyNode newNode = new MyNode(data);
        MyNode next = null;
        MyNode prev = null;
        
        if(pos == 0){
            next = first;
            first = newNode;
            
            first.setNext(next);
            next.setPrev(first);
        }
        else if (pos == count){
            prev = last;
            last = newNode;
            
            last.setPrev(prev);
            prev.setNext(last);
        }
        else{ //If it's in the middle
            MyNode current = first;
            //Iterate through whole list until found position of where you wanna add
            for(int i = 0; i < pos; i++){
                current = current.getNext();
            }
            
            prev = current.getPrev();
            
            /**
             * This is what it looks like visually if pos = 1
             * 
             *   0        1        2       3       4       5
             * [prev] [current] [other] [other] [other] [other]
             *       ^
             *       |
             *     [new]
             * 
             */
            
            //Update reference of newly added node
            newNode.setNext(current);
            newNode.setPrev(prev);
            
            //Update reference of surrounding node
            current.setPrev(newNode);
            prev.setNext(newNode);
            
            
            
        }
    }
    
    public String removeLastNode(){
        MyNode prev = this.last.getPrev();
        String element = this.last.getData();
        
        //Remove last node
        this.last.setData(null);
        this.last = null;
        
        //previous node is now last node
        this.last = prev;
        this.last.setNext(null);
        
        count--;
        //Return element
        return element;
    }
    
    public void removeNodeAt(int pos){
        
    }
    
    public void printList(){
        MyNode currentNode = first;
        System.out.println("List: ");
        while(currentNode != null) {
            currentNode.print();
            currentNode = currentNode.getNext();
        }
        System.out.println("");
    }
    
    public boolean isEmpty(){
        return (last == null);
    }
//    public MyNode getNodeAt(int pos){
//        return list[pos];
//    }
}
