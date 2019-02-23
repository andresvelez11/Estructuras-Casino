
public class Juego {
	private static float dineroCasa;
	private static int rondas;
	
	public Juego() {
		rondas++;
	}

	public static void mostrarReglas() {
		
	}
	
	public static int[] tirarDados() {
		int a[] = {(int) (Math.random() * 6) + 1, (int) (Math.random() * 6) + 1};
		return a;
	}
	
	public static float jugar(float dineroApostado[], int sumasApuesta[]) {//Devuelve lo que gana el jugador
		float totalGanado=0;
		int dados[];
		int suma[]=new int[sumasApuesta.length];
		for (int i = 0; i < sumasApuesta.length; i++) {
			dados=tirarDados();
			for (int j = 0; j < tirarDados().length; j++) {
				suma[i]+=dados[j];
				System.out.print(tirarDados()[j]+"\t");
			}
			System.out.println("La suma es: "+suma[i]);
		}
		boolean gan=false;
		for (int i = 0; i < sumasApuesta.length; i++) {//Todo este bloque es el que está generando el problema a la hora de comparar la suma, ya que el arreglo suma siempre está cambiando de valor
			for (int j = 0; j < suma.length; j++) {
				if(sumasApuesta[i]==suma[j]) {
					if(suma[j]==12||suma[j]==2||suma[j]==3||suma[j]==11) {
						dineroCasa-=dineroApostado[i]*2;
						totalGanado+=dineroApostado[i]*2;
						gan=true;
					}else {
						dineroCasa-=dineroApostado[i]*(3/2);
						totalGanado+=dineroApostado[i]*(3/2);
						gan=true;
					}
				}
			}
			if(gan==false) {
				totalGanado-=dineroApostado[i];
				dineroCasa+=dineroApostado[i];
			}
		}
		return totalGanado;
	}
	
	public static void main(String[] arg) {
		float[] dineroApostado= {200, 300, 500}; int sumas[]= {5,8,12}; 
		System.out.println(Juego.jugar(dineroApostado, sumas));
	}
}
