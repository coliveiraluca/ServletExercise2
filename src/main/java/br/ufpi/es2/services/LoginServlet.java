package br.ufpi.es2.services;

import br.ufpi.es2.control.UsersControl;
import br.ufpi.es2.data.UsersRepository;
import br.ufpi.es2.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class LoginServlet extends HttpServlet{

    private UsersRepository repository;
    private UsersControl controller;

    public LoginServlet()
    {
        super();
        repository = new UsersRepository();
        repository.autoPopulate();
        controller = new UsersControl(repository);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login;
        String password;

        login = request.getParameter("login");
        password = request.getParameter("password");
        System.out.println(login);
        System.out.println(password);

        User u = controller.search(login, password);

        if(u != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("email", u.getEmail());
            session.setAttribute("user", u);

            Date sessionCreationTime = new Date(session.getCreationTime());

            System.out.println("Sessao criada com succeso para o usuario "+session.getAttribute("email")+
                    "logado as "+sessionCreationTime);

            response.sendRedirect("/principal");
        }
        else
            response.sendRedirect("loginForm.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("user") != null)
            response.sendRedirect("/principal");
        else
            response.sendRedirect("loginForm.jsp");
    }
}