<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nomina</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br>
<br>
<h2 align="center"><%= "Calcule su nomina" %>
</h2>
<br>
<form style="width: 80%; margin: auto" action="nomina-servlet" method="POST">
    <label for="nombres"><%= "Nombres"%></label>
    <br>
    <input type="text" name="nombres" id="nombres" class="form-control">
    <br><br>
    <label for="apellidos"><%= "Apellidos"%></label>
    <br>
    <input type="text" name="apellidos" id="apellidos" class="form-control">
    <br><br>
    <label for="documento"><%= "Documento"%></label>
    <br>
    <input type="number" name="documento" id="documento" class="form-control">
    <br><br>
    <label for="dtrab"><%= "Dias trabajados"%></label>
    <br>
    <input type="number" name="dtrab" id="dtrab" class="form-control">
    <br><br>
    <label for="sueldo"><%= "Valor del dia"%></label>
    <br>
    <input type="number" name="sueldo" id="sueldo" class="form-control">
    <br>
    <br>
    <input type="submit" class="btn btn-dark" value="Calcular">
</form>
<br>
</body>
</html>