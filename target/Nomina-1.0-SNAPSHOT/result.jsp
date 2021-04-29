<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 28/04/2021
  Time: 3:10 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page import="com.edu.sena.Nomina.Model.NominaDatos"%>
<head>
    <title>Resultado</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br>
<br>
<h1 align="center"><%= "Nomina"%></h1>
<% NominaDatos Datos=(NominaDatos) request.getAttribute("Datos");%>
<br>
<table class="table table-bordered" style="width: 85%; margin: auto">
    <thead>
        <tr class="thead-dark">
            <th colspan="4">Usuario</th>
            <th colspan="3">Descuentos</th>
            <th colspan="2">Ingresos</th>
        </tr>
        <tr class="thead-light">
            <th>Apellidos</th>
            <th>Nombres</th>
            <th>Documento</th>
            <th>Sueldo</th>
            <th>Arl</th>
            <th>Salud</th>
            <th>Pension</th>
            <th>Sub-Trsnporte</th>
            <th>Total</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><%= Datos.getApellido()%></td>
            <td><%= Datos.getNombre() %></td>
            <td><%= Datos.getDocumento()%></td>
            <td><%= Datos.getSueldo()%></td>
            <td><%= Datos.getArl() %></td>
            <td><%= Datos.getSalud()%></td>
            <td><%= Datos.getPension()%></td>
            <td><%= Datos.getSub()%></td>
            <td><%= Datos.getTotal()%></td>
        </tr>
    </tbody>

</table>

<br>
<a href="index.jsp" style="margin-left: 7.5%"><button class="btn btn-dark">Formulario</button></a>

</body>
</html>
