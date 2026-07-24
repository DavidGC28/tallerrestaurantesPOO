package com.restaurante;

public class TestCuadrado {

    public static void main(String[] args) {
        
    
        Cuadrado c1 = new Cuadrado();
        c1.lado = 4;
        
        System.out.println("========================= CUADRADO 1 =========================");
        System.out.println("Lado: " + c1.lado);
        System.out.println("Área (esperado 16.0): " + c1.calcularArea());
        System.out.println("Perímetro (esperado 16.0): " + c1.calcularPerimetro());
   
        Cuadrado c2 = new Cuadrado();
        c2.lado = 3;
        
        System.out.println("\n========================= CUADRADO 2 =========================");
        System.out.println("Lado: " + c2.lado);
        System.out.println("Área (esperado 9.0): " + c2.calcularArea());
        System.out.println("Perímetro (esperado 12.0): " + c2.calcularPerimetro());
        

        Cuadrado c3 = new Cuadrado();
        c3.lado = 5.5;
        
        System.out.println("\n========================= CUADRADO 3 =========================");
        System.out.println("Lado: " + c3.lado);
        System.out.println("Área (esperado 30.25): " + c3.calcularArea());
        System.out.println("Perímetro (esperado 22.0): " + c3.calcularPerimetro());
    }
}