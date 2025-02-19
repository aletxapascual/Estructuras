/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;

/**
 * Interfaz que describe las operaciones sobre pilas
 * @author Amparo L&oacute;pez Gaona
 * @version 1a. ed.
 */
public interface Apilable {
    /**
     * Metodo para determinar si una pila esta o no vacia.
     * @return boolean -- true si la pila esta vacia y false en otro caso.
     */
    public boolean estaVacia ();
    /**
     * Metodo para eliminar todos los elementos de una pila
     */
    public void vaciar() ;
    /** 
     * Metodo para obtener el elemento del tope de la pila sin alterar esta
     * @return Object -- ultimo elemento en entrar a la pila
     */
    public Object top() ;
    /** 
     * Metodo para sacar el elemento del tope de la pila
     * @return Object -- ultimo elemento en entrar a la pila
     */
    public Object pop() ;
    /**
     * Metodo para introducir un elemento en la pila
     * @param elem -- elemento a introducir en la pila
     */
    public void push(Object elem) ;
    /**
     * Metodo para obtener un iterador sobre la pila
     * @return Iterator -- iterador sobre la pila
     */
    public java.util.Iterator iterador();
}