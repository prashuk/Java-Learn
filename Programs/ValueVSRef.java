public class ValueVSRef 
{
	public static void main(String[] args)
	{
		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100
		
		swap(red, blue);
		System.out.println("After Swapping");
		System.out.println("red color = " + red.getColor());
		System.out.println("blue color = " + blue.getColor());
		
		foo(blue);
		System.out.println("After new keyword");
		System.out.println("blue color = " + blue.getColor());
	}

	private static void foo(Balloon balloon) // balloon = 100
	{
		balloon.setColor("Red"); // balloon = 100
		balloon = new Balloon("Green"); // balloon = 200
		balloon.setColor("Blue"); // balloon = 200
	}

	public static void swap(Object o1, Object o2) //o1=50, o2=100
	{
		Object temp = o1; //temp=50, o1=50, o2=100
		o1=o2; //temp=50, o1=100, o2=100
		o2=temp; //temp=50, o1=100, o2=50
	}
}

class Balloon
{
	private String color;

	public Balloon()
	{

	}
	
	public Balloon(String c)
	{
		this.color = c;
	}
	
	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
}

// If you look at the first two lines of the output, it’s clear that swap method didn’t worked. This is because Java is pass by value, this swap() method test can be used with any programming language to check whether it’s pass by value or pass by reference.

// If you look at the first two lines of the output, it’s clear that swap method didn’t worked. This is because Java is pass by value, this swap() method test can be used with any programming language to check whether it’s pass by value or pass by reference.

// When we use new operator to create an instance of a class, the instance is created and the variable contains the reference location of the memory where the object is saved. For our example, let’s assume that “red” is pointing to 50 and “blue” is pointing to 100 and these are the memory location of both Balloon objects.

// Now when we are calling swap() method, two new variables o1 and o2 are created pointing to 50 and 100 respectively.

// Notice that we are changing values of o1 and o2 but they are copies of “red” and “blue” reference locations, so actually there is no change in the values of “red” and “blue” and hence the output.

// If you have understood this far, you can easily understand the cause of confusion. Since the variables are just the reference to the objects, we get confused that we are passing the reference so java is passed by reference. However, we are passing a copy of the reference and hence it’s pass by value. I hope it clears all the doubts now.

// Java is always Pass by Value and not pass by reference