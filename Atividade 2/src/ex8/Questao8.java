package ex8;

import javax.swing.JOptionPane;

/*
 * Questao 8: [1.0 ponto] Escreva um programa que receba 10 numeros e calcule a soma destes numeros.
 */

/*
 * Nathalia Felix da Rocha
 */

public class Questao8 {

	public static void main(String[] args) {

		float soma = 0;
		//laço para a solucitação de entrada de 10 numeros
		for (int i = 0; i < 10; i++) {
			String variavel = JOptionPane.showInputDialog("Entre com o primeiro numero"); //Entrada do primeiro número
			float num1 = Float.parseFloat(variavel);
			soma += num1; //realiza a soma a medida que os numeros sao inseridos
		}
		
		JOptionPane.showMessageDialog(null, "A soma entre os números são: " + soma); //apresenta a soma para o usuário.

	}

}
