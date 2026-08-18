package com.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		Restaurante res1=new Restaurante();
		Restaurante res2=new Restaurante();
		
		System.out.println("Restaurante 1-----");
		
		System.out.println("Nombre: "+res1.nombre);
		System.out.println("Direcccion: "+res1.direcccion);
		System.out.println("Calificacion: "+res1.calificacion);
		
		res1.nombre="KFC";
		res1.direcccion="Quito";
		res1.calificacion=9;
		
		System.out.println("Nombre: "+res1.nombre);
		System.out.println("Direcccion: "+res1.direcccion);
		System.out.println("Calificacion: "+res1.calificacion);
		
		System.out.println("Restaurante 2-----");
		
		System.out.println("Nombre: "+res2.nombre);
		System.out.println("Direcccion: "+res2.direcccion);
		System.out.println("Calificacion: "+res2.calificacion);
		
		res2.nombre="la mas rica";
		res2.direcccion="en donde esta construida";
		res2.calificacion=200;
		
		System.out.println("Nombre: "+res2.nombre);
		System.out.println("Direcccion: "+res2.direcccion);
		System.out.println("Calificacion: "+res2.calificacion);

	}

}
