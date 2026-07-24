package com.restaurante;

public class Cuadrado {
    
    public double lado;
    
    public double calcularArea() {
        double area = lado * lado; 
        return area; // <-- Faltaba esto
    }
    
    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
