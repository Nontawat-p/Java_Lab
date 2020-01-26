import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("ความยาว (เมตร) : ");
		double n;
		n = kb.nextDouble();
		System.out.println("********************************************");
		System.out.println((int)n+" เมตร  =" + n/2 + " วา");
		System.out.println(n/2+" วา  = "+ (int)n*2+" ศอก");
		System.out.println((int)n*2+ " ศอก   = "+(int)n*4+" คืบ");
		System.out.println((int)n*4+" คืบ  = "+(int)n*48 + " นิ้ว");
	}

}
