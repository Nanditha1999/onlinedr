<%-- 
    Document   : doctor_register
    Created on : Jun 17, 2019, 10:21:31 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="connection.jsp"%>


<%
String a,b,c,d,e;
a=request.getParameter("name");
b=request.getParameter("age");
c=request.getParameter("gender");
d=request.getParameter("date");
e=request.getParameter("prescription");

try
{
String query="insert into prescription(name,age,gender,date,prescription)"+
        "values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("DOCTORHOME.jsp");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
