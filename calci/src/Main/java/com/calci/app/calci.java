package com.calci.app;

class calci
{
public static double add(double a,double b) 
  {
	  return a+b;
  }
  public static double sub(double a,int b) 
  {
	  return a-b;
  }
  public static double mul(double a,double b) 
{
	  return a*b;
  }
  public static double div(double a,double b) 
{
	  if (b==0)
		  return 0.0;
	  else
	  return a/b;
  }
  public static int rem(int a,int b) 
{
	  return a%b;
  }

}
