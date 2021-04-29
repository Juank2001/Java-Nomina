package com.edu.sena.Nomina.Controller;

import com.edu.sena.Nomina.Model.NominaDatos;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "nominaServlet", value = "/nomina-servlet")
public class Nomina extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        NominaDatos Datos = new NominaDatos();

        int Riesgo = 0;
        boolean Contrato = false;
        int Salud = 0;
        int Sueldo = 0;
        int Pension = 0;
        int Arl = 0;

        String nombre = request.getParameter("nombres");
        String apellido = request.getParameter("apellidos");
        String documento = request.getParameter("documento");
        String dtrabajados = request.getParameter("dtrab");
        String sueldo = request.getParameter("sueldo");

        Datos.CalculaNomina(Integer.parseInt(sueldo), Integer.parseInt(dtrabajados));
        Datos.setNombre(nombre);
        Datos.setApellido(apellido);
        Datos.setDocumento(Integer.parseInt(documento));

        request.setAttribute("Datos", Datos);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);

    }
}
