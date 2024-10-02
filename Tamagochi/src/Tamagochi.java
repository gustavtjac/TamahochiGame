import java.util.Scanner;

public class Tamagochi {
    protected int age;
    protected String name;
    protected String gender;
    protected int hunger;
    protected boolean isAlive;
    protected static int count = 0;

    public Tamagochi(String name, String gender) {
        this.age = 0;
        this.name = name;
        this.gender = gender;
        this.hunger = 5;
        this.isAlive = true;
        count++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    public int getHunger() {
        return hunger;
    }
    public boolean isAlive() {
            return isAlive;

    }
    public void addAge(int age) {
this.age += age;
    }
    public void changeName(String name) {
        this.name = name;
    }
    public void feed(){
        this.hunger += 1;
    }
    public void deFeed(){
        this.age -= 1;
    }
public static int getCount() {
        return count;
}
    public String toString() {
        if (isAlive) {
            return "Din Tamagochi hedder " + this.name + " Den er " + this.age + " år gammel. Dens køn er " + this.gender + ".";
        }
return "Din tamagochi er død";
    }

    }

