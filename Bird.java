public class Bird extends Animal {
    public Bird(String name, Integer age, Integer antalBen, String[] farver, Float vægt) {
        super(name, age, antalBen, farver, vægt);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " siger piplyde");
    }
    public void activity() {
        System.out.println("Fuglen flyver");
    }
    public void eat() {
        System.out.println("Fuglen spiser frø");
    }
    public void sleep() {
        System.out.println("Fuglen sover i reden");
    }
    
}
