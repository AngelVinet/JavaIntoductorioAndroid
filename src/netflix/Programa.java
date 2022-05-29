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
public class Programa {
    
    private String titulo;
    private String genero;
    private String creador;
    private String duracion;
    private boolean visto = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public Programa() {
    }

    public Programa(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Programa(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }
    
    

    public Programa(String titulo, String genero, String creador, String duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = visto;
    }

    @Override
    public String toString() {
        return "Programa{" + "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion + ", visto=" + visto + '}';
    }
    
    
    
}
