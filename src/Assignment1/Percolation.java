/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;


/**
 *
 * @author Vignesh
 */
public class Percolation {
    private boolean[][] gridArray;
    private int count;
    private int gridSize;
    private WeightedUnion wf;
    
    public Percolation(int gridSize){
        this.gridSize = gridSize;
        gridArray = new boolean[gridSize][gridSize];
         wf = new WeightedUnion(gridSize*gridSize);
        
    }
    
    public boolean isOpen(int row,int column){
        if(isValid(row,column)){
          return gridArray[row-1][column-1];  
        }
        return false;
    }

    private boolean isValid(int row, int column) {
        return ((row> 0 && row <= gridSize) && (column > 0 && column <= gridSize));
    }
    
    private boolean isFull(){
        for(int i = 0;i<gridSize;i++){
            if(!gridArray[i][i])
                return false;                
        }
        return true;
    }
    
    public void open(int row,int column){
        if (isValid(row,column)){
            gridArray[row-1][column-1] = true; //Opening the cell.
            count++;
        }       
    }
    
    public boolean percolates(){
        int pos;
        for(int i = 0;i<gridSize;i++){
            for(int j = 0;j<gridSize;j++){
            pos =  gridSize -1 + i + j ;    
             if (isOpen(i,j) && isOpen(gridSize-1,j) && wf.connected(i, pos)  )
                 return true;
                 }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Percolation p = new Percolation(10);
        p.open(1, 1);
        System.out.println(p.isOpen(1, 1));
       System.out.println(p.percolates());
        
    }
}
    
