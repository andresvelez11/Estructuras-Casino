package Casino;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Juego {
	private static int rondas;
	
	public static void mostrarReglas() {
		
	}
	
	public static int[] tirarDados() {
		int a[] = {(int) (Math.random() * 6) + 1, (int) (Math.random() * 6) + 1};
		return a;
	}
	
	public static float jugar(float dineroApostado, int sumasApuesta[]) {//Devuelve lo que gana el jugador
		rondas++;
		float totalGanado=0;
		int dados[];
		int suma[]=new int[sumasApuesta.length];
		for (int i = 0; i < sumasApuesta.length; i++) {
			dados=tirarDados();
			for (int j = 0; j < tirarDados().length; j++) {
				suma[i]+=dados[j];
				System.out.print(dados[j]+"\t");
			}
			System.out.println("La suma es: "+suma[i]);
		}
		
		for (int i = 0; i < sumasApuesta.length; i++) {
			boolean gan=false;
			for (int j = 0; j < suma.length; j++) {
				if(sumasApuesta[i]==suma[j]) {
					gan=true;
					if(suma[j]==12||suma[j]==2||suma[j]==3||suma[j]==11) {
						totalGanado+=dineroApostado;
					}else {
						totalGanado+=dineroApostado*1/3;
					}
				} else {
					gan=false;
				}
			}
		}
		if(totalGanado!=0) {
			totalGanado+=dineroApostado;
		}
		return totalGanado;
	}	
	
	
	public static void main(String[] arg) {
		float dineroApostado=500; int sumas[]= {5,8,12}; 
		System.out.println(Juego.jugar(dineroApostado, sumas));
		System.out.print(rondas);
	}
}
