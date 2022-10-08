/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dol.Author;
import java.util.Scanner;

/**
 *
 * @author JADPA-01
 */
public class Menu implements IMenu {

    Scanner scan = new Scanner (System.in);
    
    @Override
    public void displayOptions() {
        System.out.println("Gestion de Libro-Autor");
        System.out.println("1. Autor");
        System.out.println("2. Libros");
        System.out.println("3. Salir");
        System.out.print("Usted ha seleccionado:");
    }

    @Override
    public void show() {
          int option =0;
          
         do{
           displayOptions();
             System.out.println();
             System.out.println();
             option = scan.nextInt();
             
             switch(option){
                 case 1:
                     AuthorMenu a = new AuthorMenu();
                     a.show();
                     break;
                 case 2:
                      BookMenu b = new BookMenu();
                      b.show();
                     break;
                 case 3:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Usted ha salido");
             }
       
    } while(option!=3);
                 }

    public void addAutor(Author a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
