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
    public void getMenu(){
        System.out.println("1: Fodrer din kat");
        System.out.println("2: Leg med din kat");
        System.out.println("3. Få din kat til at sove");
        System.out.println("4. Ignorer din kat");
        System.out.println("5. Giv den et nakkeskud ;)");
    }


}

