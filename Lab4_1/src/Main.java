import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		double income,tax,pay;
		System.out.println("****โปรแกรมคำนวณอัตราภาษีเงินได้****");
		System.out.print("กรุณาป้อนรายำได้ต่อปี (บาท) :");
		income = kb.nextDouble();
		if(income<0) {
			System.out.println();
			System.out.println("************************");
			System.out.println("กรุณาป้อนเงินเป็นจำนวนจริงบวก");
		}
		else if(income<200001)
		{
			System.out.println();
			System.out.println("************************");
			System.out.println("ไม่ต้องจ่ายภาษี");
		}
		else {
			System.out.print("ภาษีหัก ณ ที่จ้ายไว้(บาท) :");
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
				System.out.println("จ่ายเพิ่ม  "+(int)tax);
			}
			else {
				tax = pay - tax ;
				System.out.println("จได้ภาษีคืน  "+(int)tax);	
				
			}
		}
	}

}
