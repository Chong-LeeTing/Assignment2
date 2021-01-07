package Assignment2;

import java.util.*;

public class assignment2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Personal Background" );
		System.out.print("Enter your name");
		String name = in.next();
		System.out.println("Name: "+name);
		
		System.out.print("Enter your gender");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender: "+gender);
		
		System.out.print("Enter your age");
		int age = in.nextInt();
		System.out.println("Age: "+age);
		
		System.out.print("Enter your IC number");
		String ic = in.next();
		System.out.println("IC no: "+ic);
		
		System.out.print("Enter your matric number");
		int matric = in.nextInt();
		System.out.println("Matric no: "+matric);
		
		System.out.print("Enter your phone number");
		String phone = in.next();
		System.out.println("Phone no: "+phone);
		
		System.out.print("Enter your email");
		String email = in.next();
		System.out.println("Email: "+email);
		
		System.out.println("Services provided in University Health Centre");
		for(int i = 0; i < 5; i++) {
			String service = in.next();
		}
		
		System.out.println("Charges");
		String s1 = in.next();
		System.out.println("for "+s1);
		double hours = in.nextDouble();
		if(hours <= 1) {
			System.out.println("The charge is RM 20");
		}else if(hours <= 2 && hours > 1) {
			System.out.println("The charge is RM 25");
		}else {
			System.out.println("The charge is RM 30");
		}
		
		String s2 = in.next();
		System.out.println("for "+s2);
		double hours1 = in.nextDouble();
		if(hours1 <= 1) {
			System.out.println("The charge is RM 25");
		}else if(hours1 <= 2 && hours1 > 1) {
			System.out.println("The charge is RM 30");
		}else {
			System.out.println("The charge is RM 35");
		}
		String s3 = in.next();
		System.out.println("for "+s3);
		double hours2 = in.nextDouble();
		if(hours2 <= 1) {
			System.out.println("The charge is RM 35");
		}else if(hours2 <= 2 && hours2 > 1) {
			System.out.println("The charge is RM 40");
		}else {
			System.out.println("The charge is RM 45");
		}
		
		String s4 = in.next();
		System.out.println("for "+s4);
		double hours3 = in.nextDouble();
		if(hours3 <= 1) {
			System.out.println("The charge is RM 45");
		}else if(hours3 <= 2 && hours3 > 1) {
			System.out.println("The charge is RM 50");
		}else {
			System.out.println("The charge is RM 55");
		}
		
		String s5 = in.next();
		System.out.println("for "+s5);
		double hours4 = in.nextDouble();
		if(hours4 <= 1) {
			System.out.println("The charge is RM 45");
		}else if(hours <= 2 && hours > 1) {
			System.out.println("The charge is RM 50");
		}else {
			System.out.println("The charge is RM 55");
		}
		
		int n = in.nextInt();
		System.out.println("Number of services:" +n);
		int i = 0;
		while(i < 3) {
			String serviceOrdered = in.next();
			System.out.println("Services ordered: "+serviceOrdered);
			i++;
		}
		
		System.out.println("Total price:");
		
		
		
		
		
		

	}

}
