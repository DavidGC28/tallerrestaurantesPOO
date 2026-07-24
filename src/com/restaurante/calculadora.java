package com.restaurante;

public class calculadora {
    
    public double sumar(int a, int b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }
    
    public double restar(int a, int b) {
        double resultado;
        resultado = a - b;
        return resultado;
    }
    
    public double multiplicar(int a, int b) {
        double resultado;
        resultado = a * b; 
        return resultado;
    }

    public double dividir(int a, int b) {
        double resultado;
        resultado = (double) a / b; 
        return resultado;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        double resultado;
        resultado = (valor1 + valor2 + valor3) / 3;
        return resultado;
    }
    
    public void mostrarResultado() {
        System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
    }
    
}