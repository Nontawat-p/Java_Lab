import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("������� (����) : ");
		double n;
		n = kb.nextDouble();
		System.out.println("********************************************");
		System.out.println((int)n+" ����  =" + n/2 + " ��");
		System.out.println(n/2+" ��  = "+ (int)n*2+" �͡");
		System.out.println((int)n*2+ " �͡   = "+(int)n*4+" �׺");
		System.out.println((int)n*4+" �׺  = "+(int)n*48 + " ����");
	}

}
