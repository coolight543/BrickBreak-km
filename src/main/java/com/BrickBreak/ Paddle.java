package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height)
	{
		this.x =x;
		this.y = y;
		this.width = width;
		this.height = height;

	}
	//methods:
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getHeight()
	{
		return this.height;
	}
	public int getVelocity()
	{
		return this.velocity;
	}
	public void move()
	{
		x += velocity;

	}
	public void addVelocity(int velocity)
	{
		this.velocity += velocity;
	}
	public void setVelocity(int velocity)
	{
		this.velocity = velocity;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	
}
