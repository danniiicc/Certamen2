/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

public class Novela extends Libro {
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public Novela(String codigo,String titulo, String autor, double precio, String genero) {
        super(codigo,titulo, autor, precio);
        this.genero = genero;
    }

 
   public void mostrar(Novela libro) {
       super.mostrar(libro);

        System.out.println("Genero: " + libro.getGenero());
    }
}

