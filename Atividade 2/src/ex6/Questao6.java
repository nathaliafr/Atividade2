package ex6;

import javax.swing.JOptionPane;

/*
 * Questao 6: [1.0 ponto] Escreva um programa que apresente um menu para o usuario selecionar 
 * uma das seguintes opcoes: Cumprimento, Elogio, Despedida. Apos o usuario escolher uma destas
 * opcoes, o programa deve apresentar na tela uma frase de acordo com a opcao escolhida. 
 * Exemplos: �Bom dia!�, �Voce esta de parabens!� e �Ate breve!�.

 */

/*
 * @author nathalia
 */

/*
 * Nathalia Felix da Rocha
 */



public class Questao6 {

	public static void main(String[] args) {

		String[] opcoes = {"Cumprimento", "Elogio", "Despedida"}; //op��es dos bot�es
		int opcao = JOptionPane.showOptionDialog(null, "Escolha a op��o que deseja",
		"t�tulo", JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		if(opcao == JOptionPane.YES_OPTION) { //primeira op��o imprime o comprimento
			JOptionPane.showMessageDialog(null, "Bom Dia!");
		} else if(opcao == JOptionPane.NO_OPTION) { //segunda op�ao que imprime o elogio
			JOptionPane.showMessageDialog(null, "Voc� est� de Parab�ns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) { //terceira op��o que imprime a despedida
			JOptionPane.showMessageDialog(null, "At� logo!");
		}

	}

}
