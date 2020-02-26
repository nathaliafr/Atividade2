package ex9;
import javax.swing.*;

/*
 * Questao 9: [2.0 pontos] Escreva um programa que peca numeros ao usuario ate 
 * que o usuario insira o numero 0. O programa deve, entao, apresentar a soma de 
 * todos os numeros inseridos antes do 0.
 */

/*
 * Nathalia Felix da Rocha
 */

public class Questao9 {

	public static void main(String[] args) {

		int x1;
		int x = 0;
		 do{ //realizar enquanto a entrada for diferente de 0
			 String idade1 =JOptionPane.showInputDialog("Digite um número"); //solicitação da entrada do numero
			  x1 = Integer.parseInt(idade1);//transformando string em inteiro
			  x += x1; //realização da soma
	        }while(x1 != 0);
		 JOptionPane.showMessageDialog(null, "A soma dos números foram: " + x); //imprime a soma para o usuário
	}
	
}
