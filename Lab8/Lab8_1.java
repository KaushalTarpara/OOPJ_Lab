class ThreadDemo extends Thread
{
	ThreadDemo(ThreadGroup tp,String nm)
	{
		super(tp,nm);
	}

	public void run()
	{
		System.out.println("---------------------------Thread = " +Thread.currentThread().getName() + " Start--------------------------");
		System.out.println(Thread.currentThread().getName()+" GroupName=" +Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getName()+" Thread Priority=" +Thread.currentThread().getPriority());
		try{Thread.currentThread().sleep(1000); }
		catch(InterruptedException e){}
		for(int i=1;i<=7;i++)
		{
			if(i==6 && Thread.currentThread().getName().equals("Thread Demo-1") )
			{
				break;
			}
			if(i==7 && Thread.currentThread().getName().equals("Thread Demo-2") )
			{
				break;
			}
			System.out.println("Thread "+Thread.currentThread().getName()+" =" +i);
		}
		System.out.println("--------------------------" +Thread.currentThread().getName() +" Exit-------------------------------------" );
	}

}
class Lab8_1
{
	public static void main(String args[])throws InterruptedException
	{
		System.out.println("----------------------------------Thread= " +Thread.currentThread().getName() + " Start--------------------");
		
		ThreadGroup tp=new ThreadGroup("Main Group");
		tp.setMaxPriority(Thread.NORM_PRIORITY);
		System.out.println("Defualt currently Active group=" +tp.activeCount());
		
		ThreadDemo t1=new ThreadDemo(tp,"ThreadDemo");
		t1.setName("Thread Demo-1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		System.out.println("Thread"+t1.getName()+"is alive= " +t1.isAlive());
		System.out.println("After thread 1currently Active group=" +tp.activeCount());
		
		ThreadDemo t2=new ThreadDemo(tp,"Thread Demo-2");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		System.out.println("Thread"+t2.getName()+"is alive= " +t2.isAlive());
		System.out.println("After thread 2 currently Active group=" +tp.activeCount());
		
		ThreadDemo t3=new ThreadDemo(tp,"ThreadDemo-3");
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		System.out.println("After thread 3 currently Active group=" +tp.activeCount());
		System.out.println("Thread"+t3.getName()+"is alive= " +t3.isAlive());
		System.out.println("------------------------------------" +Thread.currentThread().getName() +" Exit---------------------------------" );
	}
}