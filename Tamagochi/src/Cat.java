public class Cat extends Tamagochi {
    protected int congoLængde;

    public Cat(String name, String gender) {
        super(name,gender);
        this.age=0;
        this.hunger=5;
        this.isAlive=true;
        this.congoLængde = 1;
        count++;
    }
    public void addCongoLængde(int CongoLænge){
        this.congoLængde+= CongoLænge;
    }
public String sound(){
        return "MEEEEOOOOOOOOOOOOOOOOOOOOOOOOW";
}


}

