package main;

public abstract class Plan{
	
	double tarifa;

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	Plan(){
		
	}
	
	Plan(double tarifa){
		this.tarifa = tarifa;
	}
	
	abstract double calcularTarifa(CDR llamada);
}
