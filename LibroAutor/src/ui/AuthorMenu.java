/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bll.FileConection;
import dol.Author;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JADPA-01
 */
public class AuthorMenu implements IMenu {
    ArrayList<Author>a = new ArrayList<Author>();
    Menu m = new Menu();
    Scanner scan = new Scanner (System.in);
        
    @Override
    public void displayOptions() {
        
        System.out.println("Gestion Autor");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar Autor");
        System.out.println("3. Volver");
	System.out.print("Usted ha seleccionado:");	
    }

    @Override
    public void show() {

         Author au=new Author();
        
        int option =0;
         do{
             displayOptions();
             System.out.println();
             System.out.println();
             option = scan.nextInt();
             
             switch(option){
                 case 1:
                 {
                      System.out.println("Ingrese el nombre:");
                      au.setNombre(scan.next());
       
                      System.out.println("Ingrese el seudonimo:");
                      au.setPseudonimo(scan.next());
       
                      System.out.println("Ingrese la nacionalidad:");
                      au.setPseudonimo(scan.next());
                      a.add(au);
                      FileConection.addAuthor(a);
                     
                 }
                     
                     break;

                 case 2:
                      FileConection.Mostrar("Autor");
            
                     break;
                 case 3:
                     m.show();
                     break;
                 default:
                     System.out.println("Usted ha salido");
             }
       
    } while(option!=3);
         
    }
    
}
