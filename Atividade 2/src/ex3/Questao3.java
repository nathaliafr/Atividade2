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

		String variavel = JOptionPane.showInputDialog("Entre com o primeiro numero"); //Entrada do primeiro n�mero
		float num1 = Float.parseFloat(variavel);
		String variavel2 = JOptionPane.showInputDialog("Entre com o primeiro numero"); //Entrada do segundo n�mero
		float num2 = Float.parseFloat(variavel2);
		
		float soma = num1+num2; //soma dos dois n�meros
		float prod = num1*num2; //multiplica��o dos dois n�meros
		float dif = num1-num2; //divis�ao entre os dois numeros
		float raz = num1/num2; //raz�ao entre os dois n�meros
		

		//apresenta��o do resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "A valores digitados foram: " + variavel + " e " + variavel2 +
				"\nA soma dos valores digitados �: " + soma + "\nA diferen�a dos valores digitados �: " + dif
				 + "\nO produto dos valores digitados �: " + prod + "\nA razao dos valores digitados �: " + raz);
		
	}

}
