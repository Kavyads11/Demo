package com.practice;

import java.util.Scanner;

public class Practice {
    int counter = 1;
    static int N;
  
    public void oddNumber(int n)
    {
     synchronized (this)
        {
            while (counter < n)
            {
                  while (counter % 2 == 0)
                  {
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ " "+counter);
                counter++;
                notify();
            }
        }
    }
  
    
    public void evenNumber(int n)
    {
        synchronized (this)
        {
            while (counter < n) 
            {
                while (counter % 2 == 1)
                {
                    try 
                    {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+  " "+counter);
                counter++;
                notify();
            }
        }
    }
  
    
    public static void main(String[] args)
    {
    	 System.out.println("enter input");
         Scanner sc = new Scanner(System.in);
         int N=sc.nextInt();
  
        
        Practice mt = new Practice();
  
       
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.evenNumber(N);
            }
        });
  
        
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.oddNumber(N);
            }
        });
    t1.setName("Thread-2");
    t2.setName("Thread-1");
        
        t1.start();
        t2.start();
    }
}