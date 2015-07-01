/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vignesh
 */
public class QuickUnionClient {
    
    public static void main(String[] args) {
               QuickUnion qu = new QuickUnion(10);
        
        
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        //qu.union(4, 6);
        //qu.union(1, 7);
        System.out.println(qu.isConnected(3, 5));
        
    }
    
}
