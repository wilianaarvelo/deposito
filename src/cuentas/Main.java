package cuentas;

public class Main {

    public static void main(String[] args) {

        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        operativa_cuenta(cuenta1, 695.0f);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

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
