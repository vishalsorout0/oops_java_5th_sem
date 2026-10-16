 class Student{
    int roll_number;
    String name;
    float marks1,marks2,marks3;

    // constructor
    Student(int roll,String names,float mark1,float mark2, float mark3){
        this.roll_number = roll;
        this.name = names;
        this.marks1 = mark1;
        this.marks2 = mark2;
        this.marks3 = mark3;
    }
    
    // calculate total marks
    float total_marks(){
        return marks1+ marks2 + marks3;
    } 
    // calculate percentage
    float percentage(){
        return ((marks1 + marks2 + marks3)/300)*100;
    }

    // show details
    void details(){
      System.out.println("roll_number = "+ roll_number);
      System.out.println("name = "+ name);
      System.out.println("toal marks = "+ total_marks());
      System.out.println("percentage = "+ percentage() + "%");
      System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1= new Student(197 , "sammer", 80 , 75 , 60);
        Student s2= new Student(198 , "sandeep", 70 , 55 , 90);
        Student s3= new Student(199 , "saurav", 85 , 75 , 70);
       s1.details();
       s2.details();
       s3.details();
        
    }
}
