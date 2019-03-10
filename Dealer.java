
public class Dealer extends Empleado {
	public Dealer(float salario, String rango) {
		super(salario, rango);
		// TODO Auto-generated constructor stub
	}
	private Jugador j= new Jugador();

	@Override
	public String asignarRango() {
		// TODO Auto-generated method stub
		return super.rango="Dealer";
	}
	public void terminarJuego(float saldoJugador) {
		if(saldoJugador <=0) {

		}
	}
	public void aumentarApuesta(float apuesta,int xcuanto) {
		switch(xcuanto) {
		case 2:
			apuesta*=2;
			break;
		case 3:
			apuesta*=3;
			break;
		case 5:
			apuesta*=5;
			break;
		case 10:
			apuesta*=10;
			break;
		default:
			apuesta=apuesta;
		}

	}
	
	public void cerrarApuestas() {
		
	}
	public void recibirApuestas(float apuesta) {
		
	}


}
