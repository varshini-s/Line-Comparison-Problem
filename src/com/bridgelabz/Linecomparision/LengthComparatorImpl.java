package com.bridgelabz.Linecomparision;

public class LengthComparatorImpl implements LengthComparatorIF

{
	LengthCalculatorIF lengthCalculator = new LengthCalculatorImpl();

	@Override
	public void compareUsingEqualsMethod(Line firstLine, Line secondLine) 
	{
		
		Double lengthToCompare=lengthCalculator.calculateLineLength(firstLine);
		Double lengthToCompareWith=lengthCalculator.calculateLineLength(secondLine);
		
		if(lengthToCompare.equals(lengthToCompareWith)) 
		{
			System.out.println("Both lines are equal in length");
			
		}
		else {
			System.out.println("Both lines are not equal in length");
		}
		
	}

	@Override
	public void compareUsingCompareToMethod(Line firstLine, Line secondLine) 
	{
		Double lengthToCompare=lengthCalculator.calculateLineLength(firstLine);
		Double lengthToCompareWith=lengthCalculator.calculateLineLength(secondLine);
		
		int compareResult=lengthToCompare.compareTo(lengthToCompareWith);
		
		switch (compareResult) 
		{
			case 0:
				System.out.println("Both lines are equal in length");
				break;
	
			case 1:
				System.out.println("first line has greater length than the second line");
				break;
				
			case -1:
				System.out.println("second line has lesser length than the second line ");
				break;
		}
		
	}

}
