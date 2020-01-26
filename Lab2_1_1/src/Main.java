import java.util.*;// สำหรับ รับค่า
import java.text.*;// สำหรับจัดรูปแบบตัวเลข
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		DecimalFormat f1 = new DecimalFormat("#.0#");
		System.out.print("Input r :");
		double r = kb.nextDouble();
		double ans = Math.PI*r*r;
		double gg = 0.235689;
		System.out.println(f1.format(gg));
		System.out.println("ans = "+ans);
		System.out.println("FM ans = "+f1.format(ans));
		
	}

}
