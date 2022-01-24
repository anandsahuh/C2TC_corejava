package Generics;

public class GenericMetodTest {

			 public <E> void displayArrayElements(E[] elements){

		   
		   for(E element:elements) {
			  {
				  System.out.println("element is: "+element);
			  }
		 }
		   	
				GenericMetodTest obj=new GenericMetodTest();
			Integer[] intarray= {10,20,30,40};
			String[] str= {"java","programming", "learning"};
			
			obj.displayArrayElements(intarray);
			obj.displayArrayElements(str);

			
			
		 

		 }
}

