<%-- 
    Document   : connection
    Created on : Jun 17, 2019, 10:53:23 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*"%>
<%!Statement st=null;%>
<%Connection con=null;%>
<%!Statement st1=null;%>
<%Connection conn=null;%>
<%
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","");
st=con.createStatement();
st1=con.createStatement();
%>