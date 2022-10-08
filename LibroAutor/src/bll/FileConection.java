/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dol.Author;
import dol.Book;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.Menu;

/**
 *
 * @author JADPA-01
 */
public class FileConection {
    
    public static String FilePatch(){
        File Data=new File("Almacen");
        return Data.getAbsolutePath();
    }
    public static void Directory(){
        File Data=new File("Data");
        Data.mkdir();
        File Archivo1=new File(FilePatch(),"Libro");
        Archivo1.mkdir();
        File Archivo2=new File(FilePatch(),"Autor");
        Archivo2.mkdir();
    }
    public static void addBook(ArrayList<Book>l){
        String txt="";
        int i=0;
        if(!l.isEmpty()){
            for(Book book:l){
                txt=l.get(i).toString()+"";
                i++;
            }
        }
        File a=new File(FilePatch()+"\\Libro",UUID.randomUUID().toString());
        try{
        a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(txt);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                }
    public static void addAuthor(ArrayList<Author>l){
        String txt="";
        int i=0;
        if(!l.isEmpty()){
            for(Author au:l){
                txt=l.get(i).toString()+"\n........................\n";
                i++;
            }
        }
        File a=new File(FilePatch()+"\\Autor",UUID.randomUUID().toString());
        try{
        a.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         try{
            BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(txt);
            p.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                }
    
    public static void Mostrar(String string) {
        int i=0;
        File a=new File(FileConection.FilePatch()+"\\"+string);
        String[] b=a.list();
        
        for(String s:b){
            System.out.println("------Algo---");
            System.out.println(OpenFile(string,b[i]));
            i++;
        }
    }
    public static String OpenFile(String b,String string) {
        String a,data="";
        try{
         File file=new File(FileConection.FilePatch()+"\\"+b,string);
         BufferedReader bw = new BufferedReader(new FileReader(file));
         while((a=bw.readLine())!=null){
             data=data+a+"\n";
         }
            return data;
        }catch(Exception e){
            return "Error";
        }
    
   
    }
 }