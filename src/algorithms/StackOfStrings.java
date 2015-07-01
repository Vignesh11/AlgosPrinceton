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
public class StackOfStrings<E> {
    private Node first;
    public StackOfStrings(){
        first = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    public void push(String elem){
        Node newNode = first;
        first  = new Node();
        first.setNext(newNode);
        first.setElem(elem);      
    }
    
    public String pop(){
        if (isEmpty()){
            throw new RuntimeException("Empty Stack");
        }
        String s = first.getElem();
        first = first.getNext();
        return s;
    }
    
    public static void main(String[] args) {
        StackOfStrings<String> sos = new StackOfStrings();
        sos.push("HI");
        sos.push("HELLO");
        sos.push("BYE");
        sos.push("BYE");
        System.out.println(sos.pop() + sos.pop());
    }
    
}
