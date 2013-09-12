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

	public Magia(String nome, int atk, int def, int hp) {
		this.bonusatk = atk;
		this.bonusdef = def;
		this.bonushp = hp;
		this.nome = nome;
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
