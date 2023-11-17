/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

public class Academico extends Libro {
    private String campoEstudio;

   
    public Academico(String codigo, String titulo, String autor, double precio, String campoEstudio) {
        super(codigo,titulo, autor, precio);
        this.campoEstudio = campoEstudio;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

  
   public void mostrar(Academico libro) {
       super.mostrar(libro);

        System.out.println("Campo de estudio: " + libro.getCampoEstudio());
    }
}

