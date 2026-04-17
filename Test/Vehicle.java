package Test;

import java.time.LocalDate;

public abstract class Vehicle {
    int numWheels;
    Vehicle(int numWheels){
        this.numWheels = numWheels;
    }
    abstract int getNumWheels();
    abstract void setNumWheels(int numWheels);

}
abstract class Car extends Vehicle{
    int gear;
    Car(int gear,int numWheels) {
        super(numWheels);
        this.gear = gear;
        
    }
    
}

class Sedan extends Car{

    Sedan(int gear, int numWheels) {
        super(gear, numWheels);
        
    }

    @Override
    int getNumWheels() {
        return numWheels;
        }

    @Override
    void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
        }

}

abstract class Bike extends Vehicle{

    Bike() {
        super(2);
        
    }
    
}
class MotorBike extends Bike{

    @Override
    int getNumWheels() {
        return numWheels;    
    }

    @Override
    void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
}

interface GasTypeSmall{
    double CAPACITY = 25;
}
interface DieselTypeSmall{
    double CAPACITY = 25;
}

class Civic extends Sedan implements GasTypeSmall{

    Civic() {
        super(6, 4);
        
    }
 
}
class Vois extends Sedan implements GasTypeSmall{

    Vois() {
        super(6,4);
        //TODO Auto-generated constructor stub
    }
 
}

class LTORegistration{
    int id;
    String Name;
    LocalDate regDate;
    Car car;

    public LTORegistration(int id, String Name, LocalDate regDate, Car car) {
        this.id = id;
        this.Name = Name;
        this.regDate = regDate;
        this.car = car;
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDate getRegDate() {
        return this.regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        LTORegistration client1 = new LTORegistration(1, "Marc Yim", LocalDate.now(), new Vois());
        client1.getCar().getNumWheels();
    }
    
}