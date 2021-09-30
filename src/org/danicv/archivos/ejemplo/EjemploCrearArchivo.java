package org.danicv.archivos.ejemplo;

import org.danicv.archivos.ejemplo.services.ArchivoServicio;

public class EjemploCrearArchivo {

	public static void main(String[] args) {
		String nombreArchivo = "C:\\Archivos\\java.txt";
		ArchivoServicio service = new ArchivoServicio();
		service.crearArchivo(nombreArchivo);

	}

}
