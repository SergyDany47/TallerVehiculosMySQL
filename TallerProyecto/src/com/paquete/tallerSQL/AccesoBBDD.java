package com.paquete.tallerSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBBDD {

	public static Statement CrearConexionBBDD() {

		Statement stmt = null;
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Taller", "root", "");
			stmt = c.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;

	}

	public static void AgregarVehiculo(Vehiculo c) {

		try {
			Statement stmt = CrearConexionBBDD();
			String insert = "INSERT INTO vehiculo VALUES ('" + c.getMarca() + "','" + c.getModelo() + "','"
					+ c.getPotencia() + "','" + c.getMatricula() + "','" + c.getAveria() + "')";
			stmt.executeUpdate(insert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ArrayList<String> listarVehiculo() {

		ArrayList<String> Vehiculos = new ArrayList<String>();

		try {
			Statement stmt = CrearConexionBBDD();
			String select = "SELECT * FROM vehiculo";

			ResultSet resultado = stmt.executeQuery(select);
			while (resultado.next()) {
				String cogerDatos = (resultado.getString("marca") + ";" + resultado.getString("modelo") + ";"
						+ resultado.getString("potencia") + ";" + resultado.getString("matricula") + ";"
						+ resultado.getString("averia"));
				Vehiculos.add(cogerDatos);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Vehiculos;

	}

	public static ArrayList BuscarVehiculo(String matricula) {
		
		ArrayList<String> Vehiculos = new ArrayList<String>();
		try {
			Statement stmt = CrearConexionBBDD();
			String select = "SELECT * FROM vehiculo WHERE matricula = '" + matricula + "'";

			ResultSet resultado = stmt.executeQuery(select);
			while (resultado.next()) {
				String cogerDatos = (resultado.getString("marca") + " " + resultado.getString("modelo") + " "
						+ resultado.getString("potencia") + " " + resultado.getString("matricula") + " "
						+ resultado.getString("averia"));
				Vehiculos.add(cogerDatos);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Vehiculos;

	}

}
