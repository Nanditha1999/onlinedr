<%-- 
    Document   : doctor_register
    Created on : Jun 17, 2019, 10:21:31 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="connection.jsp"%>


<%
ResultSet rs;
String a,b,c,d,e;
a=request.getParameter("name");
b=request.getParameter("age");
c=request.getParameter("gender");
d=request.getParameter("date");
e=request.getParameter("prescription");

try
{
    String q="select * from patient_reg where name='"+a+"'";
    rs=st1.executeQuery(q);
    while(rs.next())
    {
        int id=rs.getInt("id");
    }
String query="insert into prescription(name,age,gender,date,prescription)"+
        "values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("DRLOGIN.html");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
