<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
	<h2>Pagina Inicial da Lista de Tarefas</h2>
	<p>Bem Vindo, ${usuarioLogado.login}</p>
	<a href="listaTarefas">Clique Aqui</a> Para Acessar a lista de tarefas
	<a href="logout">Sair do Sistema</a>
</body>
</html>