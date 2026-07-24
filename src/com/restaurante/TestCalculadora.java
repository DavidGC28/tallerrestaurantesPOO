package com.restaurante;

public class TestCalculadora {

    public static void main(String[] args) {
        
        calculadora c1 = new calculadora();
        
        double r1; 
        r1 = c1.sumar(10, 5); 
        System.out.println("Resultado de la suma: " + r1);
        
        double r2; 
        r2 = c1.restar(10, 5);
        System.out.println("Resultado de la resta: " + r2);
        
        double r3; 
        r3 = c1.multiplicar(10, 5);
        System.out.println("Resultado de la multiplicación: " + r3);
        
        double r4; 
        r4 = c1.dividir(10, 3); 
        System.out.println("Resultado de la división: " + r4);
        
        double r5;
        r5 = c1.promediar(10, 8, 9);
        System.out.println("Resultado del promedio: " + r5);
        
        c1.mostrarResultado();  
        
    } 
} 