<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Calificador de pruebas</h1>
	<div>
		<c:if test="${mensaje != null}">
			<c:out value="${mensaje}"></c:out>
		</c:if>
	</div>
	<form method="POST" action="/guardarcalificacion">
		Alumno: 
		<select name="slcalumno" id="slcalumno" >
			<option value="">Selecciona un alumno</option>
			<c:forEach items="${alumnos}" var="alumno">
				<option value="${alumno.id}">${alumno.nombre} ${alumno.apellido}</option>
			</c:forEach>
		</select>
		<br>
		Asignatura: 
		<select name="slcasignatura" id="slcasignatura" >
			<option value="">Selecciona una asignatura</option>
			<c:forEach items="${asignaturas}" var="asignatura">
				<option value="${asignatura.id}">${asignatura.nombreAsignatura}</option>
			</c:forEach>
		</select>
		<br>
		Fecha: 
		<input type="date" name="txtfecha" id="txtfecha" />
		<br>
		Glosa: 
		<input type="text" name="txtglosa" id="txtglosa" />
		<br>
		Nota: 
		<input type="text" name="txtnota" id="txtnota" />
		<br>
		<input type="submit" name="btnguardar" value="Guardar" />
	</form>
	
</body>
</html>