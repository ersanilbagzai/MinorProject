<%-- 
    Document   : newjsp
    Created on : Jun 10, 2015, 6:56:40 PM
    Author     : sachinsir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
        int p,t;
        float r;
        float si;
        p=4000;
        r=2.5f;
        t=1;
        si=p*r*t/100;
        
        
        
        %>
        simple intrest is:<%=si%>
    </body>
</html>
