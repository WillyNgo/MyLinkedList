/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.williamngo.business;

/**
 *
 * @author Willy
 */
public class MyNode {
    private String data;
    private MyNode next;
    private MyNode prev;
    
    public MyNode(String word){
        this.data = word;
        this.next = null;
        this.prev = null;
    }
    
    public void setNext(MyNode nextNode){
        this.next = nextNode;
    }
    
    public void setPrev(MyNode prevNode){
        this.prev = prevNode;
    }
    
    public MyNode getPrev(){
        return this.prev;
    }
    
    public MyNode getNext(){
        return this.next;
    }
    
    public String getData(){
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void print(){
        System.out.println("[ " + data + " ]");
    }
}
