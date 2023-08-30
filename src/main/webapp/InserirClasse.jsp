<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
    <title>Inserir Classe</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        div {
            width: 60%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<h4 class="text-center mt-4">Cadastrar Classe</h4>
<form method="POST" action="classe">
    <div class="mb-3">
        <input class="form-control" type="hidden" name="codigoClasse" id="codigoClasse">
        <label class="form-label" for="nomeClasse">Nome Classe</label>
        <input class="form-control" type="text" name="nomeClasse" id="nomeClasse">
        <label class="form-label" for="valor">Valor</label>
        <input class="form-control" type="number" step="any" name="valor" id="valor">
        <label class="form-label" for="valor">Data Devolução</label>
        <input class="form-control" type="date" name="dataDevolucao" id="dataDevolucao">
    </div>
    <div class="text-center"><input type="submit" class="btn btn-success" value="Inserir Classe" id="inserirClasse"/>
    </div>
</form>

<script>
    const urlSearchParams = new URLSearchParams(window.location.search);
    const params = Object.fromEntries(urlSearchParams.entries());

    if (params.codigoClasse) {
        const codigoClasse = document.getElementById("codigoClasse");
        codigoClasse.value = params.codigoClasse;
    }
    if (params.nomeClasse) {
        const nomeClasse = document.getElementById("nomeClasse");
        nomeClasse.value = params.nomeClasse;
    }
    if (params.valor) {
        const valor = document.getElementById("valor");
        valor.value = params.valor;
    }
    if (params.dataDevolucao) {
        const dataDevolucao = document.getElementById("dataDevolucao");
        dataDevolucao.value = params.dataDevolucao;
    }
    if (params.codigoClasse && params.nomeClasse) {
        const input = document.getElementById("inserirClasse");
        input.value = "Editar";
        input.className = "btn btn-warning";
    }
</script>
</body>
</html>