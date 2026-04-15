package ClassDyr.Dyr;

import java.util.Arrays;

public abstract class Animal {
    private String name;
    private Integer age;
    private Integer antalBen;
    private String[] farver;
    private Float vægt;

    public Animal(String name, Integer age, Integer antalBen, String[] farver, Float vægt) {
        this.name = name;
        this.age = age;
        this.antalBen = antalBen;
        this.farver = farver;
        this.vægt = vægt;
    }

    public String getName() {return name;}
    public void setName(String name) {
        if (name != null && name.length() > 2) { this.name = name;
        } else {System.out.println("Navn kan ikke være null eller kortere end 3 tegn.");}
    }
    public Integer getAge() {return age;}
    public void setAge(Integer age) {
        if (age != null && age > 0) { this.age = age;
        } else {System.out.println("Alder kan ikke være null eller negativ.");}
    }
    public Integer getAntalBen() {return antalBen;}
    public void setAntalBen(Integer antalBen) {
        if (antalBen != null && antalBen >= 0) { this.antalBen = antalBen;
        } else {System.out.println("Antal ben kan ikke være null eller negativ.");}
    }
    public String[] getFarver() {return farver;}
    public void setFarver(String[] farver) {
        if (farver != null) { this.farver = farver;
        } else {System.out.println("Farver kan ikke være null.");}
    }
    public Float getVægt() {return vægt;}
    public void setVægt(Float vægt) {
        if (vægt != null && vægt > 0) { this.vægt = vægt;
        } else {System.out.println("Vægt kan ikke være null eller negativ.");}
    }
    
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", antalBen=" + antalBen + ", farver=" + Arrays.toString(farver) + ", vægt=" + vægt + "}";
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public abstract void activity();
}
