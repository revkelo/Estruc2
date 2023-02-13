
package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Ordenamiento {

//
	public static void burbujaPromedioDescendente(ArrayList<EstudianteDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			EstudianteDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getPromedio() < arreglo.get(j).getPromedio()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}


}
