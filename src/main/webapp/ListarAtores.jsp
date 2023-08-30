<%@ page import="br.com.locadora.dao.DMLActions" %>
<%@ page import="br.com.locadora.model.Ator" %>
<%@ page import="java.util.List" %>
<%@ page import="static br.com.locadora.dao.DMLActions.*" %>
<%--
  Created by IntelliJ IDEA.
  User: allan
  Date: 29/08/2023
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html data-bs-theme="dark">
<h4 class="text-center mt-4">Lista de Atores</h4>
<head>
    <title>Atores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        div {
            width: 60%;
            margin: 0 auto;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }
    </style>
</head>
<body>
<div class="mb-3">
    <table class="table table-hover align-middle" id="tabelaAtores">
        <thead>
        <tr>
            <th>Código Ator</th>
            <th>Nome Ator</th>
            <th>Editar</th>
            <th>Excluir</th>
        </tr>
        </thead>
        <%
            if (!getListAtores().isEmpty()) {
                for (Ator ator : (List<Ator>) getListAtores()) {
        %>
        <tbody>
        <tr>
            <td><%= ator.getCodigoAtor()%>
            </td>
            <td><%= ator.getNomeAtor()%>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/InserirAtor.jsp?codigoAtor=<%=ator.getCodigoAtor()%>&nomeAtor=<%=ator.getNomeAtor()%>"><input
                        type="button" class="btn btn-outline-warning btn-sm" value="Editar" id="editarAtor"/></a></td>
            <td><a href="ator?codigoAtor=<%=ator.getCodigoAtor()%>"><input type="button"
                                                                           class="btn btn-outline-danger btn-sm"
                                                                           value="Excluir" id="excluirAtor"/></a></td>
        </tr>
        </tbody>
        <%
                }
            }
        %>
    </table>
</div>
</body>
</html>
