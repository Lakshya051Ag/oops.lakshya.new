package assigment_2;

public class vol_of_earth {
	public static void main(String[] args) {
		double r = 6378;
		double pi = 3.14;
		double sphere = (4.0/3.0)*pi*r*r*r;
		double miles = sphere*0.621;
		System.out.print(sphere +"  "+miles);
		
	}
}
//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is __
