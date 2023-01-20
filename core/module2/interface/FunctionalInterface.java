@FuntionalInterface
interface A {
  void run();
}

public class FunctionalInterface {
  
  public static void main(String[] args) {
    
    A obj = () -> System.out.println("Hello All");
    obj.run();
    
  }
  
}
