package com.sixde;

import java.util.Scanner;

public class Program{

	public static void main(String[] args) {
		System.out.println("Main Starts");
		First_Thread ft = new First_Thread();
		Second_Thread st = new Second_Thread();
		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(st);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
	
		try
		{
			t1.start();
			t2.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}
