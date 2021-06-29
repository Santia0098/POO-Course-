import javax.print.event.PrintJobAdapter;

public class UberX extends Car {
    
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license,driver);
        this.brand = brand;
        this.model = model;
        
    }

    @Override
    void dataCar() {
        // TODO Auto-generated method stub
        super.dataCar();
        System.out.println("Model: " + model + " Brand: " + brand);

    }
}