package modulo;

import java.util.ArrayList;
import java.util.List;

public class SistemaCooperativa {
private List<Stock> stocks;
private List<Producto> productos;
public SistemaCooperativa() {
	
	this.stocks = new ArrayList<Stock>();
	this.productos = new ArrayList<Producto>();


}

public Stock traerStock(int idStock) {
	Stock stok=null;
	int i=0;
	while(i<stocks.size()&&stok==null) {
		
		if(stocks.get(i).getIdStock()==idStock) {
			stok=stocks.get(i);
		}
		
		i++;
	}
	return stok;
}





public List<Stock > traerStock(Producto producto){
	List<Stock> lista=new ArrayList<Stock>();
	for(int i=0;i<stocks.size();i++) {
		if(stocks.get(i).getProducto().equals(producto)) {
			lista.add(stocks.get(i));
		}
	}
	return lista;
}





public boolean agregarAlmacen(Producto producto, int unidadesDeseable, int unidadesMinima) {
	int proxId=1;
	if(stocks.size()>0) {
		proxId=stocks.get(stocks.size()-1).getIdStock()+1;
		}
	return stocks.add(new Almacen(proxId, producto, unidadesDeseable, unidadesMinima));
	
}



public boolean agregarProducto(String codigo,String nombre,double precio) throws Exception {
	int proxId=0;
	if(productos.size()>0) {
		proxId=productos.get(productos.size()-1).getIdProducto()+1;
		}
	
	return productos.add(new Producto(proxId, codigo, nombre, precio));
	
	
}



public boolean agregarPedido(Producto producto) {
	int proxId=1;
	if(stocks.size()>0) {
		proxId=stocks.get(stocks.size()-1).getIdStock()+1;
		}
	return stocks.add(new Pedido(proxId,producto));
}




public Producto traerProducto(String codigo) {
	Producto pro=null;
	int i=0;
	while(pro==null&&i<productos.size()) {
		if(productos.get(i).getCodigo().equals(codigo)) {
			pro=productos.get(i);
		}
		i++;
	}
	return pro;
}

public List<Stock> getStocks() {
	return stocks;
}

public List<Producto> getProductos() {
	return productos;
}

@Override
public String toString() {
	return "\n----------------SistemaCooperativa----------\n stocks=" + stocks + ", productos=" + productos + "\n";
}
}