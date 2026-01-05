// Kuang Miao
// Date: 01/05/2026
// Description: This component is the moving ball which the user will control indirectly via the paddle.
package com.BrickBreak;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

	//your code here!
	public class Ball{
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
		this.radius = diameter/2;
		this.xVelocity = 0;
		this.yVelocity = 0;

	}
	
	//methods:
	//precondition: g, x, y, radius is not null
	//postcondition: the ball is drawn
	public void draw(Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.fillOval(x,y,radius,radius);

	}
	//precondition: y is not null
	//postcondition: return the y position of ball
	public int getYpos()
	{
		return this.y;
	}
	//precondition: x is not null
	//postcondition: return the x position of ball
	public int getXpos()
	{
		return this.x;
	}
	//precondition: radius is not null
	//postcondition: get the diameter of the ball
	public int getSize()
	{
		return 2*radius;
	}
	//precondition: yVelocity is not null
	//postcondition: the ball changes y-direction
	public void reverseY()
	{
		yVelocity = yVelocity * (-1);
	}
	//precondition: xVelocity is not null
	//postcondition: the ball changes x-direction
	public void reverseX()
	{
		xVelocity = xVelocity * (-1);
	}
	//precondition: xVelocity is not null
	//postcondition: give the xVelocity
	public void setXVelocity(int xVelocity)
	{
		this.xVelocity = xVelocity;
	}
	//precondition: x is not null
	//postcondition: set the initial x-position of ball
	public void setX(int x)
	{
		this.x = x;
	}
	//precondition: y is not null
	//postcondition: set the initial y-position of ball
	public void setY(int y)
	{
		this.y = y;
	}
	//precondition: yVelocity is not null
	//postcondition: set the initial yVelocity
	public void setYVelocity(int yVelocity)
	{
		this.yVelocity = yVelocity;
	}
	//precondition: xVelocity and yVelocity are not null
	//postcondition: move the ball
	public void move()
	{
		x += xVelocity;
		y += yVelocity;
	}
	}