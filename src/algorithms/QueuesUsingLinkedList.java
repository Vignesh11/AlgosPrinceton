/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Vignesh
 */
public class QueuesUsingLinkedList {
    
    private class QueueNode {
        QueueNode next;
        Object item;
    }
    
    private QueueNode first,last;
    
    public QueuesUsingLinkedList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public Object deQueue(){
        QueueNode oldFirst = first;
        first = first.next;
        return oldFirst.item;
    }
    
    public void enQueue(Object obj){
        QueueNode oldLast = last;
        last = new QueueNode();
        last.item = obj;
        last.next = null;
        if (isEmpty()){
            first = last;
        }
        else
            oldLast.next = last;
    }
    
    public static void main(String[] args) {
        QueuesUsingLinkedList qul = new QueuesUsingLinkedList();
        qul.enQueue("hi");
         qul.enQueue("hwllo");
         System.out.println(qul.deQueue());
    }
}
