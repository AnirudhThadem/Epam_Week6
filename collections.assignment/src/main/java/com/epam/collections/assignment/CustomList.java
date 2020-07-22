
package com.epam.collections.assignment;
import java.util.*;
public class CustomList {
	int default_size=10;
	int count=0;
	Object[] list= new Object[default_size];
	CustomList()
	{
		for(count=0;count<default_size;count++)
			list[count]=default_size;
	}
	public void addElement(Object e)
	{
		if(count==list.length)
			expandList();
		list[count++]=e;
	}
	public int size() {
        return count;
    }
	private void expandList() {
	        int newSize = list.length * 2;
	        list = Arrays.copyOf(list, newSize);
	 }
	// @SuppressWarnings("unchecked")
	public Object get(int i) {
	        if (i >= count || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return list[i];
	    }
	// @SuppressWarnings("unchecked")
	 public Object removeElement(int i) {
	     if (i >= count || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = list[i];
	        int numElts = list.length - ( i + 1 ) ;
	        System.arraycopy( list, i + 1, list, i, numElts ) ;
	        count--;
	        return  item;
	    }
	 public void printList()
	 {
		 System.out.println("Elements in the List are");
		  for(int i=0;i<count;i++)
		  {
			  System.out.println(list[i]+" ");
		  }
	 }
	 

}
