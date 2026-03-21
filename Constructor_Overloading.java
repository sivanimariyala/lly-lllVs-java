class Student { 
    Student() { 
        System.out.println("Default Constructor Called"); 
    } 
    Student(String name, int age) { 
        System.out.println("Name : " + name); 
        System.out.println("Age  : " + age); 
    } 
    public static void main(String[] args) { 
        Student s1 = new Student(); 
        Student s2 = new Student("Shanmukha", 21); 
    } 
} 
