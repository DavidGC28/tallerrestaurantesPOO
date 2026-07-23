package com.restaurante;



public class RestauranteTest {
	
public static void main(String[] args) {
	
	System.out.println("========================= RESTAURANTE 1 ==========================");
		
	Restaurante rest1 = new Restaurante();
	
	rest1.nombre ="Bento593";
	rest1.direccion="Miller y Cestaris";
	rest1.calificacion = 4.5;
	
	
	System.out.println("NOMBRE: " + rest1.nombre);
	System.out.println("DIRECCION: " + rest1.direccion);
	System.out.println("CALIFICACION: " + rest1.calificacion);

	System.out.println("========================= RESTAURANTE 2 ==========================");
	
	
	Restaurante rest2 = new Restaurante();
	
	rest2.nombre ="LAS PODEROSAS";
	rest2.direccion="OLLEARY Y MILLER";
	rest2.calificacion = 4.1;
	
	
	System.out.println("NOMBRE: " + rest2.nombre);
	System.out.println("DIRECCION: " + rest2.direccion);
	System.out.println("CALIFICACION: " + rest2.calificacion);
}
}
