public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;
    
    public Car (String license, Account driver ) {
        this.license = license;
        this.driver = driver;
    }

    void dataCar() {

        if ( passenger != null ){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenegers: " + passenger);
        } 
    } 

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if ( passenger == 4 ){ 
            this.passenger = passenger;
        } else {
            System.out.println("Debes asignar al menos 4 pasajeros");
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
