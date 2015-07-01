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
public class QuickUnion {
    private int size;
    private List<Integer> arrayList;

   public  QuickUnion(int size) {
       this.size = size;
        arrayList = new ArrayList<Integer>(size);
        for(int i =0;i<size;i++){
            arrayList.add(i, i);
        }    
    }
   
   private int root(int p){
       while ( arrayList.get(p) != p ) {
           p = arrayList.get(p);
       }
      return p;  
       }
   
   public boolean isConnected(int p,int q){
       return root(p) == root(q);
   }
   
   public void union(int p,int q){   
           int root1 = root(p);
           int root2 = root(q);
           arrayList.set(root1, root2);
       
       print();
   }

    private void print() {
        for (int i = 0 ;i<arrayList.size();i++){
            System.out.print(arrayList.get(i));
        }
        System.out.println();
    }
    
}
