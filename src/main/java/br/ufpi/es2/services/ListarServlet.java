package br.ufpi.es2.services;

import br.ufpi.es2.control.UsersControl;
import br.ufpi.es2.data.InterfaceUsersRepository;
import br.ufpi.es2.data.UsersRepository;
import br.ufpi.es2.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class ListarServlet extends HttpServlet {

    private UsersRepository repository;
    private UsersControl controller;


    public ListarServlet()
    {
        super();
        repository = new UsersRepository();
        repository.autoPopulate();
        controller = new UsersControl(repository);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<User> list = controller.getUsuarios();

        HttpSession session = request.getSession();

        session.setAttribute("listUsers", list);

        if (session.getAttribute("user") != null)
            request.getRequestDispatcher("lista-usuarios.jsp").forward(request, response);
        else
            response.sendRedirect("/principal");
    }
}
