import  java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number of student :");
		int n = kb.nextInt();
		int[] id = new int[n];
		double [] score = new double[n];
		String[] grad = new String[n];
		for(int i =0;i<n;i++) {
			System.out.format("\n====== Student %d ======\n",i+1);
			System.out.print("ID : ");
			 id[i] = kb.nextInt();
			 System.out.print("Score : ");
			 score[i] = kb.nextDouble();
			 if(score[i]>100||score[i] <0 ) {
				 grad[i] = "Error";
			 }else if(score[i]<50) {
				 grad[i] = "F";
			 }else if(score[i]<60) {
				 grad[i] = "D";
			 }else if(score[i]<70) {
				 grad[i] = "C";
			 }else if(score[i]<80) {
				 grad[i] = "B";
			 }else {
				 grad[i] = "A";
			 }
		}
		System.out.println("\n\n==============Calculate Grade ================\n");
		for(int i=0;i<n;i++) {
			System.out.println(id[i]+" \t "+grad[i]);
		}
	}

}
