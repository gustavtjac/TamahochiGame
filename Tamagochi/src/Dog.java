public class Dog extends Tamagochi {
    protected int haleLænge;

    public Dog(String name, String gender) {
        super(name,gender);
        this.age=0;
        this.hunger=5;
        this.isAlive=true;
        this.haleLænge = 0;
        count++;
    }
    public void addHaleLængde(int haleLænge){
        this.haleLænge+= haleLænge;
    }
    public String sound(){
        return "Woof";
    }
    public void getMenu(){
        System.out.println("1: Fodrer din hund");
        System.out.println("2: Leg med din hund");
        System.out.println("3. Få din hund til at sove");
        System.out.println("4. Ignorer din hund");
        System.out.println("5. Giv den et nakkeskud ;)");
    }



}
