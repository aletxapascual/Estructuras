/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.proyecto;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author julie
 */
public class Disco extends JComponent{
    private int nsize; // Taille du disque
    private Color color; // Couleur du disque
    private int width;

    public Disco(int size, Color color) {
        this.nsize = size;
        this.color = color;
        this.setSize(nsize * 20, 20);
    }
    

    public int getnSize() {
        return nsize;
    }

    public Color getColor() {
        return color;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());

        
        // Dessiner le numéro au centre
        g.setColor(Color.WHITE); // Couleur du texte
        String texto = String.valueOf(nsize); // Obtenir le numéro du disque
        int textWidth = g.getFontMetrics().stringWidth(texto); // Largeur du texte
        int textHeight = g.getFontMetrics().getHeight(); // Hauteur du texte
        int textX = (getWidth() - textWidth) / 2; // Calculer X pour centrer le texte
        int textY = (getHeight() + textHeight) / 2 - 3; // Calculer Y pour centrer le texte

        g.drawString(texto, textX, textY); // Dessiner le numéro
    }
    
    
    
}
