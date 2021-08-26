package com.bridgelabz.Linecomparision;

public class Line 

{
	private Point pointA;
	private Point pointB;
	
	//parameterised constructor
	public Line(int startXCoordinate,int startYcoordinate,int endXCoordinate,int endYCoordinate) 
	{
	    this.pointA=new Point();
	    this.pointB=new Point();
	    pointA.setXCoordinate(startXCoordinate);
	    pointA.setYCoordinate(startYcoordinate);
	    pointB.setXCoordinate(endXCoordinate);
	    pointB.setYCoordinate(endYCoordinate);
	    
        
    }
   
	//get methods to read coordinates of point
	public int getXcoordinatePoinA()
	{
		return pointA.getXCoordinate();
		
	}
	public int getYcoordinatePointA()
	{
		return pointA.getYCoordinate();
	}
	public int getXcoordinatePoinB()
	{
		return pointB.getXCoordinate();
	}
	public int getYcoordinatePointB()
	{
		return pointB.getYCoordinate();
	}
	
	

}
