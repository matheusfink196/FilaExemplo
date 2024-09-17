package model;

public class Fila {
	No inicio;
	No fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) {
			inicio = elemento;
			fim = inicio;
		} else {
			fim.proximo = elemento;
			fim = elemento;
		}

	}

	public int remove() {
		if (isEmpty()) {
			new Exception("Não há elemntos na fila");
		}
		int valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;

		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}
	public void list() {
		if(isEmpty()) {
			new Exception("Não há elementos na fila");
		}
		No auxiliar = inicio;
		while(auxiliar != null) {
			System.out.print(auxiliar.dado);
			System.out.print(" ");
			auxiliar = auxiliar.proximo;
			
		}
	}
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No auxiliar = inicio;
			while (auxiliar != null) {
				cont = cont +1;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

}
