
import java.util.Scanner;

public class Padawan3 {
	
	public static void main(String[] args) {
		String userName;
		String password;
		String validaClave = "";
		Scanner teclado = new Scanner( System.in );
		System.out.print( "Teclee nombre de usuario: " );
		userName = teclado.next();
		validaClave += ( userName.equals( "admin" ) ) ? "El usuario \"admin\" no se puede utilizar.\n" : "";
		
		char primeraLetra = userName.charAt(0);
		validaClave += ( primeraLetra >= '0' && primeraLetra <= '9' ) ? "El nombre de usuario debe comenzar por letra.\n" : "";
			
		System.out.print( "Teclee el password: " );
		password = teclado.next();
		
		password.length();
		validaClave += ( password.length() < 8 ) ? "Password debe tener un minimo de 8 caracteres.\n"  : "";
		
		password.toUpperCase();
		validaClave += ( password.equals( password.toUpperCase() ) ) ? "El password debe tener al menos una letra minuscula.\n" : "";
		
		password.toLowerCase();
		validaClave += ( password.equals( password.toLowerCase() ) ) ? "El password debe tener al menos una letra mayuscula.\n" : "";
		
		password.matches("._@");
		validaClave += ( password.matches(".*[._@]+.*") ) ? "" : "El password debe tener al menos un simbolo \"._@\".\n";
		
		System.out.println( validaClave );
	}




}
