package day16_collectionframework;

public class HashSetdemo{
	
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.TreeSet;

			public static void main(String[] args) {
			TreeSet<String> hs=new TreeSet<String>();
	        hs.add("Hash");
	        hs.add("Set");
	        hs.add("Demo");
	        hs.add("Demo");
	        //hs.add(new Integer(10));
		   
	       Iterator i=hs.iterator();
	       while(i.hasNext())
	       {
	    	   Object o=i.next();
	    	   System.out.println(o);
	       }
		}

	

	
	
	}
