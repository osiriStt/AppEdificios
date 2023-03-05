package edificio;

public class Edificio {
	
	protected String nombreEdificio;
	protected int numerodePlantas;
	protected int areaSuperficie;
	
	
	
	
	protected Edificio(String nombreEdificio, int numerodePlantas, int areaSuperficie) {
		super();
		this.nombreEdificio = nombreEdificio;
		this.numerodePlantas = numerodePlantas;
		this.areaSuperficie = areaSuperficie;
	}
	
	public void limpiarEdificio() {
		int tiempLimpEdifi=(int) ((areaSuperficie*((1.5)*numerodePlantas))/5);
		System.out.println("El tiempo para limpiar el edificio es :\\n" + tiempLimpEdifi+ "minutos,"
				+ " y el coste Total de la Limpieza es: " + (tiempLimpEdifi*30) );
	
	}
	
	public void calcularCostVigilancia() {
		int cantVglt = Math.round(areaSuperficie / 1000);
		double CostTotViglc = cantVglt * 1300;
		System.out.println("El costo total de Vigilancia es: " + CostTotViglc + "con: " + cantVglt + "contratados");
	}

	@Override
	public String toString() {
		return "Edificio [nombreEdificio=" + nombreEdificio + ", numerodePlantas=" + numerodePlantas
				+ ", areaSuperficie=" + areaSuperficie + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
	
	
}
