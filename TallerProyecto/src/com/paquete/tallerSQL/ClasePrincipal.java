package com.paquete.tallerSQL;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {

		int opcion = EntradaSalida.mostrarMenu();

		while (opcion != EntradaSalida.SALIR) {

			switch (opcion) {
			case EntradaSalida.NUEVO_VEHICULO:
				Vehiculo c = EntradaSalida.pedirVehiculo();
				AccesoBBDD.AgregarVehiculo(c);
				break;
			case EntradaSalida.LISTAR_VEHICULO:
				ArrayList<String> vehiculosListar = AccesoBBDD.listarVehiculo();
				EntradaSalida.mostrarVehiculo(vehiculosListar);
				break;
			case EntradaSalida.BUSCAR_VEHICULO:
				String matricula = EntradaSalida.pedirMatricula();
				ArrayList<String> vehiculosBuscar = AccesoBBDD.BuscarVehiculo(matricula);
				EntradaSalida.mostrarVehiculo(vehiculosBuscar);
				break;
			case EntradaSalida.COPIA_SEGURIDAD:
				ArrayList<String> vehiculosCopia = AccesoBBDD.listarVehiculo();
				EntradaSalida.crearCSV(vehiculosCopia);
				break;
			}
			System.out.println();
			opcion = EntradaSalida.mostrarMenu();
		}
	}
}