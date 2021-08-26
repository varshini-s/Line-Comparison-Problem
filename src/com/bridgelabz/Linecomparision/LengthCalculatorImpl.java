package com.bridgelabz.Linecomparision;

public class LengthCalculatorImpl implements LengthCalculatorIF
{

	@Override
	public double calculateLineLength(Line line) 
	{
		return	(Math.sqrt((Math.pow(line.getXcoordinatePoinB()-line.getXcoordinatePoinA(),2) 
			
				+Math.pow(line.getYcoordinatePointB()-line.getYcoordinatePointA(),2))));
		
		
	}

}
