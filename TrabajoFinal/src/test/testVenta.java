package test;

import computadoras.*;

public class testVenta {
	public static void main(String[] args) {
		
		Monitores monitor= new Monitores("HP",13);
		Teclado teclado= new Teclado("bluetooth","hp");
		Mouse mouse= new Mouse("bluetooth","hp");
		Computadoras computadora= new Computadoras("Computadora HP",monitor,teclado,mouse);
		
				
		Monitores monitor1= new Monitores("gamer",15);
		Teclado teclado1= new Teclado("bluetooth","gamer");
		Mouse mouse1= new Mouse("bluetooth","gamer");
		Computadoras computadora1= new Computadoras("Computadora HP",monitor1,teclado1,mouse1);
		
		Orden orden= new Orden();
		orden.agregarComputadoras(computadora);
		orden.mostrar();
		
		Orden orden1= new Orden();
		orden1.agregarComputadoras(computadora1);
		orden1.mostrar();
	}
}
