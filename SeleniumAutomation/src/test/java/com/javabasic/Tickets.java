package com.javabasic;

public class Tickets {
	
	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	
	/*****************************************************************  CONSTRUCTOR*/
	public Tickets (int precioNormal, int edadPersona,boolean credencialEstudiante) {
		
		precioAdulto= precioNormal;
		precioNino= precioNormal*(.85);
		precioEstudiante=precioNormal*(.50);
		costo = "Precio Normal";
		edad= edadPersona;
		estudiante= credencialEstudiante;
	}
	
	
	
	/*******************************************************************  METODOS*/
	
	public void costoDia() {
		System.out.println("El Costo Ticket " + costo);
		
	}
	
	public void precioAdulto() {
		System.out.println("El Costo Adulto " + precioAdulto);
		
	}

	public void precioNino() {
		System.out.println("El Costo Niño " + precioNino);
		
	}
	
	public void precioEstudiante() {
		System.out.println("El Costo Estudiante " + precioEstudiante);
		
	}
	
	public void verificarcostoticket() {
		
		if (estudiante == true) {
			System.out.println("Eres un estudiantes el costo de tu Ticket es: " + precioEstudiante);
		}else if (edad>18) {
			System.out.println("Eres un adulto el costo de tu Ticket es: " + precioAdulto);
			
		}else {
			
			System.out.println("Eres un niño el costo de tu Ticket es: " + precioNino);
		}
		
	}
	
	/**********************************************SOBRE CARGA */
	
	public double sumarTicket() {
		
		double suma = precioAdulto + precioNino;
		return suma;
	}
	
	public double sumarTickets(int descuento) {
		
		double suma = (precioAdulto + precioNino)- descuento ;
		System.out.println(suma);
		return suma;
	}
	
public double sumarTickets(int descuento, int descuentoExtra) {
		
		double suma = (precioAdulto + precioNino)- descuento - descuentoExtra;
		System.out.println(suma);
		return suma;
	}
	
	
	
	
	//EJERCICIO GENERAR OTRO CONSTRUCTOR CON ARGUMENTO "DESCUENTO" 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tickets tickets = new Tickets (100,19,true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		
		

	}

}
