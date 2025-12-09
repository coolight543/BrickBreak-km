// Kuang Miao
package com.BrickBreak;
import java.awt.*;

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int xVelocity; 
	private int yVelocity;

	
	
	
	//constructor(s):
	public Ball(int x, int y, int diameter)
	{
		this.x = x;
		this.y = y;
		this.diameter = 2 * radius;

	}
	
	//methods:
	public void draw(Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.fillOval(x,y,radius,radius);

	}
	public int getYpos()
	{
		return this.y;
	}
	public int getXpos()
	{
		return this.x;
	}
	public int getSize()
	{
		return this.diameter;
	}
	public void reverseY()
	{
		yVelocity = yVelocity * (-1);
	}
	public void reverseX()
	{
		xVelocity = xVelocity * (-1);
	}
	public void setXVelocity(int xVelocity)
	{
		this.xVelocity = xVelocity;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setYVelocity(int yVelocity);
	{
		this.yVelocity = yVelocity;
	}
	public void mo
