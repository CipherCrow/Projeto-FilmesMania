##  Projeto de Biblioteca de Filmes!
Projeto em desenvolvimento de uma biblióteca em Java para consulta de filmes e séries. O projeto consiste no uso da API da IMDb para realizar as consultas. 
Evoluindo de sua versão anterior, o sistema agora se tornou web. Logando através da página de login.js, você é direcionado para a tela com os 250 filmes e séries mais bem avaliadas. Você pode rodar o sistema da sua própria máquina ou acessar o Link do deploy da aplicação.
No futuro, planejo aperfeiçoar esse código, implementando Springboot nesse sistema e escalonar o código para permitir outros tipos de consultas.

## Requisitos
1. É necessário que o usuário do sistema tenha uma Chave API para ser realizada a requisição. O cadastro pela chave pode ser realizado através do site:
    *  https://imdb-api.com/api 
2. É necessário possuir um Server Instalado na máquina. Embora qualquer server seja capaz de rodar o .war, o projeto foi construído em cima do Tomcat 9.0. Tomcat pode ser encontrado atraés do site oficial: 
    * https://tomcat.apache.org/
    
## 💻 Tecnologias 
>![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
>![JSP](https://img.shields.io/badge/JSP-ED8B00?style=for-the-badge&logo=java&logoColor=white)
>![JSTL](https://img.shields.io/badge/JSTL-ED8B00?style=for-the-badge&logo=java&logoColor=white)
>![JAVA SERVLET](https://img.shields.io/badge/Java_Servlet-ED8B00?style=for-the-badge&logo=java&logoColor=white)
>![HTML](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
>![CSS](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
>![BOOTSTRAP](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)

## Como acessar
### Apache Tomcat localmente
1. Extraia o arquivo .War da pasta "\build" para dentro da pasta "suaVersãoTomCat\webapps";
2. Inicie o servidor através do script "Startup" dentro da pasta "suaVersãoTomCat\bin";
3. Pelo navegador, acesse "http://localhost:8080/FilmesMania/controler?ordem=RealizaLogin"

### Eclipse IDE
1. Realize o procedimento para instalar o TomCat no link abaixo:
    https://www.devmedia.com.br/instalacao-e-configuracao-do-apache-tomcat-no-eclipse/27360
2. Para associar o projeto ao servidor, clique com o botão direito do mouse no servidor Tomcat que foi criado na visualização Servidor e selecione Incluir e remover projetos. Selecione os projetos do serviço e cliente na lista de Projetos Disponíveis e clique em Incluir.
3. Inicie o servidor clicando com o botão direito do mouse em cima do servidor e dando "Start Server" 
4. Pelo navegador, acesse "http://localhost:8080/FilmesMania/controler?ordem=RealizaLogin"

## Ícones
- :up: Atualização.
- :bug: Correção.
