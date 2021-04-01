package computadoras;

public class Monitores {

	private  final int idMonitor;
	private String marca;
	private double tama�o;
	private static int contadorMonitores;
	
	
	public Monitores() {
		this.idMonitor= ++Monitores.contadorMonitores;
	}
	public Monitores(String marca, double tama�o) {
	this();
		this.marca = marca;
		this.tama�o = tama�o;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	@Override
	public String toString() {
		return "Monitores [idMonitor=" + idMonitor + ", marca=" + marca + ", tama�o=" + tama�o + "]";
	}
	
	
}
