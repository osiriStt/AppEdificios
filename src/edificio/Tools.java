package edificio;

import java.util.*;

public class Tools {

	private static Scanner sc = new Scanner(System.in);

	// Constructor no instanciar

	private Tools() {
	}

	// Metodo pedir Datos [cargar el ArrayList] just in case of fire
	public static String loadStringData(String mensaje) { // String Data
		System.out.println(mensaje);
		return sc.nextLine();
	}

	public static int loadIntData(String mensaje) {// int Data
		System.out.println(mensaje);
		return sc.nextInt();
	}

	public static double loadDoubleData(String mensaje) { // Double Data
		System.out.println(mensaje);
		return sc.nextInt();
	}

	public static String[] loadStrArrData(String mensaje) { // load many data one time
		System.out.println(mensaje);
		return sc.nextLine().split(",");
	}

	public static ArrayList<Integer> loadIntArrLData(String mensaje) {
		System.out.println(mensaje);
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0; i < num.size(); i++) {
			num.add(sc.nextInt());
		}
		return num;
	}

	// Metodo checkEdificio

	public static void showEdificios(ArrayList<Edificio> dbEdificios) {
		if (!dbEdificios.isEmpty()) {
			System.out.println("Edificio no existe en BD");
		} else {
			for (Edificio edf : dbEdificios) {
				System.out.println("Listado Edificio en BD");
			}
		}
	}

	
	
	public static Edificio searchEdificio (String tipoEdificio, ArrayList<Edificio> dbEdificios) {
		Edificio edificioFinded = null;
		Iterator<Edificio> it = dbEdificios.iterator();
			while(it.hasNext() && edificioFinded == null) {  //.get   .equalsIgnoreCase(nombreEdificio)) {
				Edificio edf = it.next();
					if (edf.nombreEdificio.equalsIgnoreCase(tipoEdificio));
						edificioFinded = edf;
	
	}
			return edificioFinded;
	
	// Pass an Array Objects as Parameter
	}
} /* End Class */