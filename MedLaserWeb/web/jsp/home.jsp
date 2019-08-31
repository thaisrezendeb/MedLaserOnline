<%-- 
    Document   : home
    Created on : 30/06/2010, 09:24:29
    Author     : Matheus Totora
    Descrição  : Página principal do projeto.
--%>
<%@include file="../WEB-INF/imports.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<mtw:requiresAuthentication />
<link rel="stylesheet" href="css/mlo.css" type="text/css"/>
    <h2>Bem vindo ${usuarioLogado.nome}</h2>
    <hr width="400px"/>
