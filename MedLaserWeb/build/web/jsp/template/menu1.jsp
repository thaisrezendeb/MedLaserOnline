<%-- 
    Document   : menu1
    Created on : 26/07/2010, 18:18:27
    Author     : Thais
--%>

<%@include file="../../WEB-INF/imports.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<div id="menutreeview">
    <link rel="stylesheet" href="css/jquery.treeview.css" />
    <link rel="stylesheet" href="css/red-treeview.css" />
    <link rel="stylesheet" href="css/screen.css" />

    <script src="js/jquery.js" type="text/javascript"></script>
    <script src="js/jquery.cookie.js" type="text/javascript"></script>
    <script src="js/jquery.treeview.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function() {
            $("#browser").treeview();
        });
    </script>

    <a href="Home.mtw">Página Inicial</a>
    | <a href="Logout.mtw">Logout</a>
    <br /><br />

    <ul id="browser" class="filetree treeview">
        <li class="collapsable"><div class="hitarea collapsable-hitarea "></div><img src="images/folder.gif" alt=" "> Posto 1
            <ul>
                <li class="last">blabla <img src="images/file.gif" alt=" "></li>
            </ul>
        </li>
        <li class="collapsable"><div class="hitarea collapsable-hitarea"></div><img src="images/folder.gif"> Posto ABC
            <ul style="display: block;">

                <li class="collapsable"><div class="hitarea collapsable-hitarea "></div><img src="images/folder.gif"> Posto ABC
                    <ul id="folder21">
                        <li><img src="images/file.gif"> more text</li>
                        <li class="last">and here, too<img src="images/file.gif"></li>
                    </ul>
                </li>
                <li class="last"><img src="images/file.gif"></li>

            </ul>
        </li>
        <li class="closed expandable"><div class="hitarea closed-hitarea expandable-hitarea"></div>this is closed! <img src="images/folder.gif">
            <ul style="display: none;">
                <li class="last"><img src="images/file.gif"></li>
            </ul>
        </li>
        <li class="last"><img src="images/file.gif"></li>

    </ul>

</div>