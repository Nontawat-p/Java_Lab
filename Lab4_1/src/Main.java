import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		double income,tax,pay;
		System.out.println("****������ӹǳ�ѵ�������Թ��****");
		System.out.print("��سһ�͹�������ͻ� (�ҷ) :");
		income = kb.nextDouble();
		if(income<0) {
			System.out.println();
			System.out.println("************************");
			System.out.println("��سһ�͹�Թ�繨ӹǹ��ԧ�ǡ");
		}
		else if(income<200001)
		{
			System.out.println();
			System.out.println("************************");
			System.out.println("����ͧ��������");
		}
		else {
			System.out.print("�����ѡ � ���������(�ҷ) :");
			pay = kb.nextDouble();
			System.out.println("\n");
			System.out.println("************************");
			
			 if (income<200001) {
				tax = 0; 
			}
			else if (income<500001) {
				tax = (income * 5 )/100; 
			}
			else if (income<700001) {
				tax = (income * 7)/100; 
			}
			else if (income<1000001) {
				tax = (income * 10 )/100; 
			}
			else  {
				tax = (income * 12 )/100; 
			}
			
			if(tax>pay) {
				
				tax = tax - pay;
				System.out.println("��������  "+(int)tax);
			}
			else {
				tax = pay - tax ;
				System.out.println("������դ׹  "+(int)tax);	
				
			}
		}
	}

}
