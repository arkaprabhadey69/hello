package com.calc;

public class Charge {
	
	public final double rx, ry;
	public final double q;
	public static final double k=8.99e09;
	
	public Charge(double r1, double r2,double q1)
	{
		rx=r1;
		ry=r2;
		q=q1;
	}
	
	public double potentialAt(double x, double y)
	{
		//double k=8.99e09;
		double dx=(x-rx);
		double dy=(y-ry);
		return k * q /(Math.sqrt(dx*dx + dy*dy));
	}
	
	public String toString()
	{
		return q + " at ( "+ rx + ","+ry + ")";
	}
	
	public static void main(String[] args)
	{
		//double x= Double.parseDouble("1");
		//double y=Double.parseDouble("2");
		double x= Double.parseDouble(args[0]);
		double y= Double.parseDouble(args[1]);
		System.out.println(args[0]);
		System.out.println(args[1]);
		Charge c1= new Charge(0.52,0.32,21.3);
		Charge c2= new Charge(0.13,0.82,80.2);
		double v1= c1.potentialAt(x, y);
		double v2=c2.potentialAt(x, y);
		System.out.println("The values are : "+v1+" and "+v2);
	}

}
