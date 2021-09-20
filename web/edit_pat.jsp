<%-- 
    Document   : edit_pat
    Created on : Jul 5, 2019, 10:50:21 AM
    Author     : pc
--%>
<%-- 
    Document   : edit_doctor
    Created on : Jul 4, 2019, 11:33:33 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connection.jsp"%>
<%String user=(String)session.getAttribute("username");%>
<%
String a,b,c,d,e,f;
a=request.getParameter("name");
b=request.getParameter("age");
c=request.getParameter("gender");
d=request.getParameter("address");
e=request.getParameter("state");
f=request.getParameter("city");


try
{
String query="UPDATE patient_reg SET name='"+a+"',age='"+b+"',gender='"+c+"',address='"+d+"',state='"+e+"',city='"+f+"' where name='"+user+"'";
       
out.println(query);
st.executeUpdate(query);
response.sendRedirect("PATIENTLOGIN.html");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>


