package org.danicv.archivos.ejemplo.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);

		try {
			FileWriter escritor = new FileWriter(archivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
