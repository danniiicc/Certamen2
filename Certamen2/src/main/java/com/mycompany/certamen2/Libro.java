/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;


import java.util.ArrayList;

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String codigo, String titulo, String autor, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

     public static Libro buscarLibro(ArrayList<Libro> libros, String codigo) {
        for (int i =0; i < libros.size();i++) {
            if (libros.get(i).getCodigo().equals(codigo)) {
                return libros.get(i); 
            }
        }
        return null; 
    }
     
    public void mostrar(Libro libro) {
        System.out.println("Informacion del libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Precio: " + libro.getPrecio());
    }
    
   
}
