package day16_collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashsetDem {
	import java.util.LinkedHashSet;
	 
	public class LinkedHashSetIterateExample {
	 
	    public static void main(String[] args) {
	        
	        LinkedHashSet<String> lhSetWeekDays = new LinkedHashSet<String>();
	        
	        lhSetWeekDays.add("Monday");
	        lhSetWeekDays.add("Tuesday");
	        lhSetWeekDays.add("Wednesday");
	        lhSetWeekDays.add("Thursday");
	        lhSetWeekDays.add("Friday");
	        
	        //iterating LinkedHashSet using enhanced for loop
	        for( String strDay : lhSetWeekDays ){
	            System.out.println( strDay );
	        }
	 
	    }

	

	}

}
