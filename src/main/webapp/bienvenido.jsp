<%-- 
    Document   : bienvenido
    Created on : 19/05/2015, 09:25:37 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>bienvenido a la administracion de sitio</h1>
        <h2>Guargar Usuario</h2>
        <form action="guardar-usuario" method="post">
            <table>
                <tr>
                    <td>Nombre</td><td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td>Email</td><td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Login</td><td><input type="text" name="login"></td>
                </tr>
                <tr>
                    <td>Password</td><td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td> <td><input type="submit" value="Guardar Usuario"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
