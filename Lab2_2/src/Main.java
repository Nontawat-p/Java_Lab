import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb  = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.0000");
		DecimalFormat f2 = new DecimalFormat("0.000");
		DecimalFormat f3 = new DecimalFormat("#.0000");
		System.out.print("\tInput a :");
		double a = kb.nextDouble();
		System.out.print("\tInput b :");
		double b = kb.nextDouble();
		System.out.print("\tInput c :");
		double c = kb.nextDouble();
		System.out.println();
		System.out.println("=====Result=====");
		System.out.println();
		double result = Math.sqrt(a*b)/(c*c);
		System.out.println("DecimalFormat A:"+f1.format(result));
		System.out.println("DecimalFormat A:"+f2.format(result));
		System.out.println("DecimalFormat A:"+f3.format(result));
		System.out.println("Good Luck");
	}

}