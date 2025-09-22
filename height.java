package assigment_2;
import java.util.Scanner;
public class height {
	public static void main(String []main) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter height in cm");
		double cm = input.nextDouble();
		double inch = cm/2.54;
		double feet = inch/12;
		System.out.println("in inch "+ inch+" in feet "+feet); 	
		
		
	}

}
/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
