/*
Evaluable 4 - DAW - Programación - Tema 8
 */
package Evaluable_4;

/**
 *
 * @author alexruedadev
 */
public class CuentaBancaria {
    String titular;
    int saldo;
    final int movimientos[] = new int[100];
    final int numerosIban[] = new int[22];
    final int saldoMinimo = -50;
    final int ingresoMax = 3000;

public void CuentaBancaria(int numerosIban[], String titular, int saldo, int movimientos[]){
    this.numerosIban[22] = numerosIban[22];
    this.titular = titular;
    this.saldo = saldo;
}

public int getIban(){
    return numerosIban[22];
}
public void setIban(int numerosIban[]){
    this.numerosIban[22] = numerosIban[22];
}
public String getTitular(){
    return titular;
}
public void setTitular(String titular){
    this.titular = titular;
}
public int getSaldo(){
    return saldo;
}
public void setSaldo(int saldo){
    this.saldo = saldo;
}
public int getIngreso(){
    return saldo;
}
public void setIngreso(int ingreso){
    this.saldo = saldo + ingreso;
}
// Registra el ingreso en los movimientos.
public void registrarIngreso(int ingreso, int mov){
        for (int i = 0; i <= mov; i++) {
            movimientos[mov] = ingreso;
        }
}
// Registra el retiro en los movimientos.
public void registrarRetiro(int retiro, int mov){
        for (int i = 0; i <= mov; i++) {
            movimientos[mov] = - retiro;
        }
}
// Genera numero IBAN aleatorio y lo almacena en un vector.
public void setIbanAleatorio(){
    for (int i = 0; i < numerosIban.length; i++) {
            numerosIban[i] = (int) (Math.random() * 10);
        }
}
// Comprueba si el saldo es inferior a -50€ y cancela la operación.
public void comprobarSaldo(int retiro){ 
    if(this.saldo < -50){
        this.saldo = this.saldo + retiro;
        System.err.println("AVISO: Saldo negativo. Operación cancelada.");
    }
}
// Comprueba si el ingreso es superior a 3000 para avisar a hacienda.
public void comprobarIngreso(int ingreso){
    if(ingreso > ingresoMax){
    System.err.println("AVISO: Notificar a hacienda.");
    }
}
}


