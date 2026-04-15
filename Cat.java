public class Cat extends Animal {   
    public Cat(String name, Integer age, Integer antalBen, String[] farver, Float vægt) {
        super(name, age, antalBen, farver, vægt);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " siger Miau");
    }
    public void activity() {
        System.out.println("Klør i sofaen");
    }
    public void eat() {
        System.out.println("Katten spiser fisk");
    }
    public void sleep() {
        System.out.println("Katten sover i solen");
    }

}
