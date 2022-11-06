package br.com.filmesmania.model;

public enum PaginaHtml {
	ABRIRHTML5{
		public String getHtml() {
			return 	"""
<!DOCTYPE html>
<html lang="pt-br">
					""";
		}
	},
	
	HEAD{
		public String getHtml() {
			return """
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta name="author" content="Jonas Torquatro Oliveira da Silva">
    <meta name="description" content="Página criada para mostrar os resultados da consulta">
    <meta name="keywords" content="HTML,CSS,Java">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

    <title>Melhores Filmes</title>
    <style>
        .espaco {
            padding: 0.1rem ;
        }
        .separador{
            margin: 0.5rem 0 ;
        }
        img{
            max-width: 95%;
            align-self: center;
        }
    </style>
</head>
<!--HEAD-->					
					""";
		}
	},
	
	ABRIRBODY{
		public String getHtml() {
			return """
<!--BODY-->

<body class="bg-dark">					
					""";
		}
	},
	
	HEADER{
		public String getHtml() {
			return """
	<!-- HEADER-->
    <header class="container text-center text-white">
        <div class="logo" style="padding: 2rem 0;">
            <h1 class="text-uppercase">Melhores Filmes IMBd</h1>
        </div>
    </header>
    <!-- HEADER -->					
					""";
		}
	},
	
	ABRIRMAIN{
		public String getHtml() {
			return """
    <!-- MAIN-->
    <main class="container text-center" id="filmes">
        <div class="row justify-content-evenly">					
					""";
		}
	},
	
	FECHARHTML5{
		public String getHtml() {
			return """
        </div>
        <!--ROW DE FILMES-->
    </main>
    <!-- MAIN-->
</body>
<!--BODY-->

</html>					
					""";
		}
	};
	
	public abstract String getHtml();
}
