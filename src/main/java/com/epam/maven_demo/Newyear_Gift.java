package com.epam.maven_demo;

import java.util.*;
public class Newyear_Gift {
	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age:");
	int age=sc.nextInt();
	System.out.println("enter number of chocolate pieces:");
	int n=sc.nextInt();
	Chocolates c=new Chocolates();
	c.menu();
	c.sort(age,n);
	System.out.println("enter the name of sweet using its number given in menu:");
	float name=sc.nextFloat();
	System.out.println("enter number of sweets:");
	float p=sc.nextFloat();
	sweets s=new sweets();
	s.sort(name,p);
	float c_wt=c.sort(age,n);
	float s_wt=s.sort(name,p);
	System.out.println("toatl weight of gift:"+ (c_wt+s_wt));
	System.out.println("total number of candies and sweets in gift:"+ (n+p));
	}
}
class Gift
{
void menu()
{
System.out.println("MENU");
System.out.println("Chocolates Menu:");
System.out.println("1.candy \n2.milkbar \n3.darkbar \n4.beerbar \n");
System.out.println("Sweets Menu:");
System.out.println("1. kajuSweets \n2. BadamSweets \n3. Dryfruitsweets \n4. carrotsweets");
}
}
class Chocolates extends Gift
{
float sort(int age,int n)
{
float weight_c=0;
if(age>=1 && age<=5)
{
int c_weight=50;
weight_c=c_weight*n;
}
else if(age>=6 && age<=10)
{
int m_weight=150;
weight_c=m_weight*n;
}
else if(age>=11 && age<=20)
{
int d_weight=200;
weight_c=d_weight*n;
}
else
{
int b_weight=50;
weight_c=b_weight*n;
}
return weight_c;
}
}
class sweets extends Gift
{
float sort(float name,float p)
{
float weight_s=0;
if(name==1)
{
int k_weight=50;
weight_s=k_weight*p;
}
else if(name==2)
{
int b_weight=150;
weight_s=b_weight*p;
}
else if(name==3)
{
int d_weight=200;
weight_s=d_weight*p;
}
else if(name==4)
{
int c_weight=45;
weight_s=c_weight*p;
}
else
{
System.out.println("select valid option");
}
return weight_s;
}
}