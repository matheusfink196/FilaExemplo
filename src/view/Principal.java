package view;
import model.Fila;

public class Principal {
	
	public static void main(String [] arg) throws Exception {
		Fila fila = new Fila();
		int[] vetor = {36,28,146,14,-65,117,-40,24,138,116};
		int contpar = 0; int contimpar = 0; int contneg = 0;
		
		
		for (int valor: vetor) {
			if (fila.isEmpty()) {
				if(valor<0) {
					contneg = contneg+1;
				} else if(valor%2==0) {
					contpar = contpar+1;
				} else {
					contimpar = contimpar+1;
				}
				fila.insert(valor*10);
			} else if (valor>=0) {
				fila.insert(valor+10);
			} else if (valor<0) {
				int auxiliar = fila.remove();
				System.out.println(auxiliar);
				fila.insert(valor);
			}
		}
		
		System.out.println("Tamanho da fila " + fila.size());

	}

}
