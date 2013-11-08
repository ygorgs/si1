package conversor;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String numero = "";
        Conversor conversor = new Conversor();
       
        do {
        	System.out.print("Digite um numero: ");
        	numero = entrada.nextLine();
		} while (!isNumber(numero));
        
        System.out.println(conversor.converte(Integer.parseInt(numero)));
        	
        
        
	}

	private static boolean isNumber(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		} catch (Exception e) {
			if (!numero.equals(""))
				System.err.println("Você deve informar um numero\n");
			return false;
		} 
	}
}
