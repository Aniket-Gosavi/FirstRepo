
<%
String str1=request.getParameter("t1");
String str2=request.getParameter("t2");
if(str1.equals("admin") && str2.equals("admin"))
{
	session.setAttribute("username",str1);
	response.sendRedirect("slip1_home.jsp");
}
else
	response.sendRedirect("error.html");
%>