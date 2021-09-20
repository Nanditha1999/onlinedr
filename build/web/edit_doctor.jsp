<%-- 
    Document   : edit_doctor
    Created on : Jul 4, 2019, 11:33:33 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connection.jsp"%>
<%String user=(String)session.getAttribute("username");%>
<%
String a,b,c,d,e,f,g;
a=request.getParameter("name");
b=request.getParameter("age1");
c=request.getParameter("Gender1");
d=request.getParameter("WORKING1");
e=request.getParameter("YEAR1");
f=request.getParameter("QUALI1");
g=request.getParameter("SKYP");


try
{
String query="UPDATE doctor_reg SET name='"+a+"',age='"+b+"',gender='"+c+"',working_hospital='"+d+"',year_of_experience='"+e+"',specialization='"+f+"',skypid='"+g+"' where name='"+user+"'";
       
out.println(query);
st.executeUpdate(query);
response.sendRedirect("DRLOGIN.html");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>

