package com.calidadDelSoftware.practica4;

import java.util.Scanner;

public class App 
{
	private int lados = 0;
	private String area = "No hay cálculo definido";
	
	public App(int lados, String area) {
		System.out.println("Poligono creado");
		this.lados = lados;
		this.area = area;
	}

	public int getLados() {
		if(lados == 3)
			System.out.println("El triángulo tiene "+lados+" lados.");
		else if (lados == 4)
			System.out.println("El cuadrado o el rectángulo tiene "+lados+" lados.");
		else
			System.out.println("El polígono tiene "+lados+" lados.");
		
		return lados;
	}
	
	public String getArea() {
		if(area.equals("(BASE x ALTURA) / 2"))
			System.out.println("El área del triángulo es (BASE x ALTURA) / 2.");
		else if (area.equals("BASE x ALTURA"))
			System.out.println("El área del cuadrado o del rectángulo es BASE x ALTURA.");
		else
			System.out.println("Área desconocida.");
		
		return area;
	}
	
	public static void main(String[] args) {
		
		for(;;)
		{		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca un número de lados para el polígono: ");
			
			int lados = sc.nextInt();
			
			String area = "No hay cálculo definido";
			
			if(lados == 3) 
				area = "(BASE x ALTURA) / 2";
			else if (lados == 4)
				area = "BASE x ALTURA";
			
			if(lados > 2)
			{
				App poligono = new App(lados, area);
				
				poligono.getLados();
				poligono.getArea();
					
				break;
			} else
			{
				System.out.println("El numero de lados del poligono debe ser mayor de 2");
			}
		}

	}
}
