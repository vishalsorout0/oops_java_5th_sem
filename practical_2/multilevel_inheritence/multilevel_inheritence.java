// practical 2.2
// multilevel inheritence

class Person{
    void person(){
      System.out.println("person");
    }
}
class Employee extends Person{
  void idcard(){
      System.out.println("idcard");
  }

}
class Manager extends Employee{
  void salary(){
      System.out.println("manager salary");
  }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.person();
    }
}
