package com.potoware.appfacturas;

import com.potoware.appfacturas.modelo.Cliente;
import com.potoware.appfacturas.modelo.Factura;
import com.potoware.appfacturas.modelo.ItemFactura;
import com.potoware.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNumeroIdentificacion("1013680680");
        cliente.setNombre("Alejandro");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura:");
        String desc = s.nextLine();
        Factura factura = new Factura(desc,cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0 ;i<5;i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° "+ producto.getCodigo() + ": ");
            nombre = s.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.addItemFactura(item);
            System.out.println();

        }
        System.out.println(factura.generarDetalle());
    }
}
