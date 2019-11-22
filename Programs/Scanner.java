import java.util.*;
import java.util.Scanner;

class Scanner {
	   
	public static Scanner myObj = new Scanner(System.in);
   
	public static void main(String[] args) {
    	System.out.println("Enter name: ");
    	String name = myObj.nextLine();
    	print("Hello " + name);
   	}
  
   	public static void print(String str) {
    	System.out.println(str);
	}
	   
}