<%-- 
    Document   : testing
    Created on : Apr 4, 2017, 12:45:56 PM
    Author     : Karthi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%String test = (String)request.getAttribute("testing"); %>
        The Estimated text is: <%= test%>
        
         The price is : ${strPrice}<br>
         
    </body>
</html>
