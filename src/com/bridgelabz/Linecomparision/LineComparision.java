package com.bridgelabz.Linecomparision;

import java.util.*;

public class LineComparision {
	
	public static void main(String args[]) {
		
		System.out.println("----------welcome to line comparision Computation problem----------");
		
		//variables
		int x1=0,x2=0,y1=0,y2=0;
		double lengthOfLine=0;
		
		System.out.println("Enter coordinates of point P1 ");
		Scanner sc = new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		System.out.println("Enter coordinates of point P2 ");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		lengthOfLine=Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
		
		System.out.println("Length of the line is : "+lengthOfLine);
		
		
		
				
		
		
		
		
		
		
		
		
	}

}
