package test;

import java.time.LocalDate;

import modulo.Almacen;
import modulo.Pedido;
import modulo.SistemaCooperativa;
import modulo.Stock;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaCooperativa sis = new SistemaCooperativa();
		// ------------------------------------------------------
		System.out.println("\n1");
		try {
			sis.agregarProducto("1111111111", "producto 1", 100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			sis.agregarProducto("2222222222", "producto 2", 200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			sis.agregarProducto("3333333333", "producto 3", 300);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			sis.agregarProducto("4444444444", "producto 4", 400);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------------
		System.out.println("\n2");

		try {
			sis.agregarProducto("111", "producto 6", 300);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			sis.agregarProducto("222", "producto 7", 400);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------------
		System.out.println("\n3");
		try {
			sis.agregarPedido(sis.traerProducto("1111111111"));
			sis.agregarPedido(sis.traerProducto("2222222222"));
			System.out.println(sis.getStocks());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------------
		System.out.println("\n4");

		sis.agregarAlmacen(sis.traerProducto("2222222222"), 100, 80);

		sis.agregarAlmacen(sis.traerProducto("3333333333"), 120, 100);
		sis.agregarAlmacen(sis.traerProducto("4444444444"), 220, 200);

		System.out.println(sis.getStocks());

		// ------------------------------------------------------
		System.out.println("\n5");
		System.out.println(sis.traerStock(sis.traerProducto("2222222222")));

//------------------------------------------------------
		System.out.println("\n6");
		try {
			Pedido pedido = (Pedido) sis.traerStock(1);
			pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 100, "cliente 1");
			pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 120, "cliente 2");
			pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 150, "cliente 3");
			System.out.println(sis.traerStock(1).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------------
		System.out.println("\n7");
		Almacen alma = (Almacen) sis.traerStock(3);
		alma.agregarLote(LocalDate.of(2021, 7, 14), 1000);
		alma.agregarLote(LocalDate.of(2021, 7, 14), 1200);
		alma.agregarLote(LocalDate.of(2021, 7, 14), 1500);
		System.out.println("traer stock por id 3 con sus lotes" + sis.traerStock(3));

	}

}
