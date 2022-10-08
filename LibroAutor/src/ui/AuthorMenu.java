/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bll.Application;
import dol.Author;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JADPA-01
 */
public class AuthorMenu implements IMenu {

    Scanner scan = new Scanner (System.in);
        
    @Override
    public void displayOptions() {
        
        System.out.println("Gestion Autor");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar empleados");
        System.out.println("3. Volver");
		
    }

    @Override
    public void show() {

         int i=0;
         ArrayList<Autor>a=new ArrayList<Autor>();
         Author b=new Author();
        
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
                      a.setNombre(scan.next());
       
                      System.out.println("Ingrese el seudonimo:");
                      a.setPseudonimo(scan.next());
       
                     System.out.println("Ingrese la nacionalidad:");
                     a.setPseudonimo(scan.next());
                     
                     
                 }
                     
                     break;

                 case 2:
                      
                      
                     break;
                 case 3:
                     
                     break;
                 default:
                     System.out.println("Usted ha salido");
             }
       
    } while(option!=3);
         
    }
    
}
