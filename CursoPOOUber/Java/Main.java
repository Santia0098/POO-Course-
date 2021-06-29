class Main {
    public static void main(String[] args) {
        //System.out.println("Hola");
        //UberX uberX = new UberX("AMQ123", new Account("Miguel E", "SAHM970929"), "chevrolet", "CAMARO");
        //uberX.setPassenger(4);
        //uberX.dataCar();

        UberVan uberVan = new UberVan("AMQ1234", new Account("Miguel E", "SAHM970929"));
        uberVan.setPassenger(6);
        uberVan.dataCar();
        
        
    }
}