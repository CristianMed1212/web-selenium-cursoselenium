package com.javabasic;

public class Datatypes {

	public Datatypes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x;
		short y;
		int z;
		long a;
		
		x = 127;
		y= 32767;
		z= 2147483647;
		a = 9223372036854775807L;
				
		System.out.println("byte =" + x + " Short =" + y + " int = " + z + " Long =" + a);
		
		float base;
		double altura;
		
		base =30.5F ;
		altura = 40.76 ;
		
		System.out.println ("Float = " + base + " double ="+ altura);
		
		char letra1;
		char letra2;
		String frase;
		
		letra1 = 'a';
		letra2 = 'g';
		frase = "Hola";
		
		System.out.println ("Frase"+ frase+ " Letra 1 es =" + letra1 + "Letra 2 es = "+ letra2);
		
	}

}
