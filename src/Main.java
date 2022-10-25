public class Main {
    public static void main(String[] args) {

//        El compilador de Java ya tiene un metodo constructor por defecto para todos los objetos
//        Car car = new Car();
//        car.license = "KHH889";
//        car.driver = "Guillermo Leon";
//        car.passengers = 5;
//        System.out.println("Car license: " + car.license);

        // Inicializamos un objeto de la clase Car con el metodo constructor que creamos
//        Car car = new Car("KHH889", new Account("Guillermo Leon", "123456789", "guillermo@platzi.com", "guillermo123"));
//        car.printDataCar();
//
//        Car car2 = new Car("GVO220", new Account("Paola Montoya", "123456788", "paola@platzi.com", "paola123"));
//        car2.printDataCar();

        // Creemos una instancia de la clase UberX que es de la familia Car
        Driver driver = new Driver("Laura Oquendo", "LYO123", "laura@platzi.com", "laura456");

        UberX uberX = new UberX("IAS369", driver, "Toyota", "Fortuner");
        // El atributo passengers al ser privado solo se puede acceder utilizando el metodo especial 'setPassengers'
        uberX.setPassengers(4);
        uberX.printDataCar();
        System.out.println(uberX.getDriver().email);

        // Ahora agreguemos un objeto de tipo UberVan
        Driver driver2 = new Driver("Alejandro Sierra", "AS456", "alejandro@platzi.com", "alejandro123");
        UberVan uberVan = new UberVan("HZM015", driver2);
        uberVan.setPassengers(6);
        uberVan.printDataCar();

        // Agreguemos un metodo de pago de un usuario con tarjeta
        Card card = new Card(001, 100200300, 456, "12/22");
        System.out.println(card.cvv);
    }
}
