package cuentas;

/**
 Clase que representa una cuenta bancaria.
 Permite realizar operaciones básicas como consultar el saldo, ingresar dinero y retirar dinero.

 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número identificador de la cuenta. */
    private String cuenta;

    /** Saldo actual disponible en la cuenta. */
    private double saldo;

    /** Tipo de interés asociado a la cuenta. */
    private double tipoInterés;

    /**
      Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
      Constructor con parámetros.
      @param nom  nombre del titular
      @param cue  número de cuenta
      @param sal  saldo inicial
      @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
      Devuelve el saldo actual de la cuenta.
      @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
      Ingresa una cantidad en la cuenta.
      @param cantidad cantidad a ingresar mayor o igual que 0
      @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
      Retira una cantidad de la cuenta.
      @param cantidad cantidad a retirar mayor que 0
      @throws Exception si la cantidad es menor o igual que 0, o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
      Devuelve el nombre del titular.
      @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
      Cambia el nombre del titular.
      @param nombre nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
      Devuelve el número de cuenta.
      @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
      Cambia el número de cuenta.
      @param cuenta nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
      Devuelve el saldo.
      @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
      Cambia el saldo.
      @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
      Devuelve el tipo de interés.
      @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
      Cambia el tipo de interés.
      @param tipoInterés nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

