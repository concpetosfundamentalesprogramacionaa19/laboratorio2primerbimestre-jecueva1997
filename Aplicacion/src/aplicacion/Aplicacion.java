/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Scanner;

/**
 *
 * @author reati
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int repor = 0;
        String nom_p = "";
        float sueld = 0;
        int num_h = 0;
        float pasaj = 0;
        float bar = 0;
        float salid = 0;
        float tota_pas = 0;
        float tota_bar = 0;
        float tota_sald = 0;
        String cadena = "";
        String opcion = "";
        
        while(bandera){
            
            System.out.println("Número de Reporte ");
            repor = entrada.nextInt();
            System.out.println("Nombre del padre de familia");
            nom_p = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Sueldo semanal del padre de familia");
            sueld = entrada.nextFloat();
            System.out.println("Número de hijos");
            num_h = entrada.nextInt();
            entrada.nextLine();
            
            if(num_h >=1){
            for (int contador = 1; contador <= num_h; contador++){
                
                System.out.println("Gasto semanal en pasajes por cada "
                        + "hijo");
                
                pasaj = entrada.nextFloat();
                tota_pas = tota_pas + pasaj;
                      
                System.out.println("Gastos en bar por cada hijo");
                bar = entrada.nextFloat();
                tota_bar = tota_bar + bar;
                    
                System.out.println("Gastos en salidas por cada hijo");
                salid = entrada.nextFloat();
                tota_sald = tota_sald + bar;
                }
            num_h = num_h + 1;
            }
            
            if (tota_pas <= sueld){
            System.out.print("El padre de familia le alcanza el dinero "
                    + "semanal para sus gastos");
            } else {
            System.out.printf("El padre de familia no le alcanza el dinero "
                    + "semanal para sus gastos");
            
            }
            System.out.printf("Reporte de Gastos%f\n\n Persona%s\n\n "
                    + "Pasajes%f\n bar%f\n ", nom_p, tota_pas,tota_bar, 
                    tota_sald);
        
        }
    }
    
}
