package com.vasu.pacties;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest
{
	public static void main(String[] args) 
	{
		
Set<String> h=new HashSet<>();
h.add("Vasu");
h.add("Selenium");
h.add("QTP");
h.add("Vasu");
System.out.println(h.size());
//assign values to iterator object
Iterator<String> it=h.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
