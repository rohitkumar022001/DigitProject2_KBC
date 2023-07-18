package com.digit.project.kbc;

import java.util.Scanner;

public class kbcGame {
	

	public static void main(String[] args) {
		userDetails u = new userDetails();
		final String name;
		final int age;
		final String gender;
		System.out.println("PLEASE ENTER YOUR DETAILS HERE");
		Scanner sc = new Scanner(System.in);
		System.out.println("NAME :");
		name = sc.nextLine();
		u.setName(name);
		System.out.println("AGE :");
		age = sc.nextInt();
		u.setAge(age);
		System.out.println("GENDER :");
		gender = sc.next();
		u.setGender(gender);
		System.out.println("\nWELCOME " + u.getName() + " IN KBC GAME");
		System.out.println("\nHERE IS YOUR DETAILS");
		System.out.println("\nNAME - " + u.getName() + "\nAGE - " + u.getAge() + "\nGENDER - " + u.getGender());
		System.out.println("\n\nNOW YOU CAN START ANSWERING QUESTIONS");
		check q=new check();
		q.ques();
		sc.close();
		
	}

}
