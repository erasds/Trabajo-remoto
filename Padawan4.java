//no me coinciden los valores, o me salen números negativos y no se por qué

import java.util.Scanner;

public class Padawan4{
	
	public static void main( String[]args ) {
		int vInicial, alfa, longitudCanion, posXPantalla1, posYPantalla1;
		float xP, yP, tS, tV, xMax, hMax, t1, t2, t3, t4, posXMundo1, posYMundo1;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Teclee el angulo (grados): ");
		alfa = teclado.nextInt();
		System.out.print("Teclee velocidad (m/s): ");
		vInicial = teclado.nextInt();

		longitudCanion = 5;
		//como la posición del cañón es (0,0)
		//calculamos la posición del proyectil...
		xP = 0 + longitudCanion * (float)Math.cos(alfa);
		yP = 0 + longitudCanion * (float)Math.sin(alfa);
		tS = vInicial*(float)Math.sin(alfa)/(float)9.8; //9.8 = gravedad
		tV = tS*2;
		xMax = (float)Math.pow(vInicial,2)*(float)Math.sin(2*alfa)/(float)9.8;
		hMax = (float)Math.pow(vInicial,2)*(float)Math.pow((float)Math.sin(alfa),2)/(float)(2*9.8);
		System.out.print(" Pos. inicial del proyectil: (");
		System.out.printf("%1.2f", xP);
		System.out.print(", ");
		System.out.printf("%1.2f",yP);
		System.out.println(")");
		System.out.print(" Tiempo de subida: ");
		System.out.printf("%8.2f",tS);
		System.out.print(" segundos y de vuelo ");
		System.out.printf("%1.2f",tV);
		System.out.println(" segundos");
		System.out.print(" Max. altura: ");
		System.out.printf("%13.2f",hMax);
		System.out.println(" metros");
		System.out.print(" Max. distancia: ");
		System.out.printf("%10.2f",xMax);
		System.out.println(" metros");
		
		t1 = 0;
		t2 = (float)0.25 * tV;
		t3 = (float)0.50 * tV;
		t4 = (float)0.75 * tV;
		
				
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.println("| Tiempo      |   Posicion en el mundo    | Posicion en Pantalla |");
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.print("|");
			System.out.printf("%10.2f",t1);
		System.out.print("   |");
		System.out.print(" |");
		System.out.println("         |");
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.print("|");
			System.out.printf("%10.2f",t2);
		System.out.print("   |");
		System.out.print(" |");
		System.out.println("         |");
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.print("|");
			System.out.printf("%10.2f",t3);
		System.out.print("   |");
		System.out.print(" |");
		System.out.println("         |");
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.print("|");
			System.out.printf("%10.2f",t4);
		System.out.print("   |");
		System.out.print(" |");
		System.out.println("         |");
		System.out.println("+-------------+---------------------------+----------------------+");
		System.out.print("|");
			System.out.printf("%10.2f",tV);
		System.out.print("   |");
		System.out.print(" |");
		System.out.println("         |");
		System.out.println("+-------------+---------------------------+----------------------+");
	}
}