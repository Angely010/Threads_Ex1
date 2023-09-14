package controller;

public class ThreadImprimeNumero extends Thread{
	public ThreadImprimeNumero() {
		 super();
	}
	
	public void run() {
		   int pid = (int) getId();
		   System.out.println("Thread #" + pid);
	}

}
