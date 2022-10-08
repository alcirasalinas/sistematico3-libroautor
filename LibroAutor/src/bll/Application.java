/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dol.Author;
import ui.AuthorForm;
import ui.Menu;

/**
 *
 * @author JADPA-01
 */
public class Application {
    
    public static Menu mlibro= new Menu();
    
    public static void addAutor(Author a){
        
        mlibro.addAutor(a);
    }

    public static void catchAutor() {
     AuthorForm af = new AuthorForm();
     addAutor((Author) af.catchAutor());
     
    }
    
    
}
