/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borradordetareas;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class BorradorDeTareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here {}
        System.out.println("------------------------[Ejercicio 1]-----------------------------");
        Scanner miConsola = new Scanner( System.in);
        System.out.println(" Ingrese un numero del 1 al 5 ");
        int opcion;
        opcion= miConsola.nextInt();
        switch (opcion){
            case 1:
                 System.out.println("Activaste el numero Uno");
                break;
            case 2:
                 System.out.println("Activaste el numero Dos");
                break;    
            case 3:
                 System.out.println("Activaste el numero Tres");
                break;    
            case 4:
                 System.out.println("Activaste el numero Cuatro");
                break;   
            case 5:
                 System.out.println("Activaste el numero Cinco");
                break;    
        }
        System.out.println("------------------------[Ejercicio 2]-----------------------------");
        System.out.println(" Escriba una accion a realizar (correr, ver, mover, saltar, caminar) ");
        String accion = miConsola.next(); ;
        switch (accion){
            case "correr":
                 System.out.println("Estas corriendo");
                break;
            case "mover":
                 System.out.println("Estas moviendo algo");
                break;    
            case "saltar":
                 System.out.println("Estas saltando");
                break;    
            case "ver":
                 System.out.println("Estas viendo");
                break;   
            case "caminar":
                 System.out.println("Estas caminando");
                break;    
        }
        System.out.println("------------------------[Ejercicio 3]-----------------------------");
        System.out.println(" Mi horario");
        System.out.println(" Ingrese un numero de hora ");
        int hora;
        hora= miConsola.nextInt();
        switch (hora){
            case 7:
                 System.out.println(" Despertarce ");
                break;
            case 8:
                 System.out.println(" Desayunar ");
                break;    
            case 9,10,11,12,13,14:
                 System.out.println(" Estar en clases ");
                break;    
            case 15:
                 System.out.println(" Almorzar ");
                break;   
            case 16,17:
                 System.out.println(" Descansar / Hacer tarea");
                break;    
            case 18:
                 System.out.println(" Bañarme ");
                break;    
            case 19,20,21:
                 System.out.println(" Hacer tarea / Estar en clases de LP1 (Si es Jueves o viernes) ");
                break;
            case 22:
                 System.out.println(" Cenar ");
                break;    
            case 23,24,1,2,3,4,5,6:
                 System.out.println("");
                break;    
        }
        System.out.println("------------------------[Ejercicio 4]-----------------------------");
        //para cambiar tipo de semana cambiar entre true y false en el valor booleano declarado
        boolean semana = true;
        if(semana == true)   {
             System.out.println(" Semana Inglesa ");
            int dia;
            dia= miConsola.nextInt();
            switch (dia){
            case 1:
                 System.out.println(" DOMINGO ");
                break;
            case 2:
                 System.out.println(" LUNES ");
                break;    
            case 3:
                 System.out.println(" MARTES ");
                break;    
            case 4:
                 System.out.println(" MIERCOLES ");
                break;   
            case 5:
                 System.out.println(" JUEVES ");
                break;    
            case 6:
                 System.out.println(" VIERNES ");
                break;   
            case 7:
                 System.out.println(" SABADO ");
                break;       
        }} else {
            System.out.println(" Semana Laboral ");
            int diaX;
        diaX= miConsola.nextInt();
            switch (diaX){
            case 1:
                 System.out.println(" LUNES ");
                break;
            case 2:
                 System.out.println(" MARTES ");
                break;    
            case 3:
                 System.out.println(" MIERCOLES ");
                break;    
            case 4:
                 System.out.println(" JUEVES ");
                break;   
            case 5:
                 System.out.println(" VIERNES ");
                break;    
            case 6:
                 System.out.println(" SABADO ");
                break;   
            case 7:
                 System.out.println(" DOMINGO ");
                break;      
        }
    }

       
    }
    }
    

