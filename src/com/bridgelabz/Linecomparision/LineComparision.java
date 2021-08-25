package com.bridgelabz.Linecomparision;

import java.util.*;

public class LineComparision 
{
	int x1,x2,y1,y2;
	Double lineLength;
	
	public LineComparision(int x1,int y1,int x2, int y2) 
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public static void calculateLineLength(LineComparision L) 
	{
		
		L.lineLength=Math.sqrt((Math.pow(L.x2-L.x1,2) + Math.pow(L.y2-L.y1,2)));
	}
	
	public static void checkLineEquality(LineComparision L1,LineComparision L2)
	{
		
		if(L1.lineLength.equals(L2.lineLength)) {
			System.out.println("Lines are equal");
			
		}
		else {
			System.out.println("Lines are not equal");
		}
	}
	public static void checkLineComparision(LineComparision L1,LineComparision L2)
	{
		

		int lengthCompare=L1.lineLength.compareTo(L2.lineLength);

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

	
	public static void main(String args[]) {
		
		System.out.println("----------welcome to line comparision Computation problem----------");//variables
		int x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0;
		
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
		

		LineComparision L1 = new LineComparision(x1,y1,x2,y2);
		LineComparision L2 = new LineComparision(x3,y3,x4,y4);
		
		calculateLineLength(L1);
		calculateLineLength(L2);
		
		checkLineEquality(L1,L2);
		
		checkLineComparision(L1,L2);
		


		
	}

}
