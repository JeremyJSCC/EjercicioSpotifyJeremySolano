/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author jerjo
 */
public class Examen {

    public static void main(String[] args) {
         clas cancion = new clas(1, "Juice WRLD ", "Lucid Dreams", 350, 2018);

        System.out.println("ID de la canción: " + cancion.getId());
        System.out.println("Título de la canción: " + cancion.getTitulo());
        System.out.println("Autor de la canción: " + cancion.getAutor());
        System.out.println("Duración de la canción: " + cancion.getDuracion() + " segundos");
        System.out.println("Año de creación de la canción: " + cancion.getYear());

    }
}

