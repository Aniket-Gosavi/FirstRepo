import java.sql.*;

class Slip3a
{
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/ANIKET/Adv Java/Database2.accdb");
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery("select * from Employee Where dept = 'computer science'");
			while(rs.next())
			{
				System.out.println(rs.getInt("id") +"\t"+ rs.getString("ename") +"\t"+ rs.getInt("sal"));
			}
			rs.close();
			s.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}