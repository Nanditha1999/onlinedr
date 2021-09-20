<%-- 
    Document   : adminlogin
    Created on : Jun 18, 2019, 11:04:37 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="connection.jsp"%>


<% String u=request.getParameter("username1");
String p=request.getParameter("pass1");
try
{
    
    if(u.equals("admin")&&p.equals("admin"))
    {
        session.setAttribute("username",u);
        response.sendRedirect("adminhome.jsp");
    }
    else
    {
        out.println("invalid userinfo");
    }
}
    catch(Exception e)
            {
            out.println("Exception is"+e);
            }
%>
