package juegoWordle;

import java.util.Random;
import java.util.Scanner;

	public class inicio {
		static Scanner entrada=new Scanner(System.in);
		static Random random= new Random();
		static String palabraSecreta="";
		static int numIntentosConsumidos;
		static int numLetrasAdivinadas; 
	
	public static void main(String[] args) {
		String palabrasAleatorias="";
		System.out.println("Bienvenidos al juego del  W o r d l e");
		
		System.out.println("El objetivo del juego es decubrir la palabra oculta de 5 letras");
		
		System.out.println("Introduce una palabra de 5 letras: ");
		String palabraIntroducida=entrada.nextLine();
		System.out.println(palabraIntroducida);
	}

		
		public static boolean haGanadoJugador() {
			return true;
		}
		public static boolean haTerminadoJuego(int intentos) {
			
		}
		public static String compruebaLetrasAcertadas(char letras ) {
			
			
		}
		public static String generaPalabra(String palabra) {
			
		}
	}
	
