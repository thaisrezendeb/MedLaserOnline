<%-- 
    Document   : menu
    Created on : 02/07/2010, 22:49:06
    Author     : Matheus Totora
    Descrição  : Definição do menu do projeto para todas as páginas jsp.
--%>
<%@include file="../../WEB-INF/imports.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/jquery.treeview.css" type="text/css"/>
<link rel="stylesheet" href="css/screen.css" type="text/css"/>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/jquery.treeview.js"></script>
<script type="text/javascript" src="js/demo.js"></script>

<div id="menutreeview">
    <a href="Home.mtw">Página Inicial</a> | <a href="Logout.mtw">Logout</a>
    <br /><br />

    <ul id="red">
        <li><span class="posto"><b> Posto ABC</b></span>
            <ul>
                <li><span> Monitoramento</span>
                    <ul>
                        <li><span><a href="#"> Tanques</a></span></li>
                        <li><span><a href="#"> Sensores</a></span></li>
                    </ul>
                </li>
                <li><span> Relatórios</span>
                    <ul>
                        <li><span><a href="#"> Histórico de Acesso</a></span></li>
                        <li><span><a href="#"> Tanques</a></span></li>
                        <li><span><a href="#"> Combustíveis</a></span></li>
                        <li><span><a href="#"> Turnos</a></span></li>
                        <li><span><a href="#"> Ambiental</a></span></li>
                        <li><span><a href="#"> Energia</a></span></li>
                    </ul>
                </li>
                <li><span> Cadastros</span>
                    <ul>
                        <li><span><a href="UsuarioRead.mtw"> Usuários</a></span></li>
                        <li><span><a href="#"> Combustíveis</a></span></li>
                        <li><span><a href="#"> Tanques</a></span></li>
                        <li><span><a href="#"> Sensores</a></span></li>
                        <li><span><a href="#"> Turnos</a></span></li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>