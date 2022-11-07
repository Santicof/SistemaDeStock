package modulo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Stock {
private List<NotaPedido> notasPedidos;


public Pedido(int idStock, Producto producto) {
	super(idStock, producto);
	this.notasPedidos = new ArrayList<NotaPedido>();
}

public boolean agregarNotaPedido(LocalDate fecha, int cantidad, String cliente) {
	return notasPedidos.add(new NotaPedido(fecha, cantidad, cliente));
}
public List<NotaPedido> getNotasPedidos() {
	return notasPedidos;
}


@Override
public String toString() {
	return "\n----Pedido----\n notasPedidos=" + notasPedidos + " "+super.toString();
}



}
