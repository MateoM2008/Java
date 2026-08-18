package com.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		Plato p1=new Plato();
		Plato p2=new Plato();
		Plato p3=new Plato();
		
		System.out.println("Plato A-----");
		
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("tipo: "+p1.tipo);
		System.out.println("precio: "+p1.precio);
		System.out.println("disponible: "+p1.disponible);
		
		p1.nombre="haburgesa";
		p1.tipo="simple";
		p1.precio=3.5;
		p1.disponible=true;
		
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("tipo: "+p1.tipo);
		System.out.println("precio: "+p1.precio);
		System.out.println("disponible: "+p1.disponible);
		
		
		System.out.println("Plato B-----");
		
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("tipo: "+p2.tipo);
		System.out.println("precio: "+p2.precio);
		System.out.println("disponible: "+p2.disponible);

		
		p2.nombre="ensalada";
		p2.tipo="Verduras";
		p2.precio=2.5;
		p2.disponible=false;
		
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("tipo: "+p2.tipo);
		System.out.println("precio: "+p2.precio);
		System.out.println("disponible: "+p2.disponible);

		System.out.println("Plato c-----");
		
		System.out.println("Nombre: "+p3.nombre);
		System.out.println("tipo: "+p3.tipo);
		System.out.println("precio: "+p3.precio);
		System.out.println("disponible: "+p3.disponible);
		
		p3.nombre="carne";
		p3.tipo="compuesta";
		p3.precio=1000;
		p3.disponible=true;
		
		System.out.println("Nombre: "+p3.nombre);
		System.out.println("tipo: "+p3.tipo);
		System.out.println("precio: "+p3.precio);
		System.out.println("disponible: "+p3.disponible);

	}

}
