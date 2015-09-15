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
          <a class="navbar-brand" href="index.do">CarBR</a>
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
			<h1>Erro!</h1>
			<p>Login ou Senha incorretos, tente novamente!</p>
		
		</div>
		</div>
		<div class="container">
				<hr>

		<footer>
			<p>&copy; CarBR 2015</p>
		</footer>
	
	</div>

	

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script type='text/javascript'
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

</body>
</html>
