class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Animal obj= new Dog();
        obj.sound(); 
    }
}