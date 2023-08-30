<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
    <title>Locadora</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        body {
            background-image: url('imgfundo.png');
            background-size: cover;
        }

        div {
            width: 60%;
            margin: 0 auto;
            padding: 15px;
        }

        h1 {
            font-weight: bolder;
            padding: 60px;
            background: black;
            border-radius: 25px;
            width: 30%;
            margin: 0 auto;
        }

        .button-group {
            display: flex;
            flex-direction: column;
        }
    </style>
</head>
<body>
<h1 class="text-center mt-4">Locadora do Allan</h1>
<div class="button-group">
    <div class="text-center"><a href="InserirAtor.jsp"><input type="submit" class="btn btn-success btn-lg"
                                                              value="Cadastrar Ator" id="cadastrarAtor"/></a><a
            href="ListarAtores.jsp"><input type="submit" class="btn btn-primary btn-lg"
                                           value="Listar Atores" id="listarAtores"/></a></div>
    <div class="text-center"><a href="InserirClasse.jsp"><input type="submit" class="btn btn-success btn-lg"
                                                                value="Cadastrar Classe" id="cadastrarClasse"/></a>
        <a href="ListarClasses.jsp"><input type="submit" class="btn btn-primary btn-lg"
                                           value="Listar Classes" id="listarClasses"/></a>
    </div>
</div>
</body>
</html>