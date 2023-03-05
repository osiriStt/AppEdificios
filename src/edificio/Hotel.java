package edificio;


public class Hotel extends Edificio {
	static double plusdePeligrosidad;
	private String edificioTipo;
	private int numeroHabitaciones;

	protected Hotel(String nombreEdificio, int numerodePlantas, int areaSuperficie, int numeroHabitaciiones, String edificioTipo) {
		super(nombreEdificio, numerodePlantas, areaSuperficie);
		this.numeroHabitaciones=numeroHabitaciones;
		plusdePeligrosidad = 500;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(byte numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
		
	public double calcularMantenimiento(Hotel ho) { //no va static porq no se puede llamar 
		return ((double) (numeroHabitaciones)/20)*(1000);
	}
	
	
	
	
	public void calcularCostVigilancia() {
		int cantVglt = Math.round(areaSuperficie / 1000);
		double CostTotViglc = ((cantVglt * 1300) + plusdePeligrosidad);
		System.out.println("El costo total de Vigilancia es: " + CostTotViglc + "con: " + cantVglt + "contratados");
	}

	

}
