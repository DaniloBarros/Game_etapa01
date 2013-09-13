package game_etapa01.entidades;

import java.util.Random;

public class Rand {
	
	private static Random numero = new Random(System.currentTimeMillis());

	public Rand() {
		numero.nextInt();
	}
	
	public static int VarMonster(int max, int min){
		int num = numero.nextInt(max)+min;
		return num;
	}
	
	public static int VarSerie(){
		int num = numero.nextInt(80)+1;
		return num;
	}

}
