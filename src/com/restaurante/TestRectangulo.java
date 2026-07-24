package com.restaurante;

public class TestRectangulo {
    
    public static void main(String[] args) {
    
        Rectangulo r1 = new Rectangulo();
        
        r1.altura = 5;
        r1.base = 4;
        
        int resultadoArea;
        resultadoArea = r1.calcularArea();
        System.out.println("Resultado Área: " + resultadoArea);
        
       
        double resultadoPerimetro;
        resultadoPerimetro = r1.calcularPerimetro();
        System.out.println("Resultado Perímetro: " + resultadoPerimetro);
    }
}
