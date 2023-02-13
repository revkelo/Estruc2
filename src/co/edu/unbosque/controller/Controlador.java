
package co.edu.unbosque.controller;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.Consola;

public class Controlador {

	private Consola miconsola;
	private int comprobante = 0, comprobante1 = 0;
	int perdidos_materia1;
	int perdidos_materia2;
	int perdidos_materia3;
	private double random1;
	private double random2;
	private double random3;
	private Fachada model;
	private String eleccion21;
	private boolean ciclo = true;

	public Controlador() {

		miconsola = new Consola();
		model = new Fachada();

	}

	public void ejecutar() {
		while (ciclo = true) {
			try {
				miconsola.imprimirString("Taller");
				miconsola.imprimirString(
						"1) Cargar estudiantes 2) Estudiante mejor promedio  3) Materia que mas perdieron estudiantes  4) Mostrar  5) Salir");

				 eleccion21 = miconsola.leerTexto();
				int eleccion = Integer.parseInt(eleccion21);
				switch (eleccion) {
				case 1:

					if (comprobante == 0) {

						for (int i = 0; i < 10; i++) {

							nota_materia1();
							nota_materia2();
							nota_materia3();

							double promedio = random1 + random2 + random3;
							promedio = promedio / 3;

							DecimalFormat df = new DecimalFormat("#.##");
							String formato_decimal = df.format(promedio);
							promedio = Double.parseDouble(formato_decimal);

							model.getAsigdao().guardar_materia1("Materia 1", "Estudiante " + (i + 1), random1);
							model.getAsigdao().guardar_materia2("Materia 2", "Estudiante " + (i + 1), random2);
							model.getAsigdao().guardar_materia3("Materia 3", "Estudiante " + (i + 1), random3);

							model.getEstudao().guardar("Estudiante " + (i + 1), random1, random2, random3, promedio);

						}

						miconsola.imprimirString("Se cargaron los estudiantes perfectamente");

						comprobante = 1;
					} else {
						miconsola.imprimirString("Ya se cargaron los estudiantes");


					}
					break;

				case 2:
					if (comprobante == 0) {
						miconsola.imprimirString("Porfavor cargue los estudiantes");

					} else {

						model.getOrde().burbujaPromedioDescendente(model.getEstudao().getLista());
						model.getEstudao().mostrar();
						respaldo();


					}
					break;
				case 3:
					if (comprobante == 0) {
						miconsola.imprimirString("Porfavor cargue los estudiantes");

					} else {


						materiasPerdidas();
					}
					break;
				case 4:
					miconsola.imprimirString(
							"1) Mostrar Estudiantes 2) Mostrar Materia 1  3) Mostrar Materia 2  4) Mostrar Materia 3 ");

					int eleccion1 = miconsola.leerEntero();

					switch (eleccion1) {
					case 1:

						if (comprobante == 0) {
							miconsola.imprimirString("Porfavor cargue los estudiantes");

						} else {




							model.getEstudao().mostrar();
						}


						break;
					case 2:
						if (comprobante == 0) {
							miconsola.imprimirString("Porfavor cargue los estudiantes");

						} else {




							model.getAsigdao().mostrar_materia1();
						}
						break;
					case 3:
						if (comprobante == 0) {
							miconsola.imprimirString("Porfavor cargue los estudiantes");

						} else {




							model.getAsigdao().mostrar_materia2();
						}
						break;
					case 4:
						if (comprobante == 0) {
							miconsola.imprimirString("Porfavor cargue los estudiantes");

						} else {




							model.getAsigdao().mostrar_materia3();
						}
						break;

					default:
						miconsola.imprimirString("Error");

						break;
					}

					break;
				case 5:

					System.exit(1);
					break;

				default:
				
					miconsola.imprimirString("Error");
					break;
				}
				
		
				
			} catch (Exception e) {
			
				}
		}


	}

	public void respaldo() {
		model.getEstudao().getLista().clear();
		for (int i = 0; i < model.getEstudao().getRespaldo().size(); i++) {
			model.getEstudao().getLista().add(model.getEstudao().getRespaldo().get(i));
		}
	}

	public void materiasPerdidas() {

		if (comprobante == 1) {

		}

		if (comprobante == 0) {
			miconsola.imprimirString("Porfavor cargue los estudiantes");

		} else if (comprobante == 1 && comprobante1 == 0) {

			for (int i = 0; i < model.getEstudao().getLista().size(); i++) {

				if (model.getAsigdao().getAsignatura1().get(i).getNota_materia() < 3) {
					perdidos_materia1++;
				}
				if (model.getAsigdao().getAsignatura2().get(i).getNota_materia() < 3) {

					perdidos_materia2++;
				}
				if (model.getAsigdao().getAsignatura3().get(i).getNota_materia() < 3) {
					perdidos_materia3++;
				}
			}
			comprobante1 = 1;
		}


		if (perdidos_materia1 == perdidos_materia2 && perdidos_materia3 == perdidos_materia2) {
			miconsola.imprimirString(
					"Las 3 asignaturas tienen la misma cantidad de estudiantes perdiendo su materia que es " + perdidos_materia1);

		}else {

			int mayor = 0;
			int segundo_m = 0;
			int menor = 0;
			String materia_mayor;
			String materia_segmayor;
			String materia_menor;

			if (perdidos_materia1 > perdidos_materia2) {
				mayor = perdidos_materia1;
				segundo_m = perdidos_materia2;
				materia_segmayor = "Materia 2";
				materia_mayor = "Materia 1";
			} else {
				mayor = perdidos_materia2;
				segundo_m = perdidos_materia1;
				materia_mayor = "Materia 2";
				materia_segmayor = "Materia 1";
			}

			if (mayor < perdidos_materia3) {
				menor = segundo_m;
				materia_menor = materia_segmayor;

				segundo_m = mayor;
				materia_segmayor = materia_mayor;

				mayor = perdidos_materia3;
				materia_mayor = "Materia 3";
			} else if (segundo_m < perdidos_materia3) {
				menor = segundo_m;
				materia_menor = materia_segmayor;
				segundo_m = perdidos_materia3;
				materia_segmayor = "Materia 3";
			} else {
				menor = perdidos_materia3;
				materia_menor = "Materia 3";
			}




			if (mayor == segundo_m) {
				miconsola.imprimirString(
						"Tenemos la misma cantidad de estudiantes perdiendo la materia "+ materia_mayor +" y "+materia_segmayor+"  que es " + mayor);
				miconsola.imprimirString(
						"Y la materia que tiene menor cantidad de estudiantes perdiendo es " + materia_menor+" y tiene "+menor );
			} else if(menor == segundo_m){
				miconsola.imprimirString(
						"Y la materia que tiene Mayor cantidad de estudiantes perdiendo es " + materia_mayor+" y tiene "+mayor );
				miconsola.imprimirString(
						"Tenemos la misma cantidad de estudiantes perdiendo la materia "+ menor +" y "+materia_segmayor+"  que es " + mayor);


			}else {
				miconsola.imprimirString(materia_mayor + " Tiene " + mayor + " Estudiantes Perdiendo esta asignatura");
				miconsola.imprimirString("Mayor " + mayor + " " + materia_mayor);
				miconsola.imprimirString("Segundo mayor " + segundo_m + " " + materia_segmayor);
				miconsola.imprimirString("menor " + menor + " " + materia_menor);
			}

		}
	}


	public double nota_materia1() {
		Random random = new Random();
		random1 = (double) Math.round(random.nextDouble() * (5 * 100.0)) / 100.0;
		return random1;
	}

	public double nota_materia2() {
		Random random = new Random();
		random2 = (double) Math.round(random.nextDouble() * (5 * 100.0)) / 100.0;
		return random2;
	}

	public double nota_materia3() {
		Random random = new Random();
		random3 = (double) Math.round(random.nextDouble() * (5 * 100.0)) / 100.0;
		return random3;
	}

	public Consola getMiconsola() {
		return miconsola;
	}

	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
	}

}
