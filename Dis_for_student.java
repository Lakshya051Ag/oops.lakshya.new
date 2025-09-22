package assigment_2;

public class Dis_for_student {
	public static void main(String mian[]) {
		double fees=125000;
		double dis=10;
		double dis_per= (dis/100)*fees;
		double rate= fees - dis_per;
		System.out.print(dis_per+"  "+rate);
	}
}