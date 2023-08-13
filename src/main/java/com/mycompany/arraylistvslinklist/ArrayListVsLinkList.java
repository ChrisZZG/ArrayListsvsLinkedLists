/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraylistvslinklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class ArrayListVsLinkList {

    public static void main(String[] args) {
        
        System.out.println("------ ARRAY LIST ----------");
        
        List<Persona> arrayL = new ArrayList<Persona> ();
        
        //Agregar Elementos .add()
        arrayL.add(new Persona(1, "Susana", 30));
        arrayL.add(new Persona(2, "Gimena", 25));
        
        //Eliminar Elementos .remove(index)
        arrayL.remove(1);
        
        //Mostrar el ArrayList luego de la eliminacion
        for(int i=0; i<arrayL.size(); i++){
            System.out.println("Nombre: " + arrayL.get(i).getNombre());
        }
        
        System.out.println("------ LINKED LIST ----------");
        
        List<Persona> linkedL = new LinkedList<Persona> ();
        
         //Agregar Elementos .add()
         linkedL.add(new Persona(1, "Mogwli", 25));
         linkedL.add(new Persona(2, "Jungkook", 29));
         linkedL.add(new Persona(3, "Rafaela", 45));
         
         //Eliminar Elemento - Necesito encontrar la coincidencia
         for(Persona perso:linkedL){
             if(perso.getNombre().equalsIgnoreCase("jungkook")){
                 linkedL.remove(perso);
                 break;
             }
         }
         
         //Mostrar Arraylist luego de la Eliminacion
         for(Persona perso:linkedL){
             System.out.println("Nombre: " + perso.getNombre());
         }
         
         //METODOS DE TRABAJO
         //Tamañao de la Lista para ArrayList y Linked List
         System.out.println("Tamaño del ArrayList: " + arrayL.size());
         System.out.println("Tamaño de la Linked List: " + linkedL.size());
         
       
         System.out.println("Esta Vacia ? : " + arrayL.isEmpty());
         System.out.println("Esta Vacia? : " + linkedL.isEmpty());
    }
}
