package new_project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class CardGame {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	
	Set<String> strvalue = new HashSet<String>();
	Set<String> numvalue = new HashSet<String>();
	
	
	for(int i = 0; i < 8; i++) {
		System.out.println("Enter a card:");
		String s=inp.nextLine();
		String a=inp.nextLine();	
		if(!strvalue.contains(s)) {	
		strvalue.add(s);
		numvalue.add(a);
	}
	}
	
	
	System.out.println("Four symbols gathered in eight cards.");
	System.out.println("Cards in Set are:");
	 Iterator<String> itr=strvalue.iterator();  
	 Iterator<String> itr2=numvalue.iterator();
	  while(itr.hasNext() && itr2.hasNext()){  
	   System.out.println(itr.next()+" "+itr2.next());  

	  }
	  
	  inp.close();
}
}
