import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb  = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.00");
		System.out.println("******************คำนวณพื้นที่หกเหลี่ยมด้านเท่า*********************");
		System.out.print("ความยาวด้าน  :");
		double length = kb.nextDouble();
		System.out.println();
		System.out.println("******************************************************");
		double result = 6*(Math.sqrt(3)/4)* length * length;
		System.out.println("พื้นที่หกเหลี่ยมด้านเท่า  : "+f1.format(result));
	}

}
