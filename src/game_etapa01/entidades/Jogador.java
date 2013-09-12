package game_etapa01.entidades;

public class Jogador {
	private String nome;
	private int hp;

	public Jogador(String nome) {
		this.hp = 2000;
		this.nome = nome;
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
	
	private void jogarCarta(){
		/**/
		
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
