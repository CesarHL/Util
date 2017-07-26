package v2.util;

public class Util {

	public boolean espalindromo(String cadena) {
		boolean valor = true;
		int i, ind;
		String cadena2 = "";
		// quitamos los espacios
		for (int x = 0; x < cadena.length(); x++) {
			if (cadena.charAt(x) != ' ')
				cadena2 += cadena.charAt(x);
		}
		// volvemos a asignar variables
		cadena = cadena2;
		ind = cadena.length();
		// comparamos cadenas
		for (i = 0; i < (cadena.length()); i++) {
			if (cadena.substring(i, i + 1).equals(cadena.substring(ind - 1, ind)) == false) {
				// si una sola letra no corresponde no es un palindromo por tanto
				// sale del ciclo con valor false
				valor = false;
				break;
			}
			ind--;
		}
		return valor;
	}

	public static void main(String[] args) {
		Util objclass = new Util();
		if (objclass.espalindromo("la ruta nos aporto otro paso naturl")) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No Palindromo");
		}

	}

}
