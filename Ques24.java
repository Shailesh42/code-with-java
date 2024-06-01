package practical ;
class Producer extends Thread {
	StringBuffer buffer; 
	boolean dp = false; 
       Producer() { 
    	  buffer = new StringBuffer(4); 
    	  } 
      public void run() 
      { 
    	  synchronized (buffer) 
           { 
        		  for (int i = 0; i < 4; i++)
        		  {  try 
        		       { 
        			    buffer.append(i); 
        			    System.out.println("Produced " + i); 
        			    }
        		     catch (Exception e) {    e.printStackTrace();  }
        		  }
        		  System.out.println("Buffer is FUll");
        		  buffer.notify(); 
        		  }
    	  } }
class Consumer extends Thread {
	Producer p;
	Consumer(Producer temp) 
	{ p = temp; } 
	public void run() {
		synchronized (p.buffer) 
		{ try { 
			p.buffer.wait(); } 
		 catch (Exception e) { 
			 e.printStackTrace(); }
		 for (int i = 0; i < 4; i++) { 
			 System.out.print(p.buffer.charAt(i) + " "); 
			 } 
		 System.out.println("\nBuffer is Empty"); 
		 }
		} 
} 
public class Ques24 { public static void main(String args[]) 
{ 
	 System.out.println("\n\t\t***********************************"); 
     System.out.println("\tDemostration of Producer-Consumer problem using the \r\t"  + "concept of inter thread communication"); 
     System.out.println("\t\t***********************************"); 
     Producer p = new Producer(); 
     Consumer c = new Consumer(p); 
     Thread t1 = new Thread(p);
     Thread t2 = new Thread(c); 
     t2.start();
     t1.start(); 
     System.out.println("\n\t\t***********************************"); 
     System.out.println("Name:SHAILESH KUMAR     Section:-I             Roll no.:-50"); 
     System.out.println("\t\t***********************************"); 
} 
} 

