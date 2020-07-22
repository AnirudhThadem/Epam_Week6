package com.epam.collections.assignment;
import java.util.*;
public class Operation {
	public static void main(String[] args) 
    {
        CustomList list = new CustomList();
        char ch='y';
        Scanner sc=new Scanner(System.in);
      	while(ch=='y')
      	{
    	       System.out.println( "Enter an operation to perform: \n 1)Adding an Element \n 2)Removing an Element \n 3)Fetching an Element\n 4)Printing the elements of the List");
    	       
    	       int option,index;
    	       option=sc.nextInt();
    	    	switch(option)
    	    	{
    	    	case 1:System.out.println("Enter an Element:");
    	    		   Object element=sc.next();
    	    		   list.addElement(element); break;
    	    	case 2:System.out.println("Enter an index at which Element is to be deleted:");
    	    			 index=sc.nextInt();
    	    			list.removeElement(index); break;
    	    	case 3: System.out.println("Enter an index of element which is to be fetched:");
    	    			 index=sc.nextInt();
    	    			list.get(index);break;
    	    	case 4: list.printList();break;
    	    	default: System.out.println("Please choose a correct option");
    	    	}
    	    	System.out.println("DO you want to continue:(enter y for continue)");
    	    	ch=sc.next().charAt(0);
    	    	
      	}
      	sc.close();
        
    }

	
}
