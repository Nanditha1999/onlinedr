<%-- 
    Document   : pat_login
    Created on : Jun 18, 2019, 9:30:45 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="connection.jsp"%>


<% String uu=request.getParameter("username");
String pp=request.getParameter("pass");
try
{
    String q="select * from patient_reg where username='"+uu+"' and password='"+pp+"'";
    ResultSet rs=st.executeQuery(q);
    if(rs.next())
    {
        session.setAttribute("username", uu);
        response.sendRedirect("viewpatient.jsp");
    }
    else
    {
        out.println("invalid userinfo");
    }
}
    catch(SQLException e)
            {
            out.println("Exception is"+e);
            }
%>
