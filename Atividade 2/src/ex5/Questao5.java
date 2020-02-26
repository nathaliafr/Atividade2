package ex5;

import javax.swing.JOptionPane;

/*Questao 5: [1.5 ponto] Escreva um programa que receba do usuario as sete ultimas cotacoes do dolar e, em seguida, 
 * calcule a media da cotacao do dolar na ultima semana. Utilize a media aritmetica
 * (soma de todos os valores, dividida pela quantidade de valores).
*/

/*
 * Nathalia Felix da Rocha
 */

public class Questao5 {

	public static void main(String[] args) {
		
		float soma = 0;
		float media;
		//loop para solicitar a entrada do valor das 7 ultimas cotações do dolar
		for (int i = 0; i < 7; i++) {
			String variavel = JOptionPane.showInputDialog("Entre com o com valor da cotação do dólar");
			float num1 = Float.parseFloat(variavel);
			//realiza a soma na medida que o valor é inserido
			soma += num1;
		}
		//realiza o calculo da média
		media = soma/7;
		
		JOptionPane.showMessageDialog(null, media); //resultado é apresentado ao usuário

	}

}
