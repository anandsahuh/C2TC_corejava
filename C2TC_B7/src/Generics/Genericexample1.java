package Generics;

public class Genericexample1 {

	import java.util.ArrayList;

	public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("India");
			list.add("japan");
			
			String country=list.get(0);
			System.out.println("element is "+ country);
			iterator<String> itr=list.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());

		}

}

}
