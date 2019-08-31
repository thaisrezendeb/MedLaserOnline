<%-- 
    Document   : template
    Created on : 01/07/2010, 12:39:22
    Author     : Matheus Totora
    Descricao  : Define uma estrutura básica para todas as páginas jsp do projeto.
--%>
<%@include file="../../WEB-INF/imports.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/mlo.css" type="text/css"/>
        <title>MedLaser Online</title>
    </head>
    <body>
        <div id="container">
            <template:block id="header"/>
            <template:block id="menu"/>
            <div id="conteudoPrincipal">
                <template:block id="body"/>
            </div>
            <template:block id="footer"/>
        </div>
    </body>
</html>