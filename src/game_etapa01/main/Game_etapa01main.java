package game_etapa01.main;

import java.util.Scanner;
import game_etapa01.entidades.Jogador;
import game_etapa01.entidades.Monstro;
import game_etapa01.entidades.Rand;

public class Game_etapa01main {
	
	//Criando um Scanner
	private static Scanner input;

	public Game_etapa01main() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inicialização das Variaveis
		input = new Scanner(System.in);
		
		String nome = "vazio";
		String nomeCarta = "vazio";
		String opcao="n";
		String nao="n";
		int atk, def;
		
		//Criando e instaciando um vetor de objetos da classe Jogador
		Jogador[] jogador = new Jogador[2];
		
		
		for(int i=0; i<jogador.length;i++){
			do{
				jogador[i]=new Jogador();
				
				System.out.println("Digite o nome no Jogador"+(i+1)+ ": ");
		
				nome = input.next();
				
				jogador[i].setNome(nome);
		
				nome = jogador[i].getNome();
		
				System.out.println("Jogador "+(i+1)+": "+ nome +"\nOk? (s/n)");
				opcao = input.next();
				
			}while(opcao.equals(nao));
		}
		
		Monstro[] monster = new Monstro[50];
		
		for(int i=0;i<monster.length;i++){
		monster[i] = new Monstro();
		monster[i].criarCarta("Esqueleto", Rand.VarMonster(5,1), Rand.VarMonster(2, 1), i);
		monster[i].setJogador(jogador[0]);
		
		}
		
		nomeCarta=monster[0].getNome();
		atk=monster[0].getAtk();
		def=monster[0].getDef();
		System.out.println("\nNome monstro: "+nomeCarta +"\nAtaque: " +atk +"\nDefesa: "+def);
		System.out.println("Carta de "+monster[0].getJogador().getNome());

	}

}
