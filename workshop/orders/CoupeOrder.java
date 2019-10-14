/** 
 ** Hecho por: Alvaro Lemus
 **Carnet: 20032297
 **Sección: AN
 **/



package workshop.orders;
import workshop.*;
import java.util.Random;

public abstract class MicrobusOrder extends PaintOrder {

    //Constructor que recibe de parametros los parametros del constructor de la clase padre
    public CoupeOrder (int number, String plate, int total, double time) {
        super (number, plate, total, time);
    }
    

    //Declaracion de variables
    int precioCoupe = 500;
    Random ran = new Random ();
    int d1 = ran.nextInt (10);
    int d2 = ran.nextInt (10);
    int d3 = ran.nextInt (10);


    //Metodo que devuelve el numero de placa del vehículo en modo aleatorio
    //en formato DDDLLL
    public void getPlateCoupe () {
        System.out.println ("Numero de Matricula: " + d1 + d2 + d3 + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65));
    }

    // Metodo que cambia el estado de la orden a DONE
    public void end() {
        this.state = State.DONE;
    }

    //Metodo que devuelve el tipo de vehículo
    public String getType () {
        String s = "COUPE";
        return s;
    }


    //Metodo que devuelve el total a pagar con descuento para Microbuses
    int precioTotal;
    public void getPrice (State DONE) {
        if (state == DONE) {
            precioTotal = ((total * precioCoupe) - ((total * precioCoupe)* ran.nextInt(9-4+1)+4)/100));
        } else {
            System.out.println ("?");
        }               
    }
}