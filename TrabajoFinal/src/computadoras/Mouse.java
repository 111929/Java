package computadoras;

public class Mouse extends DispositivosEntrada{

	private final int  idRaton;
 static int contadorRaton;
 public Mouse(String tipoEntrada, String marca) {
	super(tipoEntrada, marca);
	this.idRaton = ++Mouse.contadorRaton;
}
public int getIdRaton() {
	return idRaton;
}
 @Override
 public String toString() {
	return "Mouse [idRaton=" + idRaton + "] "+ super.toString() ;
 }

 
}
