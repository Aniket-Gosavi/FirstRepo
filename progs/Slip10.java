import java.sql.*;

class Slip10
{
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Aniket/Adv Java/Database2.accdb");
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery("select * from Employee");
			
			int count = 0;
			
			while(rs.next())
			{
				count++;
			}
			System.out.println("No of records" +count);
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
