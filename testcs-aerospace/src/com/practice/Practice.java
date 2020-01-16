package com.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Shop
{
   int product_id;
   String productName;
   float cost;
   int product_quantity;
    
   Shop(int product_id, String productName, float cost, int product_quantity)
   {
	   this.product_id = product_id;
	   this.productName=productName;
	   this.cost=cost;
	   this.product_quantity=product_quantity;
   }
   
   Shop()
   {
	   product_id=2;
	   productName="Soap";
	   cost = 0.08f;
	   product_quantity=20;
   }
   

   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The item with ProductId = "+product_id + " has ProductName "+productName+" with price "+cost+" and Quantity is "+product_quantity;
	}
}
public class Practice {

		static List list = new ArrayList();
	static	Shop s1, s2, s3,s4;
	static Iterator iterator = list.iterator();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 s1 = new Shop (1,"Rin", 20.5f, 10);
		 s2 = new Shop();
		 s3 = new Shop (3,"SurfExcel", 100f, 50);
		s4 = new Shop(4, "Tide", 308.7f,40);
		addDetails();
		
		int x = 2;
		deleteDetails(x);
		display();
		update(s3,s4);
		display();
		
	}
	public static void addDetails()
	{
		list.add(s1);    //list= name of new ArrayList
		list.add(s2);
		list.add(s3);
		
	}
	
	public static void deleteDetails(int id)
	{
		for(int i = 0; i<list.size();i++)
			
		{
			Shop p = (Shop)list.get(i);
			if(p.product_id==id)
			{
				System.out.println("\n Deleted item = "+  p);
				int index = list.indexOf(p);
				list.remove(index);
			}
			
		}
		
	}
	
	public static void update(Shop s, Shop s1)
	{
		
		if(s==null)
			System.out.println("Error");
		else
		{
			int index = list.indexOf(s);
			list.remove(index);
			list.add(s1);
		}
	}
	public static void display()
	{
		System.out.println(list);
	}

}