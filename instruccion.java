package inicio;

import java.util.Scanner;

public class instruccion {
	
			static Scanner in = new Scanner(System.in); 
			static char[] tablero = new char[9]; 
			public static void main(String[] args) {
				char jugador1='x';
				char jugador2='o';
				for(int i= 0; i<8; i++) {
					tablero[i]= ' ';
				}
				System.out.println("1. Jugar una partida\n2. Mostrar estadística \n3. Salir\nSeleccione una opción: ");
				int opcion=in.nextInt();
				dibujaTablero();
				switch (opcion) {
				case 1: 
					System.out.println("Introduzca movimiento (jugador 1 = x )");
					iniciar();	
					
				
				int movimiento1=in.nextInt();	
				
				
				mueveJugador1(movimiento1);
				break;
				case 2:
					
				}
				
			}
			public static void mueveJugador1(int pos) {
			//el jugador 1 pone una ficha en una posición válida (entre 0 y 8, además está vacía) 
				for(int i=0;i<8; i++) {	
					if(tablero [i]==0) {
						tablero[i]=pos;
						
						
					
					}
				
				}
			}	
			
			public static void mueveJugador2(int pos) {
				System.out.println("Moviendo ficha...");
			}
			
			public static boolean movimientoValido(int pos) {
			//se comprueba que el moviento es válido antes de poner la ficha (entre 0 y 8, además está vacía). 
				boolean movimiento=false;
				 if(pos >9 || pos <1) {
					 return false;
				 }
				 if(tablero[pos-1] == ' ') {
					 return true;
				 }
				 return false;
			}
			
			public static void iniciar() {
			//pone el tablero vacío (0).
				System.out.println("-------------");
				System.out.println("|   |   |   |");
				System.out.println("-------------");
				System.out.println("|   |   |   |");
				System.out.println("-------------");
				System.out.println("|   |   |   |");
				System.out.println("-------------");
			}
			 
			public static boolean quedanCasillas() {
			//comprueba si ya están ocupadas todas las posiciones del tablero. 
				boolean ocupadas=false;
				if(ocupadas) {
					
				}
			}
			
			public static void dibujaTablero() {
			//dibuja el tablero tal y como aparece en el ejemplo de partida. 
				System.out.println("-------------");
				System.out.println("| 1 | 2 | 3 |");
				System.out.println("-------------");
				System.out.println("| 4 | 5 | 6 |");
				System.out.println("-------------");
				System.out.println("| 7 | 8 | 9 |");
				System.out.println("-------------");
				
			}
			
			public static boolean ganaJugador1() {
			//comprueba si el jugador 1 tiene tres fichas en raya, ganando la partida. 
				boolean ganador=false;
				if(tablero[0]=='x'&& tablero[1]=='x'&& tablero[2]=='x') {
					return true;
				}
				if(tablero[3]=='x'&& tablero[4]=='x'&& tablero[5]=='x') {
					return true;
				}
				if(tablero[6]=='x'&& tablero[7]=='x'&& tablero[8]=='x') {
					return true;
				}
				if(tablero[0]=='x'&& tablero[4]=='x'&& tablero[8]=='x') {
					return true;
				}
				if(tablero[2]=='x'&& tablero[4]=='x'&& tablero[6]=='x') {
					return true;
				}
				if(tablero[0]=='x'&& tablero[3]=='x'&& tablero[6]=='x') {
					return true;
				}
				if(tablero[1]=='x'&& tablero[4]=='x'&& tablero[7]=='x') {
					return true;
				}
				if(tablero[2]=='x'&& tablero[5]=='x'&& tablero[8]=='x') {
					return true;
				}
				return false;
			
			}
			public static boolean ganaJugador2() {
				boolean ganador=false;
				if(tablero[0]=='o'&& tablero[1]=='o'&& tablero[2]=='o') {
					return true;
				}
				if(tablero[3]=='o'&& tablero[4]=='o'&& tablero[5]=='o') {
					return true;
				}
				if(tablero[6]=='o'&& tablero[7]=='o'&& tablero[8]=='o') {
					return true;
				}
				if(tablero[0]=='o'&& tablero[4]=='o'&& tablero[8]=='o') {
					return true;
				}
				if(tablero[2]=='o'&& tablero[4]=='o'&& tablero[6]=='o') {
					return true;
				}
				if(tablero[0]=='o'&& tablero[3]=='o'&& tablero[6]=='o') {
					return true;
				}
				if(tablero[1]=='o'&& tablero[4]=='o'&& tablero[7]=='o') {
					return true;
				}
				if(tablero[2]=='o'&& tablero[5]=='o'&& tablero[8]=='o') {
					return true;
				}
				return false;
			}
			
}
		