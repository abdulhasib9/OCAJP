public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(); //this will print Animal on console
        Husky husky = new Husky();
    }

}

class Animal {
    public Animal(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    //every child class calls the super class constructor
    public Dog(){
        System.out.println("Dog");
    }
}
class Husky extends Dog{
    public Husky(){

    }
}
