package com.bridgelabz.Linecomparision;

import java.util.Scanner;

public class LineComparisionMain 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter coordinates of both end points for first line:");
		Line firstLine=new Line(scanner.nextInt(), scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
		
		System.out.println("Enter coordinates of both end points for second line:");
		Line secondLine= new Line(scanner.nextInt(), scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
		
		LengthComparatorIF lengthComparator = new LengthComparatorImpl();
		
		System.out.println("Comparing lines using compare to method");
		lengthComparator.compareUsingCompareToMethod(firstLine, secondLine);
		
		System.out.println("Comparing liens using equals method");
		lengthComparator.compareUsingEqualsMethod(firstLine, secondLine);
		
		scanner.close();

	}

}
