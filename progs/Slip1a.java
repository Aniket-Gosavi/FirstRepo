̥̥̥̥I̥mport java.util.*;̥
class Slip1a
{
	public static void main(String args[])
	{
		try
		{
			InetAddress i=InetAddress.getByName("localhost");
			System.out.println(i);
			System.out.println("IP address:"+i.getHostAddress()+"\nName;"+i.getHostName());
		}
		catch(UnknownHostException e)
		{
			System.out.println(e);
		}
	}
}
