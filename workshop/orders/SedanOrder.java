/** 
 ** Hecho por: Alvaro Lemus
 **Carnet: 20032297
 **Sección: AN
 **/



package workshop.orders;
import workshop.*;
import java.util.Random;

public abstract class SedanOrder extends PaintOrder {

    public SedanOrder (int number, String plate, int total, double time) {
        super (number, plate, total, time);
    }
    

    //Metodo que devuelve el numero de placa del vehículo en modo aleatorio
    //en formato DDDLLL
    public void getPlate () {
        Random ran = new Random ();
        System.out.println ("Numero de Matricula: " + ran.nextInt(10) + ran.nextInt(100) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65));
    }


    public void end() {
        this.state = State.DONE;
    }

    public String getType () {
        String s = "SEDAN";
        return s;
    }

    int precioTotal;
    public void getPrice (State DONE) {
        if (state == DONE) {
            precioTotal = total * 1000;
        } else {
            System.out.println ("?");
        }               
    }
}