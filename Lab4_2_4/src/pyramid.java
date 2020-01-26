import java.util.*;
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("จำนวนชั้นของพีระมิด  :");
		int number = kb.nextInt();
		if(number<2) {
			System.out.println("***กรุณากรอกจำนวณทีมากว่าหนึ่ง***");
		}
		for(int i=0;i<number;i++) {
			for(int j=number-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2+1);k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
