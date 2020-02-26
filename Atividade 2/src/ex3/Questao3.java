package ex3;

import javax.swing.JOptionPane;

/*Questao 3: [1.0 ponto] Escreva um programa que receba dois numeros e calcule sua soma,
 *  sua diferenca, seu produto e sua razao.
*/

/*
 * Nathalia Felix da Rocha
 */

public class Questao3 {

	public static void main(String[] args) {

		String variavel = JOptionPane.showInputDialog("Entre com o primeiro numero"); //Entrada do primeiro número
		float num1 = Float.parseFloat(variavel);
		String variavel2 = JOptionPane.showInputDialog("Entre com o primeiro numero"); //Entrada do segundo número
		float num2 = Float.parseFloat(variavel2);
		
		float soma = num1+num2; //soma dos dois números
		float prod = num1*num2; //multiplicação dos dois números
		float dif = num1-num2; //divisçao entre os dois numeros
		float raz = num1/num2; //razçao entre os dois números
		

		//apresentação do resultado para o usuário
		JOptionPane.showMessageDialog(null, "A valores digitados foram: " + variavel + " e " + variavel2 +
				"\nA soma dos valores digitados é: " + soma + "\nA diferença dos valores digitados é: " + dif
				 + "\nO produto dos valores digitados é: " + prod + "\nA razao dos valores digitados é: " + raz);
		
	}

}
