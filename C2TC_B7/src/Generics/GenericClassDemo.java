package Generics;

class genericTest<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
}

public class GenericClassDemo<T> {

	public static void main(String[] args) {
		genericTest<Integer> obj=new genericTest<Integer>();
		obj.add(2);
		System.out.println(obj.get());
	}



	
		

	}

}
