/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.util.ArrayList;

/**
 *
 * @author antuan
 */
public class Netflix {

    /**
     * @param args the command line arguments
     */
    /*Clase ejecutable con ejemplos de ejecución de la aplicación*/
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ArrayList<Pelicula> peliculas = new ArrayList<>();
           
            peliculas.add(new Pelicula(2005, "Robots", "Animación/Comedia", "Cris Wedge", "01:31"));
            peliculas.add(new Pelicula(2010, "Cómo entrenar a tu dragón", "Animación", "Dreamworks Animation", "01:38"));
            peliculas.add(new Pelicula(2014, "Capitán América y el Soldado del Invierno", "Acción/Aventura", "Joe Russo, Anthony Russo", "02:16"));
            peliculas.add(new Pelicula(1982, "First Blood", " Acción/Aventura", "Ted Kotcheff", "01:33"));
            peliculas.add(new Pelicula(2003, "Terminator 3: La rebelión de las máquinas", "Acción/Ciencia ficción", "Jonathan Mostow", "01:49"));
            
            ArrayList<Serie> series = new ArrayList<>();
            series.add(new Serie(7, "The Mentalist", "Misterio", "Bruno Heller", "100:10"));
            series.add(new Serie(12, "The Big Bang Theory", "Comedia de situación", "Steven Molaro, Mike Collier, Faye Oshima Belyeu", "139:00"));
            series.add(new Serie(10, "CSI: Miami", "Misterio", "Fox", "154:10"));
            series.add(new Serie(4, "The Last Kingdom", "Historia", "Peter Hoar; Anthony Byrne; Ben Chanan; Nick Murphy", "36:00"));
            series.add(new Serie(1, "Chernóbil", "Pieza de época", "Johan Renck", "06:00"));

            peliculas.get(1).marcarVisto();
            peliculas.get(2).marcarVisto();
            peliculas.get(3).marcarVisto();

            series.get(0).marcarVisto();
            series.get(1).marcarVisto();
            series.get(2).marcarVisto();

            System.out.println("-------------------");
            System.out.println("Peliculas Vistas");
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).isVisto()) {
                    System.out.println("Pelicula: " + peliculas.get(i).getTitulo());
                    peliculas.get(i).esVisto();
                    peliculas.get(i).tiempoVisto();
                    System.out.println("-------------------");
                }
            }
            System.out.println("--------------------");
            System.out.println("Series Vistas");
            for (int i = 0; i < series.size(); i++) {
                if (series.get(i).isVisto()) {
                    System.out.println("Serie: " + series.get(i).getTitulo());
                    series.get(i).esVisto();
                    series.get(i).tiempoVisto();
                    System.out.println("------------------");
                }
            
            }
            System.out.println("---------------");
            int posicionPelicula = 0;
            int listaPelicula = 0;
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).getAnios()>listaPelicula) {
                    listaPelicula = peliculas.get(i).getAnios();
                    posicionPelicula = i;
                }
            }
            System.out.println("La pelicula más recientes es:");
            System.out.println(peliculas.get(posicionPelicula).toString());
        
            System.out.println("--------------");
            int posicionSerie = 0;
            int listaSerie = 0;
            for (int i = 0; i < series.size(); i++) {
                if (series.get(i).getNroTemporada()>listaSerie) {
                    listaSerie = series.get(i).getNroTemporada();
                    posicionSerie = i;
                }
        }
            System.out.println("La serie con mayor número de temporada es:");
            System.out.println(series.get(posicionSerie).toString());
            System.out.println("-------------------");
            System.out.println("*********************");
            
            System.out.println(peliculas.get(5));
        }catch (IndexOutOfBoundsException indexE) {
            System.out.println("Error índice ingresado sobrepasa el rango del ArrayList");
        }catch (Exception e) {
            System.out.println("Error, no se ha podido completar operación");
        }finally{
            System.out.println("Finalizando programa");
        }
        
        
    }
    
}
