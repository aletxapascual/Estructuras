/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;


/**
 *
 * @author 52999
 */
public class Arbol {

    class Nodo {
        String info;  
        Nodo izq, der;

        Nodo(String info) {
            this.info = info;
            this.izq = null;
            this.der = null;
        }
    }

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Método para construir el árbol a partir de una expresión aritmética
    public Nodo construirArbol(String expresion) {
        
        // Eliminar los paréntesis extras
        while (expresion.startsWith("(") && expresion.endsWith(")") && esParentesisBalanceado(expresion.substring(1, expresion.length() - 1))) {
            expresion = expresion.substring(1, expresion.length() - 1);
        }

        // Busca el operador principal considerando paréntesis
        int operadorPrincipal = encontrarOperadorPrincipal(expresion);

        if (operadorPrincipal == -1) {
            return new Nodo(expresion.trim());  // No hay ninguna operación, solo un número o letra
        }

        // Tomar el valor del operador principal
        String operador = String.valueOf(expresion.charAt(operadorPrincipal));
        Nodo nodo = new Nodo(operador);

         //Toma la parte de la expresión que está a la izquierda del operador principal (del 0 hasta uno antes del operador) 
        String izquierda = expresion.substring(0, operadorPrincipal).trim();

        //Toma la parte de la expresión que está a la derecha del operador principal (de uno después del operador hasta el final)
        String derecha = expresion.substring(operadorPrincipal + 1).trim();


        // Llamadas recursivas para construir subárboles
        nodo.izq = construirArbol(izquierda);
        nodo.der = construirArbol(derecha);

        return nodo;
    }
    
    private int encontrarOperadorPrincipal(String expresion) {
        int nivelParentesis = 0;
        int posicion = -1;
        int minPrioridad = Integer.MAX_VALUE;

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(') {
                nivelParentesis++; // Aumentar el nivel cuando se encuentra un paréntesis de apertura
            } else if (c == ')') {
                nivelParentesis--; // Disminuir el nivel cuando se encuentra un paréntesis de cierre
            } else if (nivelParentesis == 0 && esOperador(c)) {
                // Solo considerar operadores fuera de los paréntesis
                int prioridadActual = prioridad(c);

                // Asegurarse de seleccionar el operador con la menor prioridad
                if (prioridadActual <= minPrioridad) {
                    minPrioridad = prioridadActual;
                    posicion = i;
                }
            }
        }

        return posicion;
    }
    
    private boolean esParentesisBalanceado(String expresion) {
        int nivel = 0;
        for (char c : expresion.toCharArray()) {
            if (c == '(') nivel++;
            else if (c == ')') nivel--;
            if (nivel < 0) return false; // Se cerró un paréntesis que no fue abierto
        }
        return nivel == 0; // Todos los paréntesis están balanceados
    }
    

    // Verificar si un carácter es operador
    private boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Definir prioridades de operadores
    private int prioridad(char operador) {
        switch (operador) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    //Imprimir inorden
    public String imprimirInOrden(Nodo nodo) {
    if (nodo == null) {
        return "";
    }
    return imprimirInOrden(nodo.izq) + nodo.info + " " + imprimirInOrden(nodo.der);
}
    
    // Imprimir preorden
    public String imprimirPreOrden(Nodo nodo) {
    if (nodo == null) {
        return "";
    }
    return nodo.info + " " + imprimirPreOrden(nodo.izq) + imprimirPreOrden(nodo.der);
}

    // Imprimir posorden
    public String imprimirPosOrden(Nodo nodo) {
    if (nodo == null) {
        return "";
    }
    return imprimirPosOrden(nodo.izq) + imprimirPosOrden(nodo.der) + nodo.info + " ";
    }
}

