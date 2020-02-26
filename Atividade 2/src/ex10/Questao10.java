package ex10;
import javax.swing.*;

/*
 * Questao 10: [1.0 ponto] Escreva um programa que receba a idade de 
 * uma pessoa em anos e classifique esta pessoa de acordo com a seguinte regra:
 * Idade - Classificacao
 * 0 a 2 anos - Bebe
 * 3 a 11 anos - Crianca
 * 12 a 17 anos - Adolescente
 * 18 a 24 anos - Jovem
 * 25 a 59 anos - Adulto
 * 60 a 99 anos - Idoso
 * 100 anos ou mais - Anciao
 */

/*
 * @author nathalia
 */

 /*
 * Nathalia Felix da Rocha
 */

public class Questao10 {

	public static void main(String[] args) {

		String idade =JOptionPane.showInputDialog("Digite a sua idade"); //inserção da idade
		int x = Integer.parseInt(idade);
		
		//comparações para a verificação da classificação
		if(0 <= x && x <= 2){
			JOptionPane.showMessageDialog(null, "Classificação: Bebe");
		}
		else if (2 < x && x <= 11){
			JOptionPane.showMessageDialog(null, "Classificação: Criança");
		}
		else if (11 < x && x <= 17){
			JOptionPane.showMessageDialog(null, "Classificação: Adolescente");
		}
		else if (17 < x && x <= 24){
			JOptionPane.showMessageDialog(null, "Classificação: Jovem");
		}
		else if (24 < x && x <= 59){
			JOptionPane.showMessageDialog(null, "Classificação: Adulto");
		}
		else if (59 < x && x <= 99){
			JOptionPane.showMessageDialog(null, "Classificação: Idoso");
		}
		else {
			JOptionPane.showMessageDialog(null, "Classificação: Ansião");
		}
	}
}
