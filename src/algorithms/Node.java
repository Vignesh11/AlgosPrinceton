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
public class Node {
    private Node next;
    private String elem;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String getElem() {
        return elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }
    
    
}
