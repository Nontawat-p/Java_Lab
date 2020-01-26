import java.util.*;
import java.text.*;
public class BMI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("*****Program calculate BMI******");
		int des;
		do {
			System.out.print("Weight (kg) :");
			double weight = kb.nextDouble();
			System.out.print("Height (M) :");
			double height = kb.nextDouble();
			double BMI = weight/(Math.pow(height, 2));
			if(BMI<18.5) {
				System.out.println("You status is Underweight");
			}
			else if(BMI<23.4) {
				System.out.println("You status is Normal weight");
			}
			else if(BMI<28.4) {
				System.out.println("You status is Overweigh");
			}
			else if(BMI<34.9) {
				System.out.println("You status is Obesity 1");
			}
			else if(BMI<39.9) {
				System.out.println("You status is Obesity 2");
			}
			else {
				System.out.println("You status is Obesity max");
			}
			System.out.print("***If you want to calculate BMI,press 1:");
			des = kb.nextInt();
		}while(des ==1);
		System.out.println(">>>>>Thank you<<<<<<");
	}

}
