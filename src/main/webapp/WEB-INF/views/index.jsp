<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt">
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>CarBR</title>

<!-- Bootstrap core CSS -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" />
<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/resources/css/jumbotron.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="/resources/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Alternar Navegação</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="main.do">CarBR</a>
        </div>
		<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" method="post"
					action="login.do">
					
					<div class="input-append">
						<input type="text" placeholder="Login" class="form-control"
							name="nomeUsuario">
							
							<input type="password" placeholder="Senha" class="form-control"
							name="senha">
						

					
						
					
					<button type="submit" class="btn btn-success">Entrar</button>
					</div>
				</form>
				
				</div>
			</div>
      
    </nav>
	
	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h1>Bem Vindo a CarBR</h1>
			<p>Oferecemos a você a praticidade e qualidade de um Sistema
				simples e funcional</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Saiba
					mais &raquo;</a>
			</p>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>Proposta do Sistema</h2>
				<p>Usando a linguagem de programação JAVA com conexão com
					banco de dado MySql, conseguimos realizar um sistema de Locadora de
					veículos que foca na simplicidade e rapidez .</p>
				<p>
					<a class="btn btn-default" href="#" role="button">Saiba mais
						&raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>Vantagens</h2>
				<p>Sistema de fácil acesso, permite qualquer atendente
					iniciante aprender a usar em pouco tempo, não precisando de curso
					e assim reduzindo custos.</p>
				<p>
					<a class="btn btn-default" href="#" role="button">Saiba mais
						&raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>Benefícios</h2>
				<p>Segurança contra crimes de sabotagem, espionagem e invasões
					de hackers.</p>
				<p>
					<a class="btn btn-default" href="#" role="button">Saiba mais
						&raquo;</a>
				</p>
			</div>
		</div>

		<hr>

		<footer>
			<p>&copy; CarBR 2015</p>
		</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

</body>
</html>
