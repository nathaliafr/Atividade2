package ex7;

import javax.swing.JOptionPane;

/*
 * Questao 7: [1.0 ponto] Altere o programa anterior para acrescentar a opcao Sair. 
 * Enquanto o usuario nao selecionar a opcao Sair, o programa deve permanecer apresentando 
 * o menu e a frase selecionada.
 */

/*
 * @author nathalia
 */


/*
 * Nathalia Felix da Rocha
 */


public class Questao7 {

	public static void main(String[] args) {
		
		String[] opcoes = {"Cumprimento", "Elogio", "Despedida", "Sair"}; //opções dos botões
		int opcao = JOptionPane.showOptionDialog(null, "Escolha a opção que deseja",
		"título", JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		if(opcao == JOptionPane.YES_OPTION) { //primeira opção imprime o comprimento
			JOptionPane.showMessageDialog(null, "Bom Dia!");
		} else if(opcao == JOptionPane.NO_OPTION) { //segunda opçao que imprime o elogio
			JOptionPane.showMessageDialog(null, "Você está de Parabéns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) { //terceira opção que imprime a despedida
			JOptionPane.showMessageDialog(null, "Até logo!");
		} else if(opcao == JOptionPane.CANCEL_OPTION+1) { //terceira opção que imprime que esta saindo
			JOptionPane.showMessageDialog(null, "saindo...");
		}
		
	}

}
