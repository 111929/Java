package computadoras;

public class Orden {

	private final int idOrden;
	Computadoras computadora[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int maxComputadoras= 10;
	public Orden() {
		this.idOrden= ++Orden.contadorOrdenes;
		this.computadora= new Computadoras[Orden.maxComputadoras];
		
	}
	public void agregarComputadoras(Computadoras computadoras) {
		if(this.contadorComputadoras< Orden.maxComputadoras) {
			computadora[contadorComputadoras++]= computadoras;
		}else {
			System.out.println("no queda mas stock");
		}
	}
	public void mostrar() {
		System.out.println("orden : "+this.idOrden);
		System.out.println("computadoras de la orden "+this.idOrden);
		
		for(int i=0; i<this.contadorComputadoras; i++) {
			System.out.println(this.computadora[i]);
		}
	}
	
}
