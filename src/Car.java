public class Car {
    private int id;
    private String license;
    private Account driver;
    // Encapsulamiento: Al asignar el modificador de acceso 'private' para el atributo passengers, solo se puede modificar el valor del mismo dentro de la clase, como en el caso de UberX, UberBlack o UberPool que el numero de pasajeros no debe ser menor a 4.
    // Pero para el caso de UberVan no debe ser menor a 6, por lo que se presenta un Polimorfismo, entonces debemos hacer uso del modificador de acceso 'protected' para que funcione el metodo con esa nueva condicion
    protected int passengers;

    // Aqui puedo crear el metodo constructor de la clase
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    // Ahora vamos a crear un metodo para que imprima los atributos de la clase
    void printDataCar() {
        if (passengers != 0){
            System.out.println("License: " + license + "\n" + "Driver name: " + driver.name + "\n" + "Passengers: " + getPassengers());
        }
    }

    // Puedo utilizar unos metodos especiales que son 'getters' y 'setters' para validar atributos y asignar datos que estan privados, de esta forma puedo acceder y modificar el atributo 'passengers' solamente dentro de la clase
    public int getPassengers(){
        return passengers;
    }
    public void setPassengers(int passengers){
        if (passengers == 4){
            this.passengers = passengers;
        }
        else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}


