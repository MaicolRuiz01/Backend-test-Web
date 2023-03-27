<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aplicacion Gestion de Usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark">
			<div>
				<a href="#" class="navbar-brand"> Gestion de Usuarios</a>
			</div>
			
			<ul class="navbar-nav">
				<li> <a href="<%=request.getContextPath()%>/list" class="nav-link">Usuarios</a></li>
			</ul>
		</nav>
	</header>
	<br/>
	
	<div class="row">
		<div class="container">
			<h3 class="text-center">Listado de Ususario</h3>
			<hr>
			<div class="container text-left">
			
				<a href ="<%=request.getContextPath()%>/new" class="btn btn-success">Agregar Nuevo Usuario</a>
				
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Email</th>
					<th>Pais</th>
					</tr>
				</thead>
				<tbody>
					<!-- for (Todo todo:todos) {-->
					<c:forEach var="user" items="${listUsers}">
						<tr>
							<td>
							<c:out value= "${user.id}"/>
							</td>
							
							<td>
							<c:out value="${user.nombre}"></c:out>
							</td>
							<td>
							<c:out value="${user.email}"></c:out>
							</td>
							<td>
							<c:out value="${user.pais}"></c:out>
							</td>
							<td> <a href="edit?id=<c:out value='${user.id}' />">Editar</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value= '${user.id }' />">Eliminar</a> </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	

</body>
</html>