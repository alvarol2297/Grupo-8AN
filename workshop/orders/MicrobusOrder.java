/** 
 ** Hecho por: Alvaro Lemus
 **Carnet: 20032297
 **Sección: AN
 **/



package workshop.orders;
import workshop.*;
import java.util.Random;

public abstract class MicrobusOrder extends PaintOrder {

    public MicrobusOrder (int number, String plate, int total, double time) {
        super (number, plate, total, time);
    }
    
    int precio = 1000;
    Random ran = new Random ();
    int d1 = ran.nextInt (10);
    int d2 = ran.nextInt (10);
    int d3 = ran.nextInt (10);
    //Metodo que devuelve el numero de placa del vehículo en modo aleatorio
    //en formato DDDLLL
    public void getPlateMicro () {
        System.out.println ("Numero de Matricula: " + d1 + d2 + d3 + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65) + (char)(ran.nextInt(90-65+1)+65));
    }


    public void end() {
        this.state = State.DONE;
    }

    public String getType () {
        String s = "MICROBUS";
        return s;
    }

    int precioTotal;
    public void getPrice (State DONE) {
        if (state == DONE) {
            precioTotal = ((total * precio) - ((total * precio)* d3) /100);
        } else {
            System.out.println ("?");
        }               
    }
}