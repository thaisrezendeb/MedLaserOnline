<%-- 
    Document   : usuarioList
    Created on : 02/07/2010, 22:11:21
    Author     : Matheus Totora
    Descrição  : Lista todos os usuários cadastrados.
--%>
<%@include file="../../WEB-INF/imports.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<mtw:requiresAuthentication />
<link rel="stylesheet" href="css/mlo.css" type="text/css"/>
<h3>Cadastro de Usuários</h3>
<hr/>
<mtw:form action="UsuarioRead.mtw" method="post">
    <mtw:input name="usuario" type="text"/>
    <mtw:submit value="Procurar"/>
</mtw:form>
<br/><br/>
<a href="UsuarioShowCreateForm.mtw">Novo Usuário</a>
<br/><br/>
<div id="tabela">
    <display:table name="usuarios" id="row" requestURI="" pagesize="5">
        <display:column property="nome"/>
        <display:column property="login"/>      
        <display:column property="perfil"/>
        <display:column value="<a href=\"UsuarioShowUpdateForm.mtw?id=${row.id}\">Editar</a>"/>
        <display:column value="<a href=\"UsuarioDelete.mtw?id=${row.id}\">Excluir</a>"/>
    </display:table>
</div>