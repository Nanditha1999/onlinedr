<%-- 
    Document   : appointment_reg
    Created on : Jun 17, 2019, 2:03:15 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@include file="connection.jsp"%>


<%
String a,b,c,d,e,f,g;
a=request.getParameter("PNUM");
b=request.getParameter("name");
c=request.getParameter("Gender");
d=request.getParameter("age");
e=request.getParameter("mobile");
f=request.getParameter("doctor");
g=request.getParameter("date");

try
{
String query="insert into appointments(patient_number,name,gender,age,mobile_number,doctor,date)"+
        "values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')";
out.println(query);
st.executeUpdate(query);
response.sendRedirect("viewpatient.jsp");
}
catch(SQLException e1)
{
    out.println("Exption is"+e1);
    
}
%>
