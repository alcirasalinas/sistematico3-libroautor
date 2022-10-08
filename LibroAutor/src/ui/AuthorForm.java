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
public class AuthorForm {
    
   private Scanner scan = new Scanner(System.in);

    public AuthorForm() {
    }
   
   public static void addAutor(){
       
   }
   public Author catchAutor(){
       Author a = new Author ();
       
       System.out.println("Ingrese el nombre:");
       a.setNombre(scan.next());
       
       System.out.println("Ingrese el seudonimo:");
       a.setPseudonimo(scan.next());
       
       System.out.println("Ingrese la nacionalidad:");
       a.setPseudonimo(scan.next());
       
       return a;
       
       
   }

    
    }
      
        
        
        
        
     
    
    

