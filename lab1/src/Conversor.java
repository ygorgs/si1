package conversor;

public class Conversor {

	private String[] nomes1 = { "zero", "um", "dois", "tres", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
			"treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
			"dezenove" };
	private String[] nomes2 = {null, null, "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };
	private String[] nomes3 = { "cem", "cento", "duzentos", "trezentos",
			"quatrocentos", "quinhentos", "seiscentos", "setecentos",
			"oitocentos", "novecentos" };
	public Conversor() {

	}

	public String converte(int numero) {
		if (numero <= 19){
			return coverteMenorQue19(numero);	
		} else if (20 <= numero && numero <= 99) {
			return converteEntre20e99(numero);		
		} else if (100 <= numero && numero <= 999){
			return converteEntre100e999(numero);
		} else if (1000 <= numero && numero <= 1099){
			return converteEntre1000e1099(numero);
		} else if (1100<= numero && numero <=1999){
			return converteEntre1100e1999(numero);
		} else if (2000 <= numero && numero <= 9999){
			return converteEntre2000e9999(numero);
		} else if (10000 <= numero && numero <= 999999){
			return converteEntre10000e999999(numero);
		} else if (1000000 <= numero && numero <= 9999999){
			return converteEntre1000000e9999999(numero);
		} else
			return "um bilhao";
	}
		
		private String coverteMenorQue19(int numero){
			return nomes1[numero];
		}
		
		private String converteEntre20e99(int numero){
			StringBuilder nome = new StringBuilder();
			String n = Integer.toString(numero);
			String[] s = n.split("");
			nome.append(nomes2[Integer.parseInt(s[1])]);
			if (Integer.parseInt(s[2]) != 0) {
				nome.append(" e ");
				nome.append(nomes1[Integer.parseInt(s[2])]);
			}
			return nome.toString();
		}
		
		private String converteEntre100e999(int numero){
			StringBuilder nome = new StringBuilder();
			String n = Integer.toString(numero);
			if(n.equals("100"))
				return nomes3[0];
			String[] s = n.split("");
			nome.append(nomes3[Integer.parseInt(s[1])]);
			if(Integer.parseInt(s[2] + s[3]) == 0)
				return nome.toString();
			nome.append(" e ");
			nome.append(converte(Integer.parseInt(s[2] + s[3])));
			return nome.toString();
		}
		
		private String converteEntre1000e1099(int numero){
			StringBuilder nome = new StringBuilder();
			String n = Integer.toString(numero);
			if(n.equals("1000"))
				return "mil";
			String[] s = n.split("");
			nome.append("mil e ");
			nome.append(converte(Integer.parseInt(s[3] + s[4])));
			return nome.toString();
		}
		
		private String converteEntre1100e1999(int numero){
			StringBuilder nome = new StringBuilder();
			String n = Integer.toString(numero);
			if(n.equals("1100"))
				return "mil e cem";
			String[] s = n.split("");
			nome.append("mil");
			if(Integer.parseInt(s[3] + s[4]) == 0)
				nome.append(" e " + converte(Integer.parseInt(s[2] + s[3] + s[4])));
			else
				nome.append(" " + converte(Integer.parseInt(s[2] + s[3] + s[4])));
			return nome.toString();
		}
		
		private String converteEntre2000e9999(int numero){
			StringBuilder nome = new StringBuilder();
			String n = Integer.toString(numero);
			String[] s = n.split("");
			nome.append(converte(Integer.parseInt(s[1])) + " ");
			if(Integer.parseInt(s[2] + s[3] + s[4]) == 0)
				return nome.toString() + "mil";
			nome.append(converte(Integer.parseInt("1" + s[2] + s[3] + s[4])));
			return nome.toString();
		}
		
		private String converteEntre10000e999999(int numero){
			StringBuilder nome = new StringBuilder();
			StringBuilder parte1 = new StringBuilder();
			StringBuilder parte2 = new StringBuilder();
			int cont = 0;
			String n = Integer.toString(numero);
			String[] s = n.split("");
			for (int i = s.length - 1; i > 0; i--) {
				if(cont < 3)
					parte1.append(s[i]);
				else
					parte2.append(s[i]);
				cont++;
			}
			parte1.reverse();
			parte2.reverse();
			nome.append(converte(Integer.parseInt(parte2.toString())) +  " ");
			if(Integer.parseInt(parte1.toString()) == 0)
				nome.append("mil");
			else
				nome.append(converte(Integer.parseInt("1" + parte1.toString())));
			return nome.toString();
		}
		
		private String converteEntre1000000e9999999(int numero){
			StringBuilder nome = new StringBuilder();
			StringBuilder parte1 = new StringBuilder();
			StringBuilder parte2 = new StringBuilder();
			int cont = 0;
			String n = Integer.toString(numero);
			String[] s = n.split("");
			for (int i = s.length - 1; i > 0; i--) {
				if(cont < 6)
					parte1.append(s[i]);
				else
					parte2.append(s[i]);
				cont++;
			}
			parte1.reverse();
			parte2.reverse();
			if(Integer.parseInt(parte2.toString()) == 1)
				nome.append("um milhao ");
			else
				nome.append(converte(Integer.parseInt(parte2.toString())) + " milhoes ");
			if(Integer.parseInt(parte1.toString())!= 0)
				nome.append(converte(Integer.parseInt(parte1.toString())));
			return nome.toString();	
		}
}
