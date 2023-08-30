<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
    <title>Inserir Ator</title>
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
<h4 class="text-center mt-4">Cadastrar Ator</h4>
<form method="POST" action="ator">
    <div class="mb-3">
        <label class="form-label" for="nomeAtor">Nome Ator</label>
        <input class="form-control" type="hidden" name="codigoAtor" id="codigoAtor">
        <input class="form-control" type="text" name="nomeAtor" id="nomeAtor">
    </div>
    <div class="text-center"><input type="submit" class="btn btn-success" value="Inserir Ator" id="inserirAtor"/></div>
</form>

<script>
    const urlSearchParams = new URLSearchParams(window.location.search);
    const params = Object.fromEntries(urlSearchParams.entries());

    if (params.codigoAtor) {
        const codigoAtor = document.getElementById("codigoAtor");
        codigoAtor.value = params.codigoAtor;
    }
    if (params.nomeAtor) {
        const nomeAtor = document.getElementById("nomeAtor");
        nomeAtor.value = params.nomeAtor;
    }
    if (params.codigoAtor && params.nomeAtor) {
        const input = document.getElementById("inserirAtor");
        input.value = "Editar";
        input.className = "btn btn-warning";
    }
</script>
</body>
</html>