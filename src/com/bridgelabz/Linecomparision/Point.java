package com.bridgelabz.Linecomparision;

public class Point 

{
	private  int xCoordinate;
	private  int yCoordinate;
	
	public Point() 
	{
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		
	}
	
	public Point(int xCoordinate,int yCoordinate) 
	
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		
	}
	
	//creating get methods to read coordinates
	public int getXCoordinate()
	{
		return xCoordinate;
	}
	public int getYCoordinate()
	{
		return yCoordinate;
	}
	
	//creating set methods to set coordinate values
	public void setXCoordinate(int xCoordinate)
	{
		this.xCoordinate=xCoordinate;
		
	}
	public void setYCoordinate(int yCoordinate)
	{
		this.yCoordinate=yCoordinate;
	}
	

	

}
