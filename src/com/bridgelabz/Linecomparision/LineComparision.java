package com.bridgelabz.Linecomparision;

import java.util.*;

public class LineComparision {

	public static Double LineLength(int px1,int py1,int px2,int py2) {
		
		return Math.sqrt((Math.pow(px2-px1,2) + Math.pow(py2-py1,2)));
	}
	
	
	public static void main(String args[]) {
		
		System.out.println("----------welcome to line comparision Computation problem----------");
		
		//variables
		int x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0,lengthCompare;
		Double lengthOfLine1,lengthOfLine2;
		
		System.out.println("Enter coordinates of point P1 for Line1");
		Scanner sc = new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		System.out.println("Enter coordinates of point P2 for Line1");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		System.out.println("Enter coordinates of point P1 for Line2");
		x3=sc.nextInt();
		y3=sc.nextInt();
		
		System.out.println("Enter coordinates of point P2 for Line2");
		x4=sc.nextInt();
		y4=sc.nextInt();
		
		//Length computation
		lengthOfLine1=LineLength(x1,y1,x2,y2);
		lengthOfLine2=LineLength(x3,y3,x4,y4);


		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Lines are equal");
			
		}
		else {
			System.out.println("Lines are not equal");
		}
		
		
		lengthCompare=lengthOfLine1.compareTo(lengthOfLine2);

		if(lengthCompare>0) {
			System.out.println("Line1 is greater than Line2");
		}
		else if(lengthCompare<0) {
			System.out.println("Line2 is greater than Line1");
		}
		else {
			System.out.println("Line1 is equal to Line2");

		}
 
		
		
		
	}

}
