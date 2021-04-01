package computadoras;

public class Monitores {

	private  final int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores;
	
	
	public Monitores() {
		this.idMonitor= ++Monitores.contadorMonitores;
	}
	public Monitores(String marca, double tamaño) {
	this();
		this.marca = marca;
		this.tamaño = tamaño;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	@Override
	public String toString() {
		return "Monitores [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	
}
