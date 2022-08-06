package collections.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Integer num=300;
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(0,50);
		list.add(400);
		list.add(2,num);
		list.add(100);
		list1.addAll(list);
		
		System.out.println(list);
		//System.out.println(list1);
		//list.remove(0);
		//list1.remove(num);
		//list.clear();
		//list.removeAll();
		System.out.println(list.indexOf(200));
		System.out.println(list.lastIndexOf(100)); //last index of specified element
		System.out.println(list.hashCode());
		System.out.println(list.size());
		System.out.println(list.listIterator());
		System.out.println(list.set(0, 75));
		//System.out.println(list);
		System.out.println();
		for(Integer i:list)
			System.out.println(i);
		System.out.println("remove using object");
		list.remove(num);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//System.out.println(list);
		//System.out.println(list1);
	}
	
}
