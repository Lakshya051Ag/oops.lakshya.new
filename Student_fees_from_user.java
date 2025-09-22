package assigment_2;
import java.util.Scanner;
public class Student_fees_from_user {
	public static void main(String[]args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter fee");
		        double fee = input.nextDouble();
		        System.out.print("Enter discount percent");
		        double dp = input.nextDouble();
		        double dis = (dp / 100) * fee;
		        double finalFee = fee - dis;
		        System.out.println( dis + " discounted fee" + finalFee);
		        input.close();
		}

	}

/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___*/
