package tim_gia_tri_trong_mang;

import java.util.Scanner;

public class timgiatritrongmang {

	public static void main(String[] args) {
		String[] students = {"Chirstian","Michael","Camila","Sienna","Tanya","Connor","Zachariah"};
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten sinh vien:");
		String input_name = scanner.nextLine();
		
		boolean isExist = false;
		for(int i = 0; i <students.length; i++) {
			if(students[i].equals(input_name)) {
				System.out.println("Sinh vien co ten " + input_name + " o vi tri: " +(i+1));
				isExist = true;
				break;
			}
		}
		if(!isExist) {
			System.out.println("Khong co sinh vien " + input_name + " trong danh sach.");
		}
	}

}
