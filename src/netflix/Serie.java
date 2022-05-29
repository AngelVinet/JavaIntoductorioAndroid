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
public class Serie extends Programa implements Visualizable{
    
    private int nroTemporada;

    public int getNroTemporada() {
        return nroTemporada;
    }

    public void setNroTemporada(int nroTemporada) {
        this.nroTemporada = nroTemporada;
    }

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }
    
    

    public Serie(int nroTemporada, String titulo, String genero, String creador, String duracion) {
        super(titulo, genero, creador, duracion);
        this.nroTemporada = nroTemporada;
    }

    @Override
    public String toString() {
        return super.toString().concat("Número de temporadas: " + nroTemporada); //To change body of generated methods, choose Tools | Templates.
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
