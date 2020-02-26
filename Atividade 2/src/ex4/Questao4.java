package ex4;

import javax.swing.*;

/*Questao 4: [1.5 pontos] Escreva um programa que receba dois numeros 
 * e os apresente em ordem crescente (o menor primeiro e depois o maior).
*/

/*
 * Nathalia Felix da Rocha
 */

public class Questao4 {

	public static void main(String[] args) {
		
		String variavel = JOptionPane.showInputDialog("Entre com o primeiro numero");//Entrada do primeiro número
		int num1 = Integer.parseInt(variavel);
		String variavel2 = JOptionPane.showInputDialog("Entre com o primeiro numero");//Entrada do segundo número
		int num2 = Integer.parseInt(variavel2);
		//verifica se o primeiro numero é maior que o segundo
		if(num1>num2) {
			//se verdadeiro mostra o numero 2 primeiro
			JOptionPane.showMessageDialog(null, "Os valores digitaados em ordem crescente é: " + num2 + " " + num1);
		}else {
			//caso contrario apresenta o numero 1 primeiro
			JOptionPane.showMessageDialog(null, "Os valores digitaados em ordem crescente é: " + num1 + " " + num2);
		}
		
		
	}

}
