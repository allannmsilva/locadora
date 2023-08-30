package br.com.locadora.controller;

import java.io.*;

import br.com.locadora.dao.DMLActions;
import br.com.locadora.model.Ator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ator", value = "/ator")
public class AtorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String codigo = req.getParameter("codigoAtor");
        String nome = req.getParameter("nomeAtor");

        if (codigo == null || codigo.isEmpty()) {
            DMLActions.insertAtor(new Ator(nome));
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListarAtores.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        if (nome == null || nome.isEmpty()) {
            DMLActions.deleteAtor(DMLActions.findByIdAtor(Long.parseLong(codigo)));
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListarAtores.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        Ator ator = DMLActions.findByIdAtor(Long.parseLong(codigo));
        ator.setNomeAtor(nome);
        DMLActions.updateAtor(ator);
        RequestDispatcher dispatcher = req.getRequestDispatcher("ListarAtores.jsp");
        dispatcher.forward(req, resp);
    }
}