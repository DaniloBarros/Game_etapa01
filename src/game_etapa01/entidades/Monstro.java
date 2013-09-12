package game_etapa01.entidades;

public class Monstro {
	
	private String nome;
	private int atk;
	private int def;

	public Monstro(String nome, int atk, int def) {
		this.atk = atk;
		this.def = def;
		this.nome = nome;
	}
	
	private boolean atacar(int atk1, int def2){
		boolean sucess= false;
		if(atk1>def2){
			sucess=true;
		}
		return sucess;
	}
	
	private boolean defender(int def1, int atk2){
		boolean sucess=false;
		if(def1>atk2){
			sucess=true;
		}
		return sucess;
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
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}
	
	

}
