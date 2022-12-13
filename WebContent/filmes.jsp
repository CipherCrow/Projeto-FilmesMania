<%@ page import="java.util.List, br.com.filmesmania.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <link rel="stylesheet" href="style.css">

    <title>Top 250</title>
</head>
<!--HEAD-->
<!--BODY-->

<body class="bg-dark">
    <!-- HEADER-->
    <header class="text-center text-white header-principal">
        <div class="logo">
            <h4 class="text-black">Top 250 Filmes IMDb</h4>
        </div>
    </header>
    <!-- HEADER -->
    <!-- MAIN-->
    <main class="container text-center" id="filmes">
        <div class="row justify-content-evenly">
			<c:forEach items="${filmes}" var="filme">
			
	            <div class="separador col-sm-6 col-md-4 col-lg-3">
	                <div class="card col-12">
	                    <img src="${filme.image}" class="card-img-top" alt="${filme.fullTitle}">
	                    <div class="card-body row text-center text-white">
	                        <h5 class="card-title">${filme.fullTitle}</h5>
	                        <p class="card-text col-6 col-md-4">Pos: <strong class="texto-destaque">${filme.rank}</strong></p>
	                        <p class="card-text col-6 col-md-4">Nota: <strong class="texto-destaque">${filme.imDbRating}</strong></p>
	                        <p class="card-text col-12 col-md-4">Ano: <strong class="texto-destaque">${filme.year}</strong></p>
	                    </div>
	                </div>
	            </div>
	            <!--CARD INDIVIDUAL-->
	            
			</c:forEach>
        </div>
        <!--ROW DE FILMES-->
    </main>
    <!-- MAIN-->
</body>
<!--BODY-->

</html>