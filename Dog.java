public class Dog extends Animal {
    public Dog(String name, Integer age, Integer antalBen, String[] farver, Float vægt) {
        super(name, age, antalBen, farver, vægt);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " siger Vov Vov");
    }
    public void activity() {
        System.out.println(getName() + " henter bolden");
    }
    public void eat() {
        System.out.println(getName() + " spiser kød");
    }
    public void sleep() {
        System.out.println(getName() + " sover i kurven");
    }
    
}
