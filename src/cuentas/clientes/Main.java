package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta3;
        double saldoActual;

        cuenta3 = operativa_cuenta(null);
        
        System.out.println("El saldo actual es:"+ cuenta3.estado() );

        try {
            cuenta3.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta3.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta3.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta3.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static Cuenta operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        return cuenta1;
    }
}
