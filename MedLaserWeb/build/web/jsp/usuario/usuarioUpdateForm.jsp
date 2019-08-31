<%-- 
    Document   : usuarioUpdateForm
    Created on : 02/07/2010, 20:11:01
    Author     : Matheus Totora
    Descrição  : Formulário para editar um usuário existente.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../../WEB-INF/imports.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/mlo.css" type="text/css"/>
<h3>Editar Usuário</h3>
<hr/>
<mtw:form action="UsuarioUpdate.mtw" method="post">
    <mtw:input type="hidden" name="id"/>
    <table id="tabela">
        <tr>
            <td>* Nome:</td>
            <td><mtw:input type="text" name="nome" size="40"/></td>
            <td>${errors.errorNome}</td>
        </tr>
        <tr>
            <td>* Login:</td>
            <td><mtw:input type="text" name="login" size="40"/></td>
            <td>${errors.errorLogin}</td>
        </tr>
        <tr>
            <td>* Senha:</td>
            <td><mtw:input type="password" name="senha" size="40"/></td>
            <td>${errors.errorSenha}</td>
        </tr>
        <tr>
            <td>* Perfil:</td>
            <td><mtw:select name="perfil" list="perfilOptions"/></td>
            <td>${errors.errorPerfil}</td>
        </tr>
        <tr>
            <td>* Administrador:</td>
            <td><mtw:select name="administradorId" list="administradorOptions"/></td>
            <td>${errors.errorAdministrador}</td>
        </tr>
        <tr>
            <td><br/>* Campos obrigatórios.</td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <mtw:submit value="Confirmar"/>
                <mtw:form action="UsuarioRead.mtw" method="post">
                <mtw:submit value="Cancelar"/>
                </mtw:form>
            </td>
        </tr>
    </table>
</mtw:form>