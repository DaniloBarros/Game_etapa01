package game_etapa01.main;

import java.util.Scanner;
import game_etapa01.entidades.Jogador;

public class Game_etapa01main {
	
	private static Scanner input;

	public Game_etapa01main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String nome = "vazio";
		String opcao;
		String sim = "s";
		
		do{
		System.out.println("Digite o nome no Jogador 1: ");
		
		nome = input.next();
		
		Jogador jogador01 = new Jogador(nome);
		
		nome = jogador01.getNome();
		
		System.out.println("Jogador 1: "+ nome +"\nOk? (s/n)");
		opcao = input.next();
		}while(opcao!=sim);

	}

}
