<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt" >
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CarBr</title>

   <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">
    
       <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/css/theme.css" rel="stylesheet">

     <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="${pageContext.request.contextPath}/resources/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>
  
  <body>
  
  
        <!-- Navigation -->
         <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
                <a class="navbar-brand" href="index.do">CarBR</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
              <ul class="nav navbar-nav">
            <li id="fat-menu" class="dropdown">
              <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Cliente
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" aria-labelledby="drop3">
                <li><a href="gerenciarCliente.do">Gerenciar Cliente</a></li>
              </ul>
            </li>
            <li id="fat-menu" class="dropdown">
              <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Emprestimo
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" aria-labelledby="drop3">
                <li><a href="gerenciarEmprestimo.do">Gerenciar Emprestimo</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="devolverVeiculo.do">Devolver Veículo</a></li>
              </ul>
            </li>           
            <li id="fat-menu" class="dropdown">
              <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Veículo
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" aria-labelledby="drop3">
                <li><a href="gerenciarVeiculo.do">Gerenciar Veículo</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="gerenciarModelo.do">Gerenciar Modelo</a></li>
              </ul>
            </li>
            <li id="fat-menu" class="dropdown">
              <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Relatórios
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" aria-labelledby="drop3">
                <li><a href="relatorioDiario.do">Gerar Relatório Diário</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="relatorioGeral.do">Gerar Relatório Geral</a></li>
              </ul>
            </li>
          </ul>
              <ul class="nav navbar-nav navbar-right">
              <li id="fat-menu" class="dropdown">
              <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                Usuário
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" aria-labelledby="drop3">
                <li><a href="dadosUsuario.do">Alterar Dados</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="sair.do">Sair</a></li>
              </ul>
            </li>
          </ul>
            <!-- /.navbar-collapse -->
            </div>
            </div>
        </nav>
      
 
 <div class="container theme-showcase" role="main">
 
     <div class="page-header">
 <div class="jumbotron">
		<div class="container">
			<h1>Devolver Veículo</h1>
			<p>Aqui você finaliza o emprestimo de um veículo com a sua devolução.</p>
		
		</div>
		</div>
		<div class="container">
				<hr>

		<footer>
			<p>&copy; CarBR 2015</p>
		</footer>
	
	</div>
 
 
 
 
 
 
 
 
     </div>


 </div> 

 
 
 
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
 </body>
 </html>  