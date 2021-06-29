var car = new Car("AMQ", new Account("Miguel", "sahm"));
car.passenger = 4;
car.printData();

var uberX = new UberX("AQM1234", new Account("Miguel E S", "SAHM"), "Chevrolet", "Camaro")
uberX.passenger = 4;
uberX.printData();

var user = new User("Miguel", "SAHM970929A","miguel@gmail.com", "pass");
user.printData();

var user = new Driver("Miguel", "SAHM970929D","miguel@gmail.com", "pass");
user.printData();