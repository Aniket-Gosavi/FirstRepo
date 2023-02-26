 class new_thread extends Thread
{
	public new_thread(String s)
	{
		super(s);
	}

	public void run()
	{
		System.out.println("Name of thread is "+getName());
		while(true)
		{
			int s=(int)(Math.random()*5000);
			System.out.println("Thread priority "+s);
			try
			{
				Thread.sleep(s);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
	
class slip16_thread
{
	public static void main(String args[])
	{
		new_thread t1=new new_thread("ABC");
		new_thread t2=new new_thread("XYZ");
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e){ }
	}
	
}	