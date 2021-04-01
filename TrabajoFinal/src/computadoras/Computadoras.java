package computadoras;

public class Computadoras {

	private int idComputadora;
	private String nombre;
	Monitores monitores;
	Teclado teclado;
	Mouse mouse;
	private static int contadorComputadoras;
	
	
	public Computadoras() {
		this.idComputadora= ++Computadoras.contadorComputadoras;
	}
	public Computadoras(String nombre, Monitores monitores, Teclado teclado, Mouse mouse) {
		this();
		this.nombre = nombre;
		this.monitores = monitores;
		this.teclado = teclado;
		this.mouse = mouse;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Monitores getMonitores() {
		return monitores;
	}
	public void setMonitores(Monitores monitores) {
		this.monitores = monitores;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public int getIdComputadora() {
		return idComputadora;
	}
	@Override
	public String toString() {
		return "Computadoras [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitores=" + monitores
				+ ", teclado=" + teclado + ", mouse=" + mouse + "]";
	}
	
}
