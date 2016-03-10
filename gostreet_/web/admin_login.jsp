<%-- 
    Document   : admin_login
    Created on : Apr 8, 2015, 6:05:49 PM
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
       <div style="height:130px; width:320px; margin: 0 auto; margin-top: 200px; border:solid 2px black; border-color: black; "> 
                    <form style="" action="http://localhost:8084/gostreet_/ad_log_serv" method="post">
                
            <table cellspacing="15px" style="margin:0 auto">
                
                <tr>
                    <td>
                        Enter Email:
                    </td>
                    <td> <input type="text" name="txtemail"></input></td> 
                </tr>
                <tr>
                    <td>
                        Enter Password:
                    </td>
                    <td><input type="password" name="txtpass"> </input> </td>
                </tr>
                 <tr>
                     <td></td>
                    <td>
                        <input type="submit" value="LOGIN"></input>
                    </td>
                </tr>
            </table>
                    </form>
                    </div>
    </body>
</html>



 