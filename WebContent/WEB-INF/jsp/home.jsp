<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Employés</title>
	</head>
	<body>
		<h2>Liste des employés</h2>
		<ul>
			<c:forEach items="${employes}" var="employe">
				<li>
					<c:out value="${employe.nom}" />
					<c:out value="${employe.prenom}" />
					<c:out value="${employe.email}" />
				</li>
			</c:forEach>
		</ul>
	</body>
</html>