package Stingsweek2;

import java.util.*;

public class MainProduct {

		public static void main(String[] args)
		{
			List<Product> productlist = new ArrayList<>();
			productlist.add(new Product(1,"watch",2000.67,3.5f,2));
			productlist.add(new Product(11,"earphones",2400.67,3.6f,8));
			productlist.add(new Product(199,"phone",22000.67,4.5f,1));
			productlist.add(new Product(108,"shoes",1000.67,2.5f,10));
			productlist.add(new Product(10,"shirt",4000.67,1.5f,5));
			System.out.println("printing product details");
			printproductlist(productlist);
			System.out.println("based on their id");
			Collections.sort(productlist);
			printproductlist(productlist);
			System.out.println("based in thier name");
			Collections.sort(productlist,new Comparatorr());
			printproductlist(productlist);
		//using lambda
			System.out.println("based on their cost");
			Collections.sort(productlist,(Product p3,Product p4)->{
				Double c1=p3.getCost();
				Double c2= p4.getCost();
				return c1.compareTo(c2);
			});
			printproductlist(productlist);
			System.out.println("based on thier rating");
			Collections.sort(productlist,(Product p1,Product p2)->
			{
				Float f1 =p1.getRating();
				Float f2 =p2.getRating();
				return f1.compareTo(f2);
				
				
			});
			printproductlist(productlist);
			System.out.println("based on thier quantity");
			Collections.sort(productlist,(Product p1,Product p2)->
			{
				Integer f1 =p1.getQuantity();
				Integer f2 =p2.getQuantity();
				return f1.compareTo(f2);
				
				
			});
			printproductlist(productlist);
		
			
			
		}
		public static void printproductlist(List<Product> productlist)
		{
		for(Product p :productlist)
		{
			System.out.println(p);
		}
		}
		
		

	}



