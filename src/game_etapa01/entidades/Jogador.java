package game_etapa01.entidades;

import game_etapa01.entidades.Monstro;

public class Jogador {
	private String nome;
	private int hp;
	
	private Monstro[] cartaMonstro={};
	private Terreno[] cartaTerreno={};
	private Magia[] cartaMagia={};

	public Jogador() {
		this.hp = 2000;
		this.nome = "vazio";
	}
	
	private boolean virarCarta(boolean estado){
		//true = modo neutro(carta na vertical)
		//false = modo defensivo/ofensivo(carta na horizontal)
		if(estado==true){
			estado=false;
		}else estado=true;
		
		return estado;
	}
	
	private void invocarCarta(int numero){
		/*carta_mao - carta.numero
		tabuleiro + carta.numero
		*/
	}
	
	private void desistir(){
		this.hp = 0;
		
	}
	
	private void comprarCarta(){
		/*carta_mao + carta.aleatoria
		*/
		
	}
	
	private void descartar(){
		/*carta_mao - carta.numero*/
		
	}
	
		
	public Monstro[] getCartaMonstro(){
		return cartaMonstro;
	}
	
	public void setCartaMonstro(Monstro[] cartaMonstro){
		this.cartaMonstro = cartaMonstro;
	}

	public Terreno[] getCartaTerreno(){
		return cartaTerreno;
	}
	
	public void setCartaTerreno(Terreno[] cartaTerreno){
		this.cartaTerreno = cartaTerreno;
	}
	
	public Magia[] getCartaMagia(){
		return cartaMagia;
	}
	
	public void setCartaMagia(Magia[] cartaMagia){
		this.cartaMagia = cartaMagia;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
