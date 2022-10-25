public class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        // Utilizamos la palabra reservada super para referirnos a la clase padre, que en este caso es la clase Car
        super(license, driver);

        // super hace referencia a los atributos y metodos de la clase padre, y this hace referencia a los atributos y metodos de la clase hija
        this.brand = brand;
        this.model = model;
    }

    // Aqui podemos ver el polimorfismo aplicado con el metodo de 'printDataCar', el cual se comporta diferente con UberX ya que me muestra la marca y el modelo del vehiculo
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Marca: " + brand + ", Modelo: " + model);
    }
}
