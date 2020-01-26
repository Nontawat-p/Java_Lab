import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter amount of number :");
		int  n = kb.nextInt();
		int nOdd=0;
		int nEven=0;
		System.err.println("\n");
		int[] number = new int[n];
		for(int i =0 ;i<n;i++) {
			System.out.format("Enter number %d :",i+1);
			number[i] = kb.nextInt();
			if(number[i]%2==1||number[i]%2==-1) {
				nOdd+=1;
			}
			else {
				nEven+=1;
			}
		}
		System.out.println("\nTotal of Odd number is "+nOdd);
		System.out.println("Total of Even number is "+nEven);
		System.out.println();
		System.out.print("Odd number :");
		for(int i =0 ;i<n;i++) {
			if (number[i]%2==1||number[i]%2==-1) {
			System.out.print(number[i]+"\t");
			}
		}
		System.out.print("\nOdd number :");
		for(int i =0 ;i<n;i++) {
			if (number[i]%2==0) {
			System.out.print(number[i]+"\t");
			}
		}
	}

}
