public class Fish extends Animal {
    public Fish(String name, Integer age, Integer antalBen, String[] farver, Float vægt) {
        super(name, age, antalBen, farver, vægt);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " siger Blub Blub");
    }
    public void activity() {
        System.out.println(getName() + " svømmer");
    }
    public void eat() {
        System.out.println(getName() + " spiser alger");
    }
    public void sleep() {
        System.out.println(getName() + " sover i vandet");
    }
    
}
