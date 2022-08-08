/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluable_4;

import java.util.Scanner;

/**
 *
 * @author alexruedadev
 */

public class DawBank {


        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mov = 0;
        int opcion;

        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a DawBank. Si desea abrir una cuenta, introduzca los siguientes datos.");
        System.out.println("Nombre y apellidos del titular: ");
        cuenta.titular = sc.nextLine();
        cuenta.setIbanAleatorio();
        System.out.println("Su cuenta ha sido creada.");
        
        do{
            System.out.println("¿Qué desea hacer ahora?");
            System.out.println("1. Mostrar datos de la cuenta.");
            System.out.println("2. Mostrar IBAN.");
            System.out.println("3. Mostrar Titular.");
            System.out.println("4. Mostrar saldo disponible.");
            System.out.println("5. Ingresar dinero.");
            System.out.println("6. Retirar dinero.");
            System.out.println("7. Mostrar últimos movimientos.");
            System.out.println("8. Salir.");
            
            opcion = sc.nextInt();
            if( opcion > 0 && opcion < 9){
                
                    switch(opcion){
                        case 1:
                            System.out.print("IBAN: ES");
                            for (int i = 0; i < cuenta.numerosIban.length; i++){
                            System.out.print(cuenta.numerosIban[i]);
                            }
                            System.out.println();
                            System.out.println("Titular: " + cuenta.getTitular());
                            System.out.println("Saldo disponible: " + cuenta.getSaldo() + "€");
                            break;
                        case 2:
                            System.out.print("IBAN: ES");
                            for (int i = 0; i < cuenta.numerosIban.length; i++){
                            System.out.print(cuenta.numerosIban[i]);
                            }
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Titular: " + cuenta.getTitular());
                            break;
                        case 4:
                            System.out.println("Saldo disponible: " + cuenta.getSaldo() + "€");
                            break;
                        case 5:
                            System.out.println("¿Cuanto dinero desea ingresar? ");
                            int ingreso = sc.nextInt();
                            if(ingreso < 0){
                                System.err.println("Cifra incorrecta. Solo números positivos.");
                                break;
                            }
                            cuenta.saldo = cuenta.saldo + ingreso;
                            cuenta.comprobarSaldo(ingreso);
                            cuenta.comprobarIngreso(ingreso);
                            cuenta.registrarIngreso(ingreso, mov);
                            mov++;
                            break;
                        case 6:
                            System.out.println("¿Cuanto dinero desea retirar? ");
                            int retiro = sc.nextInt();
                            if(retiro < 0){
                                System.err.println("Cifra incorrecta. Solo números positivos.");
                                break;
                            }
                            cuenta.saldo = cuenta.saldo - retiro;
                            cuenta.comprobarSaldo(retiro);
                            cuenta.registrarRetiro(retiro, mov);
                            mov++;
                            break;
                        case 7:
                            System.out.println("Movimientos: " + mov);
                            for (int i = 0; i < mov; i++){
                            System.out.println(i+1 + ". " + cuenta.movimientos[i] + "€");
                            }
                            System.out.println();
                            break;
                        case 8:
                            break;
                    }
            }else{
                System.err.println("Opción incorrecta. Porfavor, introduzca un numero del 1 al 8.");
            }
            

        }while(opcion!=8);
        System.out.println("Gracias por su visita. Hasta la próxima.");
    }
    
}
