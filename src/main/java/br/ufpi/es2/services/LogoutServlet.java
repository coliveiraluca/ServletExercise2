package br.ufpi.es2.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

import br.ufpi.es2.entity.User;

public class LogoutServlet extends HttpServlet {

    public LogoutServlet()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Date endSessionTime = new Date(session.getLastAccessedTime());
        User u = (User) session.getAttribute("user");

        System.out.println("Usuario: "+u.getLogin()+" deslogado as: "+endSessionTime);

        if (session.getAttribute("user") != null)
            session.invalidate();

        response.sendRedirect("loginForm.jsp");
    }
}
