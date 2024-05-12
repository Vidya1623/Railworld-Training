//Method overloading-

public class Adder {
  public static int add(int a, int b) {
    return a + b;
  }

  public static double add(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(Adder.add(11, 11));  // Output: 22
    System.out.println(Adder.add(11.5, 11.5));  // Output: 23.0
  }
}


//Method overriding-


//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle{  
  void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike extends Vehicle{  
  public static void main(String args[]){  
  //creating an instance of child class  
  Bike obj = new Bike();  
  //calling the method with child class instance  
  obj.run();  
  }  
}  
