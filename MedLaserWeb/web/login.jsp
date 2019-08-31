<%--
    Document   : login
    Created on : 30/06/2010, 08:47:13
    Author     : Matheus Totora
    Descrição  : Página para efetuar login ao site.
--%>
<%@include file="WEB-INF/imports.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
        <title>MedLaser Online</title>
    </head>
    <body>
        <mtw:form action="Login.mtw" method="post">
            <table>
                <tr>
                    <td><img src="images/logo-mlo.jpg" alt="Logo"/></td>
                </tr>                
                <tr>
                    <td><br/></td>
                <tr>
                    <td>Nome de usuário:</td>
                </tr>
                <tr>
                    <td><input type="text" name="usuario" size="20" maxlength=""/></td>
                </tr>
                <tr>
                    <td>Senha:</td>
                </tr>
                <tr>
                    <td><input type="password" name="senha" size="20" maxlength=""/></td>
                </tr>
                <tr class="error">
                    <td>${errorLogin}</td>
                </tr>
                <tr>
                    <td></td>
                </tr>
                <tr>                    
                    <td><input type="submit" value="Entrar"/></td>
                </tr>
            </table>
        </mtw:form>
    </body>
</html>