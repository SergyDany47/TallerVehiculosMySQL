package com.paquete.tallerSQL;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class EntradaSalida {

	public static final int NUEVO_VEHICULO = 1;
	public static final int LISTAR_VEHICULO = 2;
	public static final int BUSCAR_VEHICULO = 3;
	public static final int COPIA_SEGURIDAD = 4;
	public static final int SALIR = 5;

	public static int mostrarMenu() {
		Scanner in = new Scanner(System.in);
		int opcion;
		System.out.println("Introduzca la opción la opción deseada");
		System.out.println("1 - Nuevo vehículo");
		System.out.println("2 - Listar vehículos");
		System.out.println("3 - Buscar vehículo por matrícula");
		System.out.println("4 - Crear copia de seguridad en CSV");
		System.out.println("5 - Salir");

		opcion = Integer.parseInt(in.nextLine());
		return opcion;
	}

	public static Vehiculo pedirVehiculo() {
		Scanner in = new Scanner(System.in);
		Vehiculo c = new Vehiculo();
		System.out.println("Introduce la marca del coche");
		c.setMarca(in.nextLine());

		System.out.println("Introduce el modelo del coche");
		c.setModelo(in.nextLine());

		System.out.println("Introduce la potencia del coche");
		c.setPotencia(in.nextLine());

		System.out.println("Introduce la matricula del coche");
		c.setMatricula(in.nextLine());

		System.out.println("Introduce la avería del coche");
		c.setAveria(in.nextLine());
		return c;
	}

	public static void mostrarVehiculo(ArrayList<String> vehiculos) {
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println(vehiculos.get(i));
		}

	}

	public static String pedirMatricula() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la matricula del coche que quieres buscar");
		String matricula = in.nextLine();
		return matricula;
	}

	public static void crearCSV(ArrayList<String> vehiculos) {
		File f = new File("C:\\Users\\SergioO\\Desktop\\UEM-Casa\\T-3\\Workspace\\TallerProyecto\\ListaVehiculos.csv");

		try {
			FileWriter fw = new FileWriter(f);

			for (String string : vehiculos) {
				
				fw.write(string + "\n");
			}
			fw.close();
			System.out.println("CSV CREADO CON EXITO !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}