<%-- 
    Document   : blood_reg
    Created on : Jun 17, 2019, 2:28:52 PM
    Author     : pc
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@include file="connection.jsp"%>


<%
String a,b;
a=request.getParameter("a");
b=request.getParameter("b");

try
{
String query="insert into blood_bank(blood_group,availability) values('"+a+"','"+b+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("pblood.jsp");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
