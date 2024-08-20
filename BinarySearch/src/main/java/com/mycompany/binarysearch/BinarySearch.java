package com.mycompany.binarysearch;

/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class BinarySearchArray
{
    int[] data;
    
    Random generator = new Random();
    
    //constructor that will put initial size of the array and assign random values to the array
    public BinarySearchArray(int sizeOfArray)
    {
        data = new int[sizeOfArray]; //size of the array
        
        for(int i = 0; i < data.length; i++)
        {
            data[i] = generator.nextInt(50);  //putting random values in array range form 0 to 50
        }
        
        Arrays.sort(data); // Sort the array after populating it with random values
    }
    
    
    //method that performs binary search on the array
    public int search(int key)
    {
        int low =0,high,middle; 
        
        high = data.length -1;
        
        while(low <= high)
        {
            middle = (low+high)/2;
            
            if(data[middle] == key)
                return middle;
            else if( key < data[middle])
                high = middle -1;
            else
                low = middle + 1;
        }
        return -1;  
    }
    
    //Method to print the elements of the array by class reference
    @Override
    public String toString()
    {
        return Arrays.toString(data);
    }
    public void displayArray()
    {
        System.out.println("Elements in array: "+this+"\n");
    }
}

public class BinarySearch {
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
       
       BinarySearchArray binarySearch = new BinarySearchArray(size); // giving size of the array 
       
       binarySearch.displayArray();
       
       while(true)
       {
           System.out.print("Enter the value you want to search (-1 to exit): ");
           int key = input.nextInt();
           
           if(key == -1)
               break;
           
           int searchResults = binarySearch.search(key); //calling search method
           
           if(searchResults == -1)
            System.out.println("The value "+key+" is not found in the array/list");
          else
             System.out.println("The value "+key+" is found at index "+searchResults+"\n");
       }
        System.out.println("Program Terminated.");
    }
}
