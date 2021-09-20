<%-- 
    Document   : doctor_register
    Created on : Jun 17, 2019, 10:21:31 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="connection.jsp"%>


<%
String a;
a=request.getParameter("id");

try
{
String query="delete from appointments where patient_number='"+a+"'";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("cancelapp.jsp");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
