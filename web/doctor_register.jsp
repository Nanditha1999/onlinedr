<%-- 
    Document   : doctor_register
    Created on : Jun 17, 2019, 10:21:31 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="connection.jsp"%>


<%
String a,b,c,d,e,f,g,h,i;
a=request.getParameter("name");
b=request.getParameter("age");
c=request.getParameter("Gender");
d=request.getParameter("HOS");
e=request.getParameter("SPC");
f=request.getParameter("YEAR");
g=request.getParameter("QUALI");
h=request.getParameter("skyp");
i=request.getParameter("pass");
try
{
String query="insert into doctor_reg(name,age,gender,working_hospital,specialization,year_of_experience,qualification,skypid,password)"+
        "values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("DRLOGIN.html");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
