class Person { 
    void personalDetails() { 
        System.out.println("Personal Details:"); 
        System.out.println("Name   : Shanmukha"); 
        System.out.println("Age    : 21"); 
        System.out.println("Gender : Male"); 
    } 
    void qualificationDetails() { 
        System.out.println("\nQualification Details:"); 
        System.out.println("Degree : B.Tech"); 
        System.out.println("Branch : CSE"); 
    } 
    public static void main(String[] args) { 
        Person p = new Person(); 
        p.personalDetails(); 
        p.qualificationDetails(); 
    } 
} 
