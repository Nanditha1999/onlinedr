<%-- 
    Document   : appconnection
    Created on : Jun 17, 2019, 2:12:33 PM
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
%>