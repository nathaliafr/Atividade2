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
		
		String[] opcoes = {"Cumprimento", "Elogio", "Despedida", "Sair"}; //op��es dos bot�es
		int opcao = JOptionPane.showOptionDialog(null, "Escolha a op��o que deseja",
		"t�tulo", JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		if(opcao == JOptionPane.YES_OPTION) { //primeira op��o imprime o comprimento
			JOptionPane.showMessageDialog(null, "Bom Dia!");
		} else if(opcao == JOptionPane.NO_OPTION) { //segunda op�ao que imprime o elogio
			JOptionPane.showMessageDialog(null, "Voc� est� de Parab�ns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) { //terceira op��o que imprime a despedida
			JOptionPane.showMessageDialog(null, "At� logo!");
		} else if(opcao == JOptionPane.CANCEL_OPTION+1) { //terceira op��o que imprime que esta saindo
			JOptionPane.showMessageDialog(null, "saindo...");
		}
		
	}

}
