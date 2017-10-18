package br.ufpi.es2.services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//TODO
public class PrincipalServlet extends HttpServlet {

    public PrincipalServlet()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("user") != null)
        {
            request.setAttribute("user", session.getAttribute("user"));
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }else
            response.sendRedirect("loginForm.jsp");
    }
}
