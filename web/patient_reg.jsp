<%-- 
    Document   : patient_reg
    Created on : Jun 17, 2019, 1:19:46 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@include file="connection.jsp"%>


<%
String a,b,c,d,e,f,g,h,i;
a=request.getParameter("name");
b=request.getParameter("age");
c=request.getParameter("Gender");
d=request.getParameter("add");
e=request.getParameter("STATE");
f=request.getParameter("CITY");
g=request.getParameter("email");
h=request.getParameter("username");
i=request.getParameter("pass");
try
{
String query="insert into patient_reg(name,age,gender,address,state,city,email,username,password)"+
        "values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("PATIENTLOGIN.html");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
