import java.util.Scanner;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("***** Main Menu *****");
		System.out.println("1\t:\tพื้นที่วงกลม");
		System.out.println("2\t:\tความยาวเส้นรอบวง");
		System.out.println("1\t:\tปริมาตราทรงกลม");
		System.out.print("Choose your choice :");
		int ch = kb.nextInt();
		
		DecimalFormat p1 = new DecimalFormat("0.00");
		double result,r;
		switch (ch)
		{
		case 1:
			System.out.print("Input Radius :");
			 r = kb.nextDouble();
			 result = Math.PI * r*r;
			System.out.print("Result = "+p1.format(result));
			break;
		case 2:
			System.out.print("Input Radius :");
			 r = kb.nextDouble();
			 result = Math.PI * r*2;
			 System.out.print("Result = "+p1.format(result));
			break;
		case 3:
			System.out.print("Input Radius :");
			 r = kb.nextDouble();
			 result = Math.PI * Math.pow(r,3)*(4/3);
			 System.out.print("Result = "+p1.format(result));
			break;
		}
	}

}
