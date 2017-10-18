<%--
  Created by IntelliJ IDEA.
  User: LucaCDO
  Date: 18/10/17
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page import="br.ufpi.es2.entity.User"
        import="java.util.ArrayList"%>
<html>
<head>
    <title>Lista Usuarios</title>
</head>
<body>
    <% ArrayList<User> list = (ArrayList<User>) session.getAttribute("listUsers");

        if (!list.isEmpty())
        {
            for (User u : list)
            {
                out.println(u.getId() + " - ");
                out.println(u.getName() + " - ");
                out.println(u.getEmail());
                out.println("<br>");
            }
        }else
            out.println("Nenhum elemento na lista");
    %>
</body>
</html>
