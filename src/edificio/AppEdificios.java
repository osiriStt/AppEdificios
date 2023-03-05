package edificio;

import java.util.ArrayList;
import java.util.Scanner;

import appEdificio.Edificio;
import appEdificio.Tools;


public class AppEdificios {
	static ArrayList<Edificio> dbEdificios = new ArrayList<Edificio>();
	public static void main(String[] args) {
	
	}
	public static void menuOpciones() {
		byte opcion;
		do {
			System.out.println("Aplicacio per donar d alta," + " veure i eliminar Edificis.,\n1) "
					+ "Crear Edifici\n2) Donar de Baixa Edifici\n3) Veure Edifici\n5) Sortir");
			Scanner opc = new Scanner(System.in);
			opcion = opc.nextByte();
			switch (opcion) {
			case 1:
				crearEdificio();
				opc.close();
				break;
			case 2:
				// Donar de Baixa Edificio
				String nombreEdificio = Tools.loadStringData("Ingrese nombre del Edificio a dar de Baja");
				darDeBaixaEdificio(nombreEdificio);
				break;
			case 3:
				// Veura Edificio
				String nameSearchEdificio = Tools.loadStringData("Ingrese tipo Edificio a buscar");
				veuraEdificio(nameSearchEdificio);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
		} while (opcion != 5);
	}
	
	public static void crearEdificio() {
		Scanner tclad = new Scanner(System.in);
		String opcText = "No";
		String nombreEdificio;
		int numeroHabitaciones, numeroPlantas;
		double superficieTotalEdificio;

		do {
			nombreEdificio = Tools.loadStringData("Ingrese Nombre del Edificio");
			numeroHabitaciones = Tools.loadIntData("Ingrese Numero de Habitaciones");
			numeroPlantas = Tools.loadIntData("Indique el numero de plantas del Edificio");
			superficieTotalEdificio = Tools.loadDoubleData("Indique la superfie total del Edificio");

			dbEdificios.add(new Edificio(nombreEdificio, numeroHabitaciones, numeroPlantas, superficieTotalEdificio));
			// Mostrar Edificioes cargados
			for (Edificio Edificios : dbEdificios) {
				System.out.println("\n" + "  Edificio creado:  " + Edificios);
			}
			System.out.print("\n" + "  Agregrar otro Edificio?   Si/No  ");
			opcText = tclad.next();
		} while (opcText.equalsIgnoreCase("SI"));
		tclad.close();
	}

	public static void darDeBaixaEdificio(String nombreEdificio) { // Edificio dbEdificio
		Edificio edTemp = Tools.searchEdificio(nombreEdificio, dbEdificios);
		if (edTemp == null) {
			System.out.println("El Edificio: " + nombreEdificio + " no encontrado ¿Desea Crear un nuevo Edificio?");
			crearEdificio();
		} else {
			dbEdificios.remove(edTemp);
			System.out.println("El Edificio es:   " + nombreEdificio + "ha sido dado de baja");
		}
		for (Edificio Edificios : dbEdificios) {
			System.out.println("Los Edificios registrados son:" + dbEdificios );
		}
	}

	public static void veuraEdificio(String tipoEdificio) {
		
		Edificio verEdificio = Tools.searchEdificio(tipoEdificio, dbEdificios);
		
		if (verEdificio == null) {
			System.out.println("El Edificio: " + tipoEdificio + " no encontrado ¿Desea Crear un nuevo Edificio?");
			crearEdificio();
		} else {
			if (verEdificio instanceof Cine) {
				Cine ci = (Cine)verEdificio;
				ci.calcularCostVigilancia();
				ci.proyectarSessio(0);
				System.out.println("El Edificio es:   " + tipoEdificio);
				verEdificio.toString();
			}
			
		}
		
		//Veriricar si es Hotel
		if (verEdificio instanceof Hotel) {
			Hotel ho = (Hotel)verEdificio;
			((Hotel) verEdificio).calcularMantenimiento(ho);
			ho.toString();
		}
		
		if (verEdificio instanceof Hospital) {
			Hospital hosp = (Hospital)verEdificio;
			hosp.mostrarNumeroPacientes();
			hosp.repartirAlmuerzo();
		}
				
		if(verEdificio.nombreEdificio.equalsIgnoreCase("Hotel"))
		{
			Hotel ho = (Hotel)verEdificio;
			ho.toString();
			// Mostrar Costo Total Mantenimiento
			System.out.println("El costo total de mantenimiento de: " + ho.calcularMantenimiento(ho) + "Habitaciones es: "
					+ ho.getNumeroHabitaciones()) ; // Correccion Hecha	
		}
}
	
}
