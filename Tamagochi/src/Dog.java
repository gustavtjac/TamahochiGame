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


}
