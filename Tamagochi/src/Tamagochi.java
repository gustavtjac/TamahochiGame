import java.util.Scanner;

public class Tamagochi {
    protected int age;
    protected String name;
    protected String gender;
    protected int hunger;
    protected boolean isAlive;
    protected static int count = 0;
    protected int mood;
    protected int energy;

    public Tamagochi(String name, String gender) {
        this.age = 0;
        this.name = name;
        this.gender = gender;
        this.hunger = 5;
        this.isAlive = true;
        this.mood = 5;
        this.energy = 10;
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
    public void addAge() {
this.age +=1;
    }
    public void changeName(String name) {
        this.name = name;
    }
    public void feed(){
        if (this.hunger == 9) {
            this.hunger += 1;
        } else if (this.hunger <=8) {
            this.hunger += 2;
        }else {
            this.hunger = 10;
        }
    }
    public void deFeed(){
        this.hunger -= 1;
    }
public static int getCount() {
        return count;
}
    public String toString() {
        if (isAlive) {
            return "Din Tamagochi hedder " + this.name + " \nDen er " + this.age + " år gammel. \nDens køn er " + this.gender + ".\nDens mood er: " + this.mood;
        }
return "Din tamagochi er død";
    }
    public void getStats(){
        System.out.println("Alder: " + this.age + "/30");
        System.out.println("Mæthed: " + this.hunger +"/10");
        System.out.println("Humør: " + this.mood+"/10");
        System.out.println("Energi: " + this.energy+"/10");

    }
    public void getMenu(){
        System.out.println("1: Fodrer din hund");
        System.out.println("2: Leg med din hund");
        System.out.println("3. Få din hund til at sove");
        System.out.println("4. Ignorer din hund");
        System.out.println("5. Giv den et nakkeskud ;)");
    }

    public void addEnergi(){
       this.energy =10;
    }
    public void remEnergi(){
        this.energy -=2;
    }
    public int getMood() {
        return this.mood;
    }
    public void addOneMood() {
       if(this.mood<=9){
        this.mood += 1;}
       else {
           this.mood =10;
       }
    }
    public void remOneMood() {
        this.mood -= 1;
    }
    public void addTwoMood() {
        if (this.mood<=8){
       this.mood += 2;}
        else {
            this.mood = 10;
        }
    }
    public void remTwoMood() {
        this.mood -= 2;
    }
    public String surDyr(){
        return "!??!?!!!!!? WWHREARRARARH";
    }
public void kill(){
        this.isAlive = false;
}
    }

