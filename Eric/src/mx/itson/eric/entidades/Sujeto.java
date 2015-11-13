package mx.itson.eric.entidades;
/**
 * Representa la entidad sujeto al cual se le realiza el analisis.
 * @author Mariana García
 *
 */

public class Sujeto {
	
	private int id;
	private String nombreAnalista;
	private String tarea;
	private Reba reba;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombreAnalista
	 */
	public String getNombreAnalista() {
		return nombreAnalista;
	}
	/**
	 * @param nombreAnalista the nombreAnalista to set
	 */
	public void setNombreAnalista(String nombreAnalista) {
		this.nombreAnalista = nombreAnalista;
	}
	/**
	 * @return the tarea
	 */
	public String getTarea() {
		return tarea;
	}
	/**
	 * @param tarea the tarea to set
	 */
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	/**
	 * @return the reba
	 */
	public Reba getReba() {
		return reba;
	}
	/**
	 * @param reba the reba to set
	 */
	public void setReba(Reba reba) {
		this.reba = reba;
	}
	
	
	
	
	

}
