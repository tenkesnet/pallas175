package roo;

public class Kangaroo {
    String name;
    int age;
    
    void Kangaroo(String name, int age) {
        name = this.name; 
        age = this.age;
    }
    
    String Kangaroo(int legs){
        System.out.println("A kengurunak " + legs + " laba van.");
    }
    
    void display(String country){
        System.out.println( "A kenguru neve: " + name + ", lakohelye: " + country );	
        System.out.println(  "A kenguru kora: " + age++);
    }
}
