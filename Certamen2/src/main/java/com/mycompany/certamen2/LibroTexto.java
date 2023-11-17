/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;


public class LibroTexto extends Libro {
    private String escuela;

 
    public LibroTexto(String codigo,String titulo, String autor, double precio, String escuela) {
        super(codigo,titulo, autor, precio);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }


   public void mostrar(LibroTexto libro) {
       super.mostrar(libro);

        System.out.println("Escuela encargada: " + libro.getEscuela());
    }
}