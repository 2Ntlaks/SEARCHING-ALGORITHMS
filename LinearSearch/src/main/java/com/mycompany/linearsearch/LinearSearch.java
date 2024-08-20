package com.mycompany.linearsearch;
/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class LinearSearchArray
{
    int[] values;
    
    Random generator = new Random();
    
    public LinearSearchArray(int sizeOfArray)
    {
        values = new int[sizeOfArray]; 
        
        for(int i =0; i<values.length; i++)
        {
            values[i] = generator.nextInt(50);
        }
   }
    
   //method to perform linear search on the array with random values
    public int search(int key)
    {
        for(int i =0; i<values.length; i++)
        {
            if(values[i] == key)
            return i; //return the index of the values if found
        }
        return -1; //return -1 if the value is not found in the array
    }
    
    //Method to print the elements of the array by class reference
    @Override
    public String toString()
    {
        return Arrays.toString(values);
    }
    public void printArray()
    {
        System.out.println("\tElements in an array/list => "+this+"\n");
    }
    
}
public class LinearSearch {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        LinearSearchArray search = new LinearSearchArray(size); // *size* is the size of the array, as the class constructor indicated
       
        search.printArray();  // Display the generated array
        
        while(true)
        {
            System.out.print("Enter the value you want to search in the list/array (-1 to exit): ");
            int key = input.nextInt();
            
            if(key == -1)
                break; // Exit loop if user enters -1
            
           int searchResults = search.search(key); //calling search method
           
           if(searchResults == -1)
            System.out.println("The value "+key+" is not found in the array/list");
           else
            System.out.println("The value "+key+" is found at index "+searchResults+"\n");
        }
        System.out.println("Program Terminated.");
    }
}
