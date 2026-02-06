package cuentas;
/**
  Clase principal del proyecto Depósito.
  Crea una cuenta y ejecuta operaciones sobre ella mediante el método operativa_cuenta.
 */
public class Main {
   /**
      Punto de entrada.
      @param args argumentos de la línea de comandos 
     */
    public static void main(String[] args) {

        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        operativa_cuenta(cuenta1, 695.0f);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }
  /**
      Realiza operaciones sobre una cuenta retirada e ingreso.
      @param cuenta1 cuenta sobre la que se realizan las operaciones
      @param cantidad cantidad que se va a ingresar en la cuenta
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad); // float
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
