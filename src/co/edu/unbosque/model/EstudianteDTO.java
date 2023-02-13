package co.edu.unbosque.model;

public class EstudianteDTO {

	private String nombre;
	private double nota_materia1;
	private double nota_materia2;
	private double nota_materia3;
	private double promedio;

	public EstudianteDTO() {
		// TODO Auto-generated constructor stub
	}



	public EstudianteDTO(String nombre, double nota_materia1, double nota_materia2, double nota_materia3,
			double promedio) {
		super();
		this.nombre = nombre;
		this.nota_materia1 = nota_materia1;
		this.nota_materia2 = nota_materia2;
		this.nota_materia3 = nota_materia3;
		this.promedio = promedio;
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
	 * @return the nota_materia1
	 */
	public double getNota_materia1() {
		return nota_materia1;
	}

	/**
	 * @param nota_materia1 the nota_materia1 to set
	 */
	public void setNota_materia1(double nota_materia1) {
		this.nota_materia1 = nota_materia1;
	}

	/**
	 * @return the nota_materia2
	 */
	public double getNota_materia2() {
		return nota_materia2;
	}

	/**
	 * @param nota_materia2 the nota_materia2 to set
	 */
	public void setNota_materia2(double nota_materia2) {
		this.nota_materia2 = nota_materia2;
	}

	/**
	 * @return the nota_materia3
	 */
	public double getNota_materia3() {
		return nota_materia3;
	}

	/**
	 * @param nota_materia3 the nota_materia3 to set
	 */
	public void setNota_materia3(double nota_materia3) {
		this.nota_materia3 = nota_materia3;
	}



	/**
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}



	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

}
