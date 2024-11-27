/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;
import java.util.ArrayList;

/**
 *
 * @author 52999
 */
public class Lista {
    private Ingrediente primerNodo; // Primer nodo de la lista

    public Lista() {
        this.primerNodo = null; // Inicializar la lista vacía
    }
    
    // Método para agregar un ingrediente al final de la lista
    public void agregar(String nombre) {
        Ingrediente nuevoNodo = new Ingrediente(nombre);
        if (primerNodo == null) {
            primerNodo = nuevoNodo; 
        } else {
            Ingrediente actual = primerNodo;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Ir al último nodo
            }
            actual.siguiente = nuevoNodo; // Conectar el último nodo al nuevo
        }
    }
    
    public void eliminar(int index) {
    
       if (index == 0) {
        primerNodo = primerNodo.siguiente; // Eliminar el primer nodo
        return;
    }

    Ingrediente actual = primerNodo;
    int contador = 0;

    while (actual != null && contador < index - 1) {
        actual = actual.siguiente;
        contador++;
    }

    actual.siguiente = actual.siguiente.siguiente; 
    }
    
    public String imprimir() {
        ArrayList<String> lista = new ArrayList<>();
        Ingrediente actual = primerNodo;
        while (actual != null) {
            lista.add(actual.nombre); 
            actual = actual.siguiente;
        } 
        return ("-") + String.join("\n-", lista);
    }
}


