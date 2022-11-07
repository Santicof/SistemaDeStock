package modulo;

public class Producto {
private int idProducto;
private String codigo;
private String nombre;
private double precio;
public Producto(int idProducto, String codigo, String nombre, double precio) throws Exception {

	this.idProducto = idProducto;
	this.setCodigo(codigo);
	this.nombre = nombre;
	this.precio = precio;
}
public int getIdProducto() {
	return idProducto;
}
public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}
public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) throws Exception {
	if(codigo.length()!=10) {
		throw new Exception("no es valido el codigo,no poseee 10 caracters");
	}
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
@Override
public String toString() {
	return "\n---------------Producto---------------\n idProducto=" + idProducto + "\n codigo=" + codigo + "\n nombre=" + nombre + "\n precio=" + precio
			+ "\n";
}


}
