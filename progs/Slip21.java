import java.sql.*;

class Slip21
{
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Aniket/Adv Java/Database2.accdb");

			Statement s = con.createStatement();

			ResultSet rs = s.executeQuery("select * from Employee Where ename like 's%' ");
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
