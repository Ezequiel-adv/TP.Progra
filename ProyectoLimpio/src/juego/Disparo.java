package juego;

import java.awt.Color;
import entorno.Entorno;

public class Disparo {
    public double x, y;
    private double velocidad = -5; // Velocidad hacia arriba
    private int direccionX;

    public Disparo(double x, double y, int direccionX) {
        this.x = x;
        this.y = y;
        this.direccionX = direccionX;
    }

    public void mover() {
    	x += velocidad * direccionX;
    }

    public void dibujar(Entorno entorno) {
        entorno.dibujarRectangulo(x, y, 10, 5, 0, Color.red); // Ajusta según prefieras
    }
    public boolean colisionaCon(Tortuga tortuga) {
        double distanciaX = Math.abs(this.x - tortuga.getX());
        double distanciaY = Math.abs(this.y - tortuga.getY());
        
        // Asume un rango de proximidad para considerar la colisión (ajustar según sea necesario)
        return distanciaX < 20 && distanciaY < 20;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

}