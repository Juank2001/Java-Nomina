package com.edu.sena.Nomina.Model;

public class NominaDatos {
    private int riesgo = 0;
    private boolean contrato = false;
    private int dt;
    private double sueldo;
    private double arl;
    private double sub = 106454;
    private double salud;
    private double pension;
    private double total;
    private double sueldoTotal;



    private String nombre;
    private String apellido;
    private int documento;





    public void CalculaNomina( int Sueldo, int dtr){
        this.CalculaSueldo(Sueldo, dtr);
        this.dt = dtr;
        this.CalculaArl();
        //this.CalcularSub();
        this.CalcularSalud();
        this.CalcularPension();
        this.Total();
        this.total = this.total + this.sub;
    }

    private void Total(){
        this.total = this.sueldo - this.salud - this.pension;
    }

    private void CalcularPension(){
        double porcent = 0;
        if(contrato == true){
            porcent = 4;
        }else{
            porcent = 16;
        }
        this.pension = this.CalculaPorcent(porcent);
    };

    private void CalcularSalud(){
        double porcent = 0;
        if(contrato == true){
            porcent = 4;
        }{
            porcent = 12.5;
        }
        this.salud = this.CalculaPorcent(porcent);
    }

    private void CalcularSub(){
        this.sub = this.sueldo - 106.454;
    }

    private void CalculaArl(){
        double porcent = 0;
        if(riesgo == 1){
            porcent = 0.522;
        }else if(riesgo == 2){
            porcent = 1.044;
        }else if(riesgo == 3){
            porcent = 2.436;
        }else if(riesgo == 4){
            porcent = 4.350;
        }else if(riesgo == 5){
            porcent = 6.960;
        }

        this.arl = this.CalculaPorcent(porcent);
    }

    private void CalculaSueldo(int valor, int cdias){
        this.sueldo = valor * cdias;
    }

    private double CalculaPorcent(double porcent){
        return this.sueldo*porcent/100;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setApellido(String Apellido){
        this.apellido = Apellido;
    }

    public void setDocumento(int Documento){
        this.documento = Documento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getDocumento(){
        return this.documento;
    }

    public double getArl(){
        return this.arl;
    }

    public double getSalud(){
        return this.salud;
    }

    public double getPension(){
        return this.pension;
    }

    public double getTotal(){
        return this.total;
    }

    public double getSub() {
        return sub;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public double getSueldoTotal(){
        return this.sueldoTotal;
    }
}
