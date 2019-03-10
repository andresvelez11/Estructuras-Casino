
public  abstract class Empleado {
protected float salario;
protected String rango;

abstract public String asignarRango();

public Empleado(float salario, String rango) {
	super();
	this.salario = salario;
	this.rango = rango;
}

}
