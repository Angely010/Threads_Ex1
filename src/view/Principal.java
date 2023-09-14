package view;

import controller.ThreadImprimeNumero;

public class Principal {
public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Thread threadImprimeNum = new ThreadImprimeNumero();
			threadImprimeNum.start();
		}
		
	}


}
