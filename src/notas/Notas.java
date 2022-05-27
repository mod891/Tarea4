package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
califica();
}

/**
 * @deprecated Use {@link #califica()} instead
 */
public static void cali() {
	califica();
}

public static void califica() {
	Scanner reader = new Scanner(System.in);// Para pedir números por teclado
	int n = 0;
	String mensaje = "";
	System.out.print("Introduzca una nota: ");
	n = reader.nextInt();
	
	if (n >= 0 && n < 5)
	mensaje = "Suspenso";
	else if (n >= 5 && n < 7)
	mensaje = "Aprobado";
	else if (n >= 7 && n <9)
	mensaje = "Notable";
	else if (n >= 9 && n <= 10)
	mensaje = "Sobresaliente";
	else
	mensaje = "La nota introducida no es correcta";
	
	System.out.println(mensaje);
	reader.close();
}
}