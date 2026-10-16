// practical 2.1
// single inheritence

class Vehicle{
void horn(){
  System.out.println("poooooooooooo...");
}
}
class Car extends Vehicle{
  void seat(){
  System.out.println("4 seats");
  }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.horn();
        
    }
}

