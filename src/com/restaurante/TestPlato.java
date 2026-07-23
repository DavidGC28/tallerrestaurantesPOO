package com.restaurante;

public class TestPlato {
	
	public static void main(String[] args) {
		
		System.out.println("========================= PLATO 1 ==========================");
			
		Plato p1 = new Plato();
		
		p1.nombre ="Alitas x6";
		p1.tipo="Fuerte";
		p1.precio = 4.50;
		p1.disponible = true;
		
		
		System.out.println("NOMBRE: " + p1.nombre);
		System.out.println("TIPO: " + p1.tipo);
		System.out.println("PRECIO: " + p1.precio);
		System.out.println("DISPONIBLE: " + p1.disponible);
		
		System.out.println("========================= PLATO 2 ==========================");
		
		Plato p2 = new Plato();
		
		p2.nombre ="Mini tacos";
		p2.tipo="Entrante";
		p2.precio = 2.50;
		p2.disponible = true;
		
		
		System.out.println("NOMBRE: " + p2.nombre);
		System.out.println("TIPO: " + p2.tipo);
		System.out.println("PRECIO: " + p2.precio);
		System.out.println("DISPONIBLE: " + p2.disponible);
		
		
		
		System.out.println("========================= PLATO 3 ==========================");
		
		Plato p3 = new Plato();
		
		p3.nombre ="Tiramisu";
		p3.tipo="Postre";
		p3.precio = 3;
		p3.disponible = true;
		
		
		System.out.println("NOMBRE: " + p3.nombre);
		System.out.println("TIPO: " + p3.tipo);
		System.out.println("PRECIO: " + p3.precio);
		System.out.println("DISPONIBLE: " + p3.disponible);

	}
}