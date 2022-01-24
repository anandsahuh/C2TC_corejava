package Generics;

public class GenericConstructorsDemo {
private double v;
public <T extends Number>void GenericsConstructors(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Valu of v is: "+v);
}
public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericsConstructors obj2=new GenericsConstructors(10);
	  obj2.show();
	  
	  GenericConstructors obj1=new GenericsConstructors(136.8F);
	  obj1.show();
	}

}
