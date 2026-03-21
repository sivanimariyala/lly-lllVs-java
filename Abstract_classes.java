abstract class Shape { 
    abstract void area(); 
} 
class Rectangle extends Shape { 
    int length = 10, breadth = 5;
  void area() { 
        System.out.println("Area of Rectangle = " + (length * breadth)); 
    } 
} 
class Circle extends Shape { 
    double radius = 7; 
    void area() { 
        System.out.println("Area of Circle = " + (3.14 * radius * radius)); 
    } 
    public static void main(String[] args) { 
        Shape s; 
        s = new Rectangle(); 
        s.area(); 
        s = new Circle(); 
        s.area(); 
    } 
} 
