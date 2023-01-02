<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/controler" var="linkServletLogin"/>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta name="author" content="Jonas Torquatro Oliveira da Silva">
    <meta name="description" content="Pagina criada para mostrar os resultados da consulta">
    <meta name="keywords" content="HTML,CSS,Java">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="resources/style.css">
    <title>IMDb Consultor - Login</title>
</head>
<!--HEAD-->
<!--BODY-->

<body>
    <!-- HEADER-->
    <div class="header-container">
        <div class="container">
            <header class="d-flex align-items-center justify-content-around text-center text-white header-principal">
                <div class="logo">
                    <h4 class="text-black"><span class="text-uppercase">Cardápi</span>o</h4>
                </div>
                <div class="usuario-logado d-flex align-items-center">
                    <div class="key-usuario me-1 fw-bold">${usuarioLogado.key}</div>
                    <form class="sair" action="${linkServletLogin}" method="get">
                        <input type="hidden" name="ordem" value="Deslogar">
                        <input type="submit" class="btn-diferente texto-destaque fw-bold" value="SAIr">
                    </form>
                </div>        
            </header>   
        </div>     
    </div>
    <!-- HEADER -->
    <!-- MAIN-->
    <main class="container text-center" id="filmes">
        
    </main>
    <!-- MAIN-->
</body>
<!--BODY-->

</html>