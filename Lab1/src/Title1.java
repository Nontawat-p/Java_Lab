import java.util.*;
public class Title1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String name;
		String nickname;
		String id;
		System.out.println("***************กรุณากรอกข้อมูล*****************");
		System.out.print("ชื่อ-นามสกุล :");
		name = kb.nextLine();
		System.out.print("ชื่อเล่น :");
		nickname = kb.next();
		System.out.print("รหัสนักศึกษา :");
		id = kb.next();
		System.out.println("Hello!"+nickname);
		System.out.println("คุณ"+name+" รหัส "+id);
		System.out.println("นักศึกษาคณะวิทยาศาสตร์ มหาวิทยาลัยขอนแก่น");
		System.out.println("******************************************");
		
	
	
	
	
	}

}
