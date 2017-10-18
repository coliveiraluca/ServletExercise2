<%--
  Created by IntelliJ IDEA.
  User: LucaCDO
  Date: 18/10/17
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page
    import="br.ufpi.es2.entity.User"
%>
<html>
<head>
    <title>Pagina Principal</title>
</head>
<body>
<%
    User u = (User) session.getAttribute("user");
    String login = u.getLogin();
    String name = u.getName();
    String email = u.getEmail();
%>

    <h2>Bem-vindo a pagina principal da aplicacao</h2>

    <p>Login: <%=login%></p>
    <br>
    <p>Email: <%=email%></p>
    <br>
    <p>Nome: <%=name%></p>

    <br><br>

    <a href="/logout">Logout</a>
    <br>
    <a href="/listar">Lista Usuarios</a>
    <br>
</body>
</html>
