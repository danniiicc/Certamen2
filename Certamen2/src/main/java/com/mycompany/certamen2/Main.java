/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;

import java.util.ArrayList;

public class Main {
    
    public static void insercionDatos(ArrayList<Libro> biblioteca) {
        
        biblioteca.add(new Academico("01","Introduccion a la programacion","Juan Perez", 1200, "Informatica"));
        biblioteca.add(new Novela("02","Cien años de soledad", "Gabriel Garcia", 3000, "Realista"));
        biblioteca.add(new LibroTexto("03","Mate Avanzada", "Kevin Selave", 5000, "Escuela de Calculo"));
       
    }

    public static void main(String[] args) {
        
        ArrayList<Libro> biblioteca = new ArrayList<>();
        insercionDatos(biblioteca);

        
        String codigoBuscado = "01";
        Libro libroEncontrado = Libro.buscarLibro(biblioteca, codigoBuscado);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: ");
            libroEncontrado.mostrar(libroEncontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}



