package vetClinic;

import java.util.ArrayList;


/**
 * Clase Cliente
 * Representa la clase principal de VetClinic.
 * @version 1.0
 * Hace referencia a los datos personales de los clientes.
 * Se organiza por el documento de identidad del cliente.
 * Tiene incluidos varios campos para almacenar informacion
 * sobre el paciente, que es el animal que se atiende en la
 * clinica veterinaria.
 */
public class Cliente {
	private long id;
	private String nombre;
	private ArrayList<Paciente> pacientes;
	private ArrayList<String> telefonos;
	private ArrayList<Cita> historialDeCitas;
	
	public Cliente(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.telefonos = new ArrayList<String>();
		this.pacientes = new ArrayList<Paciente>();
		this.historialDeCitas = new ArrayList<Cita>();
	}

	/**
	 * @return the id
	 */
	public long getID() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setID(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the telefonos
	 */
	public ArrayList<String> getTelefono() {
		return telefonos;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefonos.add(telefono);
	}

	/**
	 * @return the pacientes
	 */
	public ArrayList<Paciente> getPaciente() {
		return pacientes;
	}

	/**
	 * @param pacientes the pacientes to set
	 */
	public void setPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
	}

	/**
	 * @return the historialDeCitas
	 */
	public ArrayList<Cita> getHistorialDeCitas() {
		return historialDeCitas;
	}

	/**
	 * @param historialDeCitas the historialDeCitas to set
	 */
	public void setHistorialDeCitas(Cita nuevaCita) {
		this.historialDeCitas.add(nuevaCita);
	}
}













