package edificio;

public class Cine extends Edificio {

	static double precioEntrada;
	static int aforo;
	
	private String edificioTipo;

	protected Cine(String nombreEdificio, int numerodePlantas, int areaSuperficie, String edificioTipo) {
		super(nombreEdificio, numerodePlantas, areaSuperficie);
		Cine.precioEntrada = 5.5;
		Cine.aforo = 250;
	}

	public void proyectarSessio(int numeroAsistentes) {
		// Validar

		if (numeroAsistentes < aforo) {
			double totalRecaudado = precioEntrada * numeroAsistentes;
			System.out.println("Se han recaudado:    " + totalRecaudado);
		} else {
			System.out.println("El numero de asistentes a la sesion no puede ser mayor al aforo");
		}
	}

	public void calcularCostVigilancia() {

		int cantVglt = Math.round(areaSuperficie / 3000);
		double CostTotViglc = cantVglt * 1300;
		System.out.println("El costo total de Vigilancia es: " + CostTotViglc + "con: " + cantVglt + "contratados");
	}

	@Override
	public String toString() {
		return "Cine [edificioTipo=" + edificioTipo + ", nombreEdificio=" + nombreEdificio + ", numerodePlantas="
				+ numerodePlantas + ", areaSuperficie=" + areaSuperficie + ", toString()=" + super.toString() + "]";
	}

	
}
