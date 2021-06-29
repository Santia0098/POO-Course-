<?php

require_once('Car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberVan.php');

// $car = new Car("AWQ1234", new Account("Miguel", "SAHM970929"));
// $car->printData();

//$uberX = new UberX("AMQ1234", new Account("Miguel", "SAHM97092999"), "Chevrolet", "Camaro");
//$uberX->PrintDataCar();

$uberX = new UberVan("OJL395", new Account("Miguel C", "AWQ1234"), "Nissan", "sentra");
$uberX->setPassenger(4);
$uberX->printDataCar();