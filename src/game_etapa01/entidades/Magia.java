package game_etapa01.entidades;

/* Só sera possível a implementação dessa classe
 *quando tivermos base em hierarquia, já que a
 *classe Magia é um agrupamento de cartas desse
 *tipo que possuem diferentes metodos e atributos. 
 */

public class Magia {
	
	private String nome;
	private int bonusatk;
	private int bonusdef;
	private int bonushp;
	private int num;
	
	private Jogador jogador;

	public Magia() {
		this.bonusatk = 0;
		this.bonusdef = 0;
		this.bonushp = 0;
		this.nome = "vazio";
	}
	
	public void criarCarta(){
		
	}
	
	private boolean validarCarta(int num){
		boolean confirm=false;
		if(num>60 && num<=80){
			confirm=true;
			
		}
		return confirm;
	}
	
 	public Jogador getJogador(){
		return jogador;
	}
	
	public void setJogador(Jogador jogador){
		this.jogador = jogador;
	}

	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num = num;
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
	 * @return the bonusatk
	 */
	public int getBonusatk() {
		return bonusatk;
	}

	/**
	 * @param bonusatk the bonusatk to set
	 */
	public void setBonusatk(int bonusatk) {
		this.bonusatk = bonusatk;
	}

	/**
	 * @return the bonusdef
	 */
	public int getBonusdef() {
		return bonusdef;
	}

	/**
	 * @param bonusdef the bonusdef to set
	 */
	public void setBonusdef(int bonusdef) {
		this.bonusdef = bonusdef;
	}

	/**
	 * @return the bonushp
	 */
	public int getBonushp() {
		return bonushp;
	}

	/**
	 * @param bonushp the bonushp to set
	 */
	public void setBonushp(int bonushp) {
		this.bonushp = bonushp;
	}
	
	

}
