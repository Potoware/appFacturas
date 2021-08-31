package com.potoware.appfacturas;

import com.potoware.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNumeroIdentificacion("1013680680");
        cliente.setNombre("Alejandro");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura:");
        Factura factura = new Factura(s.nextLine(),cliente);

        Producto producto;

        System.out.println();

        for(int i = 0 ;i<2;i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° "+ producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));
            System.out.println();

            s.nextLine();

        }
        System.out.println(factura);
    }
}
