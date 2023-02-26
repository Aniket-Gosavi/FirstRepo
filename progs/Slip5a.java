import java.io.*;
import java.sql.*;
class Slip5a
{
	public static void main(String args[])
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Aniket/Adv Java/Database2.accdb");
			Statement s = con.createStatement();
			s.executeUpdate("create Table Teacher (tno integer,tname text,salary integer,Desg text)");
			s.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PreparedStatement ps = con.prepareStatement("insert into teacher([tno],[tname],[salary],[desg]) values(?,?,?,?)");
			String ch = " ";
			do
			{
				System.out.println("enter tno");
				int tno = Integer.parseInt(br.readLine());
				System.out.println("enter tname");
				String tname = br.readLine();
				System.out.println("enter salary");
				int salary= Integer.parseInt(br.readLine());
				System.out.println("enter designation");
				String desg = br.readLine();
				ps.setInt(1,tno);
				ps.setString(2,tname);
				ps.setInt(3,salary);
				ps.setString(4,desg);
				ps.executeUpdate();
				System.out.println("continue Y/N?");
				ch = br.readLine();
			}
			while(ch.equals("Y"));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
