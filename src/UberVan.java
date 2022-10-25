import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    // Aqui comento el constructor que requiere los parametros de 'seatsMaterial' y 'typeCarAccepted', por facilidad y utilizar un constructor mas sencillo como el que esta en la linea 8
//    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
//        super(license, driver);
//        this.typeCarAccepted = typeCarAccepted;
//        this.seatsMaterial = seatsMaterial;
//    }

    // Aqui la palabra clave Override indica que estamos sobreescribiendo un metodo de la clase padre y al hacer esto estamos aplicando Polimorfismo
    @Override
    public void setPassengers(int passengers) {
        if (passengers == 6){
            this.passengers = passengers;
        }
        else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
