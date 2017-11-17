package parte4;

import java.time.LocalDate;

public class Chofer {
	
	private int cantViajesTotalesART;
	private String nombre;
	private String apellido;
	private int telefono;
	private int dni;
	private LocalDate fechaNacimiento;

	public Chofer(String nombre, String apellido, int telefono, int dni, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCantViajesDelDia() {
		return cantViajesTotalesART;
	}

	public void setCantViajesDelDia(int cantViajesDelDia) {
		this.cantViajesTotalesART += cantViajesDelDia;
	}

	public int getCantViajesTotales() {
		return this.cantViajesTotalesART;
	}
	
	public void irAHacerChequeoMedico(){
		this.cantViajesTotalesART = 0;
	}
	
}
