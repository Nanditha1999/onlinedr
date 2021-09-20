
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="connection.jsp"%>


<% String uu=request.getParameter("username");
String pp=request.getParameter("pass");
try
{
    String q="select * from doctor_reg where name='"+uu+"' and password='"+pp+"'";
    ResultSet rs=st.executeQuery(q);
    if(rs.next())
    {
        session.setAttribute("username",uu);
        response.sendRedirect("DOCTORHOME.jsp");
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
