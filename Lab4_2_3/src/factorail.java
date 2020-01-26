import java.util.*;
public class factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your number :");
		int number = kb.nextInt();
		if(number==0) {
			System.out.println("=================================\nFactorail of 0 = 1");
		}
		else if(number<0) {
			System.out.println("Number should be non-negtive.");
		}
		else {
			System.out.println("Solution");
			int fact=1;
			for(int i = number;i>1;i--) {
				 fact *= i; 
				 if(i==2) {
					 System.out.format("%d = %d",i,fact);
				 }
				 else {
				 System.out.format("%d *",i);
				 }
			}
			System.out.println("\n=========================\nFactorail of "+number+" is = "+fact);
		}
		
	}

}
