package game_etapa01.entidades;

public class Monstro {
	
	private String nome;
	private int atk;
	private int def;
	private int num;
	
	private Jogador jogador;

	public Monstro() {
		this.atk = 0;
		this.def = 0;
		this.nome = "vazio";
		this.num = -1;
	}
	
	public void criarCarta(String nome, int atk, int def, int num/*, Jogador jogador*/){
		this.atk = atk;
		this.def = def;
		this.nome = nome;
		this.num = num;
		boolean confirm=this.validarCarta(num);
		
		if(confirm==false){
			this.atk = 0;
			this.def = 0;
			this.nome = "vazio";
			this.num = -1;
		}
	}
	
	private boolean validarCarta(int num){
		boolean confirm=false;
		if(num>0 && num<=50){
			confirm=true;
			
		}
		return confirm;
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
