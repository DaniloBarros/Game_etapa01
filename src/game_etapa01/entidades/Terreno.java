package game_etapa01.entidades;

public class Terreno {
	private int mana;
	private int num;
	
	private Jogador jogador;
	

	public Terreno() {
		int mana=0;
		int num=-1;
	}
	
	private boolean validarCarta(int num){
		boolean confirm=false;
		if(num>50 && num<=60){
			confirm=true;
			
		}
		return confirm;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num=num;
	}

	/**
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	

}
