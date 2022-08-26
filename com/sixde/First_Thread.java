package com.sixde;

import java.util.Scanner;

public class First_Thread extends Thread {
	public void run() {
		try
		{
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				wait();
				
			}
			
		}
		notify();
		
		}
		catch (Exception e) {
			//e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
