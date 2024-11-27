/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;
import javax.swing.JPanel;
import java.awt.*;

public class Dibujar extends JPanel {
    private Arbol arbol;

    public Dibujar(Arbol arbol) {
        this.arbol = arbol;
        setPreferredSize(new Dimension(800, 600)); // Dimensiones iniciales grandes para el scroll
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Limpia el área de dibujo
        if (arbol.raiz != null) {
            // Calcular el tamaño necesario para el dibujo completo del árbol
            int ancho = calcularAncho(arbol.raiz, 50); // Ajustar separaciones horizontales
            int alto = calcularAltura(arbol.raiz, 50); // Ajustar separaciones verticales
            setPreferredSize(new Dimension(ancho, alto));
            revalidate(); // Actualizar el tamaño preferido

            // Dibujar el árbol
            dibujarNodo(g, arbol.raiz, getWidth() / 2, 30, getWidth() / 4, 50);
        }
    }

    private void dibujarNodo(Graphics g, Arbol.Nodo nodo, int x, int y, int offsetX, int offsetY) {
        if (nodo == null) return;

        // Guardar el contexto gráfico original
        Graphics2D g2d = (Graphics2D) g.create();

        // Dibujar el círculo relleno
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x - 15, y - 15, 30, 30);

        // Dibujar el contorno del círculo
        g2d.setColor(Color.WHITE);
        g2d.drawOval(x - 15, y - 15, 30, 30);

        // Dibujar el texto centrado en el círculo
        g2d.setColor(Color.WHITE);
        FontMetrics fm = g2d.getFontMetrics();
        int textWidth = fm.stringWidth(nodo.info);
        int textHeight = fm.getHeight();
        g2d.drawString(nodo.info, x - textWidth / 2, y + textHeight / 4);

        // Dibujar las líneas hacia los hijos
        g2d.setColor(Color.BLACK);
        if (nodo.izq != null) {
            g2d.drawLine(x, y, x - offsetX, y + offsetY);
            dibujarNodo(g, nodo.izq, x - offsetX, y + offsetY, offsetX / 2, offsetY);
        }
        if (nodo.der != null) {
            g2d.drawLine(x, y, x + offsetX, y + offsetY);
            dibujarNodo(g, nodo.der, x + offsetX, y + offsetY, offsetX / 2, offsetY);
        }

        // Liberar el contexto gráfico
        g2d.dispose();
    }

    private int calcularAncho(Arbol.Nodo nodo, int offsetX) {
        if (nodo == null) return 0;
        int anchoIzq = calcularAncho(nodo.izq, offsetX);
        int anchoDer = calcularAncho(nodo.der, offsetX);
        return Math.max(anchoIzq, anchoDer) + offsetX * 2;
    }

    private int calcularAltura(Arbol.Nodo nodo, int offsetY) {
        if (nodo == null) return 0;
        int alturaIzq = calcularAltura(nodo.izq, offsetY);
        int alturaDer = calcularAltura(nodo.der, offsetY);
        return Math.max(alturaIzq, alturaDer) + offsetY;
    }
}
