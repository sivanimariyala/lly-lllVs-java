class Box 
{ 
  double length; 
  double width; 
  double height; 
  double volume(double l,double w,double h) 
   { 
     length =l; 
     width =w;  
     height =h;
       return length*width*height; 
   } 
         String volume(String msg) 
 { 
     return msg; 
        } 
} 
class MethdOverload{ 
  public static void main(String[] args) 
  { 
   Box b=new Box(); 
   System.out.println(b.volume("cal volume: ") +b.volume(2,3,4)); 
   System.out.println("Method overload successful"); 
   } 
} 
