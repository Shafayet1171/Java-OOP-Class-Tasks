// Car Problem

public class car {
    private String owner;
    private String brand;
    private String serial;
    boolean startEngine=false;
    boolean fuelFull=true;
    
    car(String owner,String brand,String serial) {
        this.owner=owner;
        this.brand=brand;
        this.serial=serial;
    }

    void engine () {
       if(startEngine) System.out.println("Engine is on.");
       else System.out.println("Engine is off.");
    }

    void fuel() {
        if(fuelFull) {
            System.out.println("The engine is full of fuel,there's no need to refuel anytime soon.");
        }
        else {
            System.out.println("Fuel level is low.");
        }
    }

    void printInfo() {
        System.out.println("Car owner : "+owner+",Car brand : "+brand+" & Serial : "+serial);
    }
    
    public static void main (String [] args) {
         car car1 = new car("Shafayet","Toyota","7624HT7");
         car1.printInfo();
         car1.engine();
         car1.fuel();
         car car2 = new car("Sifat","Honda","38754RK9");
         car2.startEngine=true;
         car2.fuelFull=false;
         car2.printInfo();
         car2.engine();
         car2.fuel();
    }
}

// Pet Problem

public class pet {
    private String name;
    private int age;
    private String breed;

    pet(String name,int age,String breed) {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    
    void bark() {
        System.out.println("Woof woof!");
    }

    void spin() {
        System.out.println("The dog spins around in a circle!");
    }

    void run() {
        System.out.println("The dog is running!");
    }

    void printInfo() {
        System.out.println("The dogs name is "+name+" & age is "+age+".The breed of the dog is "+breed);
    }

    public static void main (String [] args) {
        pet dog = new pet("Shakky",3,"golden retriever");
        dog.printInfo();
        dog.bark();
        dog.spin();
        dog.run();
    }
}
