from car import Car 
from account import Account

if __name__ == "__main__":
    print("hola mundo")
    car = Car("AMQ1234", Account("Miguel", "SAHM970929"))
    print(vars(car))
    print(vars(car.driver))
