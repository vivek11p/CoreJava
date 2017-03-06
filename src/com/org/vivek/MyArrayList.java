package com.org.vivek;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List,Serializable{

	public static final long serialversionUID=1L;
	public int size;
	public int initialCapacity=10;
	public Object[] objArray;
	
	public MyArrayList() {
		size=0;
		objArray=new Object[initialCapacity];
	}
	
	@Override
	public boolean add(Object arg0) {
		ensureCapacity(objArray);
		objArray[size]=arg0;
		size++;
		return true;
	}
	
	private void ensureCapacity(Object[] objArray)
	{
		Object[] newArray;
		if(this.size()>=initialCapacity)
		{
			newArray=new Object[initialCapacity+10];
			initialCapacity=initialCapacity+10;
			for(int i=0;i<objArray.length;i++)
			{
				newArray[i]=objArray[i];
			}
			this.objArray=newArray;
		}
	}
	
	@Override
	public void add(int index, Object element) {
		ensureCapacity(objArray);
		for(int i=size+1;i>index;i--)
			this.objArray[i]=this.objArray[i-1];
		objArray[index]=element;
		size++;
	}
	
	@Override
	public boolean addAll(Collection c) {
		return false;
	}
	
	@Override
	public boolean addAll(int index, Collection c) {
		return false;
	}
	
	@Override
	public void clear() {
		for(int i=0;i<size;i++)
		{
			this.objArray[i]=null;
		}
	}
	
	@Override
	public boolean contains(Object o) {
		for(int i=0;i<size;i++)
		{
			if(this.objArray[i]==o)
				return true;
		}
		return false;
	}
	
	@Override
	public boolean containsAll(Collection c) {
		return false;
	}
	
	@Override
	public Object get(int index) {
		return this.objArray[index];
	}
	
	@Override
	public int indexOf(Object o) {
		for(int i=0;i<size;i++)
		{
			if(this.objArray[i]==o)
				return i;
		}
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public Iterator iterator() {
		
		return null;
	}
	
	@Override
	public int lastIndexOf(Object o) {
		for(int i=size-1;i>=0;i--)
		{
			if(this.objArray[i]==o)
				return i;
		}
		return 0;
	}
	
	@Override
	public ListIterator listIterator() {
		
		return null;
	}
	
	@Override
	public ListIterator listIterator(int index) {
		
		return null;
	}
	
	@Override
	public boolean remove(Object o) {
		int index=indexOf(o);
		if(index!=0)
		{
			this.remove(index);
			size--;
			return true;
		}
		size--;
		return false;
	}
	
	@Override
	public Object remove(int index) {
		for(int i=index;i<size;i++){
			this.objArray[i]=this.objArray[i+1];
		}
		size--;
		return this.objArray;
	}
	
	@Override
	public boolean removeAll(Collection c) {
		
		return false;
	}
	
	@Override
	public boolean retainAll(Collection c) {
		
		return false;
	}
	
	@Override
	public Object set(int index, Object element) {
		this.objArray[index]=element;
		return null;
	}
	
	@Override
	public int size() {
		
		return size;
	}
	
	@Override
	public List subList(int fromIndex, int toIndex) {
		
		return null;
	}
	
	@Override
	public Object[] toArray() {
		
		return null;
	}
	
	@Override
	public Object[] toArray(Object[] a) {
		
		return null;
	}
	
	public String toString()
	{
		String s=null;
		for(int i=0;i<size;i++){
			s=s+(String)objArray[i]+" ";
		}
		return s;
	}

}
