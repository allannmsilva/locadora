package br.com.locadora.controller;

import br.com.locadora.dao.DMLActions;
import br.com.locadora.model.Classe;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "classe", value = "/classe")
public class ClasseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String codigo = req.getParameter("codigoClasse");
        String nome = req.getParameter("nomeClasse");
        String valor = req.getParameter("valor");
        String dataDevolucao = req.getParameter("dataDevolucao");

        if (codigo == null || codigo.isEmpty()) {
            DMLActions.insertClasse(new Classe(nome, Double.parseDouble(valor),
                    Date.valueOf(dataDevolucao)));
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListarClasses.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        if (nome == null || nome.isEmpty()) {
            DMLActions.deleteClasse(DMLActions.findByIdClasse(Long.parseLong(codigo)));
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListarClasses.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        Classe classe = DMLActions.findByIdClasse(Long.parseLong(codigo));
        classe.setNomeClasse(nome);
        classe.setValor(Double.parseDouble(valor));
        classe.setDataDevolucao(Date.valueOf(dataDevolucao));
        DMLActions.updateClasse(classe);
        RequestDispatcher dispatcher = req.getRequestDispatcher("ListarClasses.jsp");
        dispatcher.forward(req, resp);
    }
}