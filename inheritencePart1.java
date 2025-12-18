class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal{
    private boolean isIndoor;

    public Cat(String name,int age,boolean isIndoor){
        super(name,age);
        this.isIndoor=isIndoor;
    }

    public boolean getIsIndoor(){
        return isIndoor;
    }

    @Override
    public void makeSound(){
        System.out.println("The cat meows.");
    }
}

public class inheritencePart1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Rickey", 5);
        Dog dog = new Dog("Gris", 3, "Germanshepherd");
        Cat cat = new Cat("Misty",2,true);

        animal.makeSound();
        System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");

        dog.makeSound();
        System.out.println(dog.getName()+" is "+dog.getAge()+" years old and is a "+dog.getBreed()+".");

        cat.makeSound();
        System.out.println(cat.getName()+" is "+cat.getAge()+" years old and is : "+(cat.getIsIndoor() ? "indoor":"outdoor"));
    }
}
