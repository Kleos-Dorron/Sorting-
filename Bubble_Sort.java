/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author kleos
 */
public class Bubble_Sort{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Create a Array of 5 elements
        int []numbers={15,20,8,11,2,17};
        int k=0;
        
        while(k<numbers.length-1){
        for(int a=1;a<numbers.length;a=a+1){
            if (numbers[a-1]>numbers[a]){
                int temp=numbers[a-1];
                numbers[a-1]=numbers[a];
                numbers[a]=temp;
            }
            else{
            k=k+1;
            }
            
        }
        
        }
        
        for (int a=0;a<numbers.length;a=a+1){
        //Display the Number of Seats based on the Ascending order 
        System.out.println("The "+(a+1)+" Element is "+numbers[a]+" Seats");
        
        }
    
    }
}

    
