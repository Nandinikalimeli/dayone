package com.wipro.calc;

import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int numberone,numbertwo,result;
		System.out.println("Enter number 1");
		numberone=scan.nextInt();
		System.out.println("Enter number 2");
		numbertwo=scan.nextInt();
		result=numberone+numbertwo;
		System.out.println("addition of two numbers" + result);
		System.out.println("welcome to stackroute program");
	}

}
