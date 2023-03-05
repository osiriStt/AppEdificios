package edificio;

import java.time.LocalDateTime;

public class Hospital extends Edificio {
	
	private String edificioTipo;
	private int numeroEnfermos;
	
	
	protected Hospital(String nombreEdificio, int numerodePlantas, int areaSuperficie, int numeroEnfermos, String edificioTipo) {
		super(nombreEdificio, numerodePlantas, areaSuperficie);
		this.numeroEnfermos=numeroEnfermos;
		this.edificioTipo=edificioTipo;
	}

	//Getters&Setters
	
	public int getNumeroEnfermos() {
		return numeroEnfermos;
	}
	
	public void repartirAlmuerzo() {
		int raciones=(numeroEnfermos*3);
		System.out.println("Se estan repartiendo:  " +raciones+ "raciones");
	}

	

	public void setNumeroEnfermos(byte numeroEnfermos) {
		this.numeroEnfermos = numeroEnfermos;
	}

	public void modificarNumeroPacientes (int numeroPacientes) {
		numeroEnfermos=numeroPacientes;
		System.out.println("Los pacientes han sido actualizados a un total de: " + numeroEnfermos);
	}
	
	public void mostrarNumeroPacientes () {
		System.out.println("Al dia de hoy"+ LocalDateTime.now()+ "la cantidad de pacientes Hospitalizado es ");
	}

	@Override
	public String toString() {
		return "Hospital [edificioTipo=" + edificioTipo + ", numeroEnfermos=" + numeroEnfermos + ", nombreEdificio="
				+ nombreEdificio + ", numerodePlantas=" + numerodePlantas + ", areaSuperficie=" + areaSuperficie
				+ ", getNumeroEnfermos()=" + getNumeroEnfermos() + "]";
	}
			
	
	
	
	
	
	
	
	
	
}
