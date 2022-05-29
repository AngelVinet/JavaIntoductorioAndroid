/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

/**
 *
 * @author antuan
 */
public class Pelicula extends Programa implements Visualizable{
    
    private int anios;

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Pelicula() {
    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula(int anios, String titulo, String genero, String creador, String duracion) {
        super(titulo, genero, creador, duracion);
        this.anios = anios;
    }

    public Pelicula(int anios, String titulo, String genero, String creador, String duracion, boolean visto) {
        super(titulo, genero, creador, duracion, visto);
        this.anios = anios;
    }

    @Override
    public String toString() {
        return super.toString().concat("anios=" + anios);
    }
    
    @Override
    public void marcarVisto() {
        super.setVisto(true);
    }

    @Override
    public void esVisto() {
        System.out.println("Visto: " + super.isVisto());
    }

    @Override
    public void tiempoVisto() {
        System.out.println("Visualizacion: " + super.getDuracion());
    }
    
}
