/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import bll.FileConection;
import dol.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JADPA-01
 */
public class BookMenu implements IMenu {

    ArrayList<Book>a=new ArrayList<Book>();
     Scanner scan=new Scanner(System.in);
    
    @Override
    public void displayOptions() {
        System.out.println("Gestion Libro");
        System.out.println("1.Agregar");
        System.out.println("2.Ver");
        System.out.println("3.Volver");
        System.out.print("Usted ha seleccionado:");
    }

    @Override
    public void show() {
        Menu m = new Menu();
        Book b= new Book();
        int option =0;
        
        do{
            System.out.println();
             displayOptions(); 
             System.out.println();
             option = scan.nextInt();
            switch (option) {
                case 1 : {
                    System.out.println("Titulo");
                    b.setTitulo(scan.next());
                    System.out.println("Editorial");
                    b.setEditorial(scan.next());
                    System.out.println("Edición");
                    b.setEdicion(scan.next());
                    System.out.println("Año de publicación");
                    b.setAnipublicacion(scan.next());
                    a.add(b);
                    FileConection.addBook(a);
                }
                case 2 : {
                    FileConection.Mostrar("Libro");
                }
                case 3 : 
                    m.show();
                default : 
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
          } while(option!=3);
       
    }
    
    
    }
    
    

