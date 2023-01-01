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
                    <div class="key-usuario me-1 fw-bold">SUA CHAVE AQUI</div>
                    <div class="sair ">
                        <button class="btn-diferente texto-destaque fw-bold" action="">SAIr</button>
                    </div>
                </div>        
            </header>   
        </div>     
    </div>
    <!-- HEADER -->
    <!-- MAIN-->
    <main class="container text-center" id="filmes">
        <div class="row justify-content-evenly">

            <div class="col-sm-8 col-md-8 col-lg-8">
                <div class="card col-12">
                    <div class="card-body row text-center text-white div-superior-login">
                        <p class="card-text col-12 fs-3 ">Bem vindo ao consultor <span class="texto-destaque">IMDb!</span></p>
                        <div class="apresentacao col-12">
                            <img src="images/apresentacao-imdb.jpg" alt="Logo da IMDb" class="apresentacao_img">
                            <p class="card-text col-12 fs-5 apresentacao-texto-baixo">Atrav�s deste site, voc� pode acessar a API da IMDb e adquirir 
                                informa��es sobre qualquer filme que desejar! Note que para continuar, � preciso uma KEY IMDB. Caso voc� ainda <span class="apresentacao-texto-nao">n�o</span> tenha 
                                uma KEY, por gentileza, <a href="https://imdb-api.com/" target="_blank" class="texto-destaque text-uppercase">Clique aqui</a>.</p>
                            <hr>
                        </div>
                    </div>
                    <!--Texto apresentacao-->
                </div>
            </div>
            <!--CARD INDIVIDUAL-->
        </div>
        <!--ROW DE FILMES-->
    </main>
    <!-- MAIN-->
</body>
<!--BODY-->

</html>