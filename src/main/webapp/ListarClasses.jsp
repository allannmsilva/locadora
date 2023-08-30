<%@ page import="br.com.locadora.dao.DMLActions" %>
<%@ page import="br.com.locadora.model.Classe" %>
<%@ page import="java.util.List" %>
<%@ page import="static br.com.locadora.dao.DMLActions.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: allan
  Date: 29/08/2023
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html data-bs-theme="dark">
<h4 class="text-center mt-4">Lista de Classes</h4>
<head>
    <title>Classes</title>
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
    <table class="table table-hover align-middle" id="tabelaClasses">
        <thead>
        <tr>
            <th>Código Classe</th>
            <th>Nome Classe</th>
            <th>Valor</th>
            <th>Data Devolução</th>
            <th>Editar</th>
            <th>Excluir</th>
        </tr>
        </thead>
        <%
            if (!getListClasses().isEmpty()) {
                for (Classe classe : (List<Classe>) getListClasses()) {
        %>
        <tbody>
        <tr>
            <td><%= classe.getCodigoClasse()%>
            </td>
            <td><%= classe.getNomeClasse()%>
            </td>
            <td><%= classe.getValor()%>
            </td>
            <td><%= new SimpleDateFormat("dd/MM/yyyy").format(classe.getDataDevolucao())%>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/InserirClasse.jsp?codigoClasse=<%=classe.getCodigoClasse()%>&nomeClasse=<%=classe.getNomeClasse()%>&valor=<%=classe.getValor()%>&dataDevolucao=<%=classe.getDataDevolucao()%>"><input
                        type="button" class="btn btn-outline-warning btn-sm" value="Editar" id="editarClasse"/></a></td>
            <td><a href="classe?codigoClasse=<%=classe.getCodigoClasse()%>"><input type="button"
                                                                                   class="btn btn-outline-danger btn-sm"
                                                                                   value="Excluir" id="excluirClasse"/></a>
            </td>
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