/** 
 ** Hecho por: Alvaro Lemus
 **Carnet: 20032297
 **Sección: AN
 **/



package workshop.orders;
import workshop.*;
import java.util.Random;

public abstract class SedanOrder extends PaintOrder {


    //constructor que recibe de parametros todos los parametros de la clase padre
    public SedanOrder (int number, String plate, int total, double time) {
        super (number, plate, total, time);
    }

    //Declaracion de variables
    int precioSedan = 100;
    

    //Metodo que devuelve el numero de placa del vehículo en modo aleatorio
    //en formato DDDLLL
    public void getPlateSedan () {
        Random ran = new Random ();
        System.out.println ("Numero de Matricula: " + ran.nextInt(10) + ran.nextInt(100) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65));
    }


    //Metodo que cambia el estado a Done cuando termina de trabajarse la orden
    public void end() {
        this.state = State.DONE;
    }


    //Metodo que devuelve el tipo de vahículo Sedan
    public String getType () {
        String s = "SEDAN";
        return s;
    }


    //Metodo que devuelve el precio total a pagar para vehiculos Sedan
    int precioTotal;
    public void getPrice (State DONE) {
        if (state == DONE) {
            precioTotal = total * precioSedan;
        } else {
            System.out.println ("?");
        }               
    }
}