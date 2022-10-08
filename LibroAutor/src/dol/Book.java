/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

import java.util.Date;

/**
 *
 * @author JADPA-01
 */
public class Book {
    
  public String Titulo;
  public String Editorial;
  public String Edicion;
  public String anipublicacion;
  
    public Book(){
        
    }

    public Book(String Titulo, String Editorial, String Edicion, String anipublicacion) {
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Edicion = Edicion;
        this.anipublicacion = anipublicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getAnipublicacion() {
        return anipublicacion;
    }

    public void setAnipublicacion(String anipublicacion) {
        this.anipublicacion = anipublicacion;
    }

    @Override
    public String toString() {
        return "Book{" + "Titulo=" + Titulo + ", Editorial=" + Editorial + ", Edicion=" + Edicion + ", anipublicacion=" + anipublicacion + '}';
    }
           
    
}
