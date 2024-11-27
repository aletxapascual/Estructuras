/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;

/**
 *
 * @author 52999
 */
public class Ingrediente {
    String nombre; // Valor del nodo de tipo String
    Ingrediente siguiente; // Referencia al siguiente nodo

    // Constructor que recibe el nombre del ingrediente
    public Ingrediente(String nombre) {
        this.nombre = nombre; // Asignar el valor String
        this.siguiente = null; // Inicializar siguiente como null
    }
}
