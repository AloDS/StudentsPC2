<%-- 
    Document   : newjsp
    Created on : 08/04/2013, 08:17:18 PM
    Author     : Alonso DS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear estudiante!</h1>
        
        <form action="http://localhost:8080/StudentsPC2/students" method="POST">
            <input name="id" type="text">
            <input name="nombres" type="text">
            <input name="apellidos" type="text">                  
            <input name="cursoActual" type="text">
            <input name="notaActual" type="text">
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
