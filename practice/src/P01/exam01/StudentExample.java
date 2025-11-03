package P01.exam01;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("이메일: ");
		String email = sc.nextLine();
		
		System.out.print("학번: ");
		String id = sc.nextLine();
		
		sc.close();
		
		Student student = new Student(name, email, id);
		
		System.out.println("이름: " + student.getName());
		System.out.println("이메일: " + student.getEmail());
		System.out.println("학번: " + student.getId()); 
	}

}
