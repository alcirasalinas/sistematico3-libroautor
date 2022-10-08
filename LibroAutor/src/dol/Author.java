/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author JADPA-01
 */
public class Author {
 
    private String Nombre;
    private String Pseudonimo;
    private String Nacionalidad;

    
    public Author(){
        
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPseudonimo() {
        return Pseudonimo;
    }

    public void setPseudonimo(String Pseudonimo) {
        this.Pseudonimo = Pseudonimo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public Author(String Nombre, String Pseudonimo, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Pseudonimo = Pseudonimo;
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Author{" + "Nombre=" + Nombre + ", Pseudonimo=" + Pseudonimo + ", Nacionalidad=" + Nacionalidad + '}';
    }
    
}
